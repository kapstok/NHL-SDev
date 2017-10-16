# NHL-SDN_Group

## Consuming messages

### Connection with the server
The applications should use the vhost with the same same as the id of the group. If the groupid is 7 the corresponding vhost is /7, during testing on localhost the username and password 'guest' and 'guest' can be used, for testing on a remote server the username and password 'softdev' and 'softdev' should be used. This user needs to be created in the management panel accessible in a browser on the url "http://${remote_host}:15672/"

### Communication
The Controller consumes messages from the 'controller' queue and responds via the 'simulator' queue. If the controller receives a message with a correlationId, the simulator MUST send the response with the same correlationId.

The Simulator consumes messages from the 'simulator' queue and sends requests via the 'controller' queue. the Simulator CAN add a correlationId to the message so it can know the response is meant for it.

##### Stale messages
It is possible that the Simulator gets old messages during startup, which got left behind by a previous Controller.
To make sure no messages get left behind in the queue when closing one of the applications, we can let RabbitMQ delete our queues when they are no longer in use. When using the [`queueDeclare`](http://www.rabbitmq.com/amqp-0-9-1-quickref.html#queue.declare) function (Java, C#) make sure to set the property [`auto-delete`](http://www.rabbitmq.com/amqp-0-9-1-reference.html#queue.declare.auto-delete) to `true`.

We also need to set a Time-To-Life (TTL) on the queue. More information about TTL can be found [here](https://www.rabbitmq.com/ttl.html). For Java this can be done using:
```java
Map<String, Object> args = new HashMap<String, Object>();
args.put("x-message-ttl", 10000);
channel.queueDeclare("myqueue", false, false, true, args);
```
And for .Net using:
```cs
var args = new Dictionary<string, object>();
args.Add("x-message-ttl", 10000);
model.QueueDeclare("myqueue", false, false, true, args);
```
Notice that the last argument of `queueDeclare` changed from `null` to a Map/Dictionary. The time is in ms, please set it to 10 seconds / 10 000 ms. For other languages the process should be similar.

*NOTE: When using `auto-delete=true` you won't be able to connect with someone using `auto-delete=false` and vice versa. Please all make sure you're setting it to `true`, this is also the case for TTL.*
