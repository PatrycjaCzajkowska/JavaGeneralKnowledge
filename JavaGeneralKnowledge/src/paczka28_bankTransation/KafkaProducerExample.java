package paczka28_bankTransation;

import java.util.Properties;

public class KafkaProducerExample {
	
	
	public static void start(int numberOfTransactions) {
		Runnable producer = new RandomTransactionProducer(numberOfTransactions,
				Conf.inputTopic, producerConfig());
		new Thread(producer).start();
	}
	
	private static ProducerConfig producerConfig() {
	    Properties props = new Properties();
	    props.put("metadata.broker.list", Conf.brokerList);
	    props.put("serializer.class", StringEncoder.class.getName());
	    props.put("partitioner.class", VerbosePartitioner.class.getName());
	    props.put("request.required.acks", "1");
	    return new ProducerConfig(props);
	}

	public static void main(String... args) {
		
		start(3000);
		
		

	}

}
