# NHL-SDN_Group

## Consuming messages

### Connection with the server
The applications should use the vhost with the same same as the id of the group. If the groupid is 7 the corresponding vhost is /7, during testing on localhost the username and password 'guest' and 'guest' can be used, for testing on a remote server the username and password 'softdev' and 'softdev' should be used. This user needs to be created in the management panel accessible in a browser on the url "http://${remote_host}:15672/"

### Communication
The Controller consumes messages from the 'controller' queue and responds via the 'simulator' queue. If the controller receives a message with a correlationId, the simulator MUST send the response with the same correlationId.

The Simulator consumes messages from the 'simulator' queue and sends requests via the 'controller' queue. the Simulator CAN add a correlationId to the message so it can know the response is meant for it.

##### Stale messages
It is possible that the Simulator gets old messages during startup, which got left behind by a previous Controller.
To make sure no messages get left behind in the queue when closing one of the applications, we can let RabbitMQ delete our queues when they are no longer in use. When using the [`queueDeclare`](http://www.rabbitmq.com/amqp-0-9-1-quickref.html#queue.declare) function (Java, C#) make sure to set the property [`auto-delete`](http://www.rabbitmq.com/amqp-0-9-1-reference.html#queue.declare.auto-delete) to `true`. This will delete the queue when all connections to it are closed, and thus makes sure no messages get left behind.

*NOTE: When using `auto-delete=true` you won't be able to connect with someone using `auto-delete=false` and vice versa. Please all make sure you're setting it to `true`*
