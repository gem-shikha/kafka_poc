# kafka_poc

Steps -

Start zookeeper server-
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

Start kafka server-
.\bin\windows\kafka-server-start.bat .\config\server.properties

create topic-
.\bin\windows\kafka-topics.bat --create --topic quickstart-events(topic name) --bootstrap-server localhost:9092   (working)

produce the msg from the cmd-
.\bin\windows\kafka-console-producer.sh --topic quickstart-events --bootstrap-server localhost:9092


read the msg from the consumer-
.\bin\windows\kafka-console-consumer.bat --topic quickstart-events --from-beginning --bootstrap-server localhost:9092
