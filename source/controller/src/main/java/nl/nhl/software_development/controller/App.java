package nl.nhl.software_development.controller;

import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.AMQP.BasicProperties;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Consumer;
import com.rabbitmq.client.DefaultConsumer;
import com.rabbitmq.client.Envelope;

import nl.nhl.software_development.controller.message.TestMessage.ExampleMessage;

/**
 * Hello world!
 *
 */
public class App
{
	private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
	private static final ZoneId UTC = ZoneId.of("Etc/UTC");
	private static final String SIMULATOR_QUEUE_NAME = "simulator.commands";
	private static App p;
	private static ConnectionFactory factory = new ConnectionFactory();
	private static Connection connection = null;

	private Channel channel;

	public static App instance()
	{
		return p;
	}

	public App() throws IOException
	{
		channel = connection.createChannel();
		channel.queueDeclare(SIMULATOR_QUEUE_NAME, false, false, false, null);
		channel.basicQos(1);
		Consumer consumer = new DefaultConsumer(channel)
		{
			@Override
			public void handleDelivery(String consumerTag, Envelope envelope, BasicProperties properties, byte[] body) throws IOException
			{
				// TODO: handle message here...
				ExampleMessage message = ExampleMessage.parseFrom(body);
				LOGGER.info("Got '{}' from '{}'", message.getPayload(), ZonedDateTime.ofInstant(Instant.ofEpochSecond(message.getTimestamp()), UTC));
			}
		};
		channel.basicConsume(SIMULATOR_QUEUE_NAME, false, consumer);
	}

	public static void main(String[] args)
	{
		factory.setHost("localhost");
		LOGGER.info("Started ".concat("Program"));
		try
		{
			connection = factory.newConnection();
			p = new App();
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
			System.exit(1);
		}
		ExampleMessage message = ExampleMessage.newBuilder().setTimestamp(ZonedDateTime.now(UTC).toEpochSecond()).setPayload("Hello World!").build();
		try
		{
			Channel testChannel = connection.createChannel();
			String correlationId = UUID.randomUUID().toString();
			AMQP.BasicProperties properties = new AMQP.BasicProperties.Builder().correlationId(correlationId).replyTo("controller.requests").build();
			testChannel.basicPublish("", SIMULATOR_QUEUE_NAME, properties, message.toByteArray());
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}
}
