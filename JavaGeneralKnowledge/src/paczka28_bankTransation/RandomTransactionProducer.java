package paczka28_bankTransation;

public class RandomTransactionProducer implements Runnable {
	
	private static String[] people = new String[] {"Alice", "Bob", "Charles"};
	
	private static int[] amounts = new int[] {100, 200, 500, 1000};
	
	public static Transaction create() {
		int person1 = random.nextInt(people.length);
		int person2 = random.nextInt(people.length);
		int amount = amounts[random.nextInt(amounts.length)];
		
		if(person1 == person2) {
			return Transaction.special(people[person1], amount);
		}else {
			return Transaction.regular(people[person1], people[person2], amount);
		}
		
	}
	
	
	@Override
	public void run() {

        Producer<String, String> producer = new Producer<String, String>(producerConfig);

        for (long nEvents = 0; nEvents < eventsToSend; nEvents++) {

            // sleep

            if (nEvents % 100 == 0)
                Sleep.millis(300);

            // random transaction JSON to send as message

            String msg = RandomTransactionGenerator.createJson();

            // BTW: when key is not given, Kafka does not use our partitioner

            KeyedMessage<String, String> data = new KeyedMessage<String, String>(topic, "transaction", msg);
            producer.send(data);
        }

        producer.close();
	}
}
