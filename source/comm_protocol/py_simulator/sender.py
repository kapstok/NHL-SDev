#!/usr/bin/env python

import pika
import model

connection = pika.BlockingConnection(pika.ConnectionParameters(host=model.host, virtual_host=model.vhost))
channel = connection.channel()

channel.exchange_declare(
	exchange='1234',
	exchange_type='direct'
)

channel.basic_publish (
	exchange='1234',
	routing_key=model.shard,
	body='Hallo Wereld!'
)

print('Msg sent.')

connection.close()
