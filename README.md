# NHL-SDN_Group

## Consuming messages

### Connection with the server
The applications should use the vhost with the same same as the id of the group. If the groupid is 7 the corresponding vhost is /7, during testing on localhost the username and password 'guest' and 'guest' can be used, for testing on a remote server the username and password 'softdev' and 'softdev' should be used. This user needs to be created in the management panel accessible in a browser on the url "http://${remote_host}:15672/"

### Communication
The Controller consumes messages from the 'controller' queue and responds via the 'simulator' queue. If the controller receives a message with a correlationId, the simulator MUST send the response with the same correlationId.

The Simulator consumes messages from the 'simulator' queue and sends requests via the 'controller' queue. the Simulator CAN add a correlationId to the message so it can know the response is meant for it.

##### Stale messages
It is possible that the Simulator gets stale messages during startup, this can be remedied by setting a ttl on the messages to be send, setting the queue to be automatically deleted, setting a correlationId on the messages or just consume all the messages during startup so no stale messages are left. Other solutions are also possible. Which solution is used is left to the discretion of the developer.
