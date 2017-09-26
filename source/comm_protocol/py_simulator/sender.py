#!/usr/bin/env python

import pika
import model

connection = pika.BlockingConnection(pika.ConnectionParameters(model.host))
channel = connection.channel()

channel.exchange_declare(
	exchange=model.programma,
	exchange_type='direct'
)

channel.basic_publish (
	exchange=model.programma,
	routing_key=model.groepsnaam,
	body='Hallo Wereld!'
)

print('Msg sent.')

connection.close()
