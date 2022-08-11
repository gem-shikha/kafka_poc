# kafka_poc

Steps -

Start zookeeper server-
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

Start kafka server-
.\bin\windows\kafka-server-start.bat .\config\server.properties

Create topic-
.\bin\windows\kafka-topics.bat --create --topic <topic name> --bootstrap-server localhost:9092   (working)

Produce the msg-
.\bin\windows\kafka-console-producer.sh --topic <topic name> --bootstrap-server localhost:9092

Consumer the msg-
.\bin\windows\kafka-console-consumer.bat --topic <topic name> --from-beginning --bootstrap-server localhost:9092
