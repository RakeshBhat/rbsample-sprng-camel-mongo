# Description
> Another rb sample showing working of Apache Camel with RabbitMQ and MongoDB3.
> I used Rabbit MQ Web UI to publish the message, and after receiving the message by RabbitMQ 
> Consumer the Camel Router routes the message to MongoDB3.
> Had to convert the message/exchange body to String before routing body to mongodb.

## Installing Mongodb
https://docs.mongodb.com/v3.2/tutorial/install-mongodb-on-windows/

## Starting Mongo
"C:\Program Files\MongoDB\Server\<version>\bin\mongod.exe" --dbpath c:\mongo\datadb

## Starting Mongo Client
> Use the Mongo Client to validate the saved message.
> $ ./mongo
> MongoDB shell version v3.6.3
> connecting to: mongodb://127.0.0.1:27017
> MongoDB server version: 3.6.3
> use userdb
> switched to db userdb
> db.user.find()


## Installing RabbitMQ
> https://www.rabbitmq.com/install-windows.html

## Starting RabbitMQ
- command to enable Rabbit MQ Web UI
> rabbitmq-plugins.bat enable rabbitmq_management
- Admin Web UI Link
> http://localhost:15672/#/
- Admin commands to check status
> rabbitmqctl status
> rabbitmqctl stop *

# Sample JSON User message
{
    "age": 29,
    "eyeColor": "black",
    "name": "Vicki Slat",
    "gender": "female",
    "company": "DIGIPRINT",
    "email": "vickislat@digiprint.com",
    "phone": "+1 (830) 546-2276",
    "address": "681 Meadow Street, Watrous, New Mexico, 8627"
  }

# Resources
https://www.baeldung.com/apache-camel-spring-boot
https://dzone.com/articles/apache-camel-mongodb-component-example
https://docs.mongodb.com/v3.2/tutorial/install-mongodb-on-windows/
http://api.mongodb.com/java/2.10.1/com/mongodb/MongoClient.html
https://github.com/apache/camel/blob/master/components/camel-mongodb3/src/main/docs/mongodb3-component.adoc
http://camel.apache.org/mongodb.html
https://www.rabbitmq.com/install-windows.html
