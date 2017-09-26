#!/usr/bin/env python

import pika
import model

connection = pika.BlockingConnection(pika.ConnectionParameters(host=model.host))
channel = connection.channel()

channel.exchange_declare(
	exchange=model.programma,
	exchange_type='direct'
)

result = channel.queue_declare(exclusive=True)
queuename = result.method.queue

channel.queue_bind(
	exchange=model.programma,
	queue=queuename,
	routing_key=model.groepsnaam
)

def callback(ch, method, prop, body):
	print('%r ontvangen' % body)

channel.basic_consume (
	callback,
	queue=queuename,
	no_ack=True
)

print('Waiting for a sign..')
channel.start_consuming()
