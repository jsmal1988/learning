package threads.examples;

import java.time.Duration;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class NaiveConsumerProducer {
    private static final Random generator = new Random();
    private static final Queue<String> queue = new LinkedList<>();

    public static void main(String[] args) {
        int itemCount = 5;
        Thread producer = new Thread(() -> {
            for (int i = 0; i < itemCount; i++) {
                try {
                    Thread.sleep(Duration.ofSeconds(generator.nextInt(5)).toMillis());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (queue) {
                    queue.add("Item no. " + i);
                }
            }
        });
        Thread consumer = new Thread(() -> {
            int itemsLeft = itemCount;
            int counter = 0;
            while (itemsLeft > 0) {
                String item;
                counter++;
                synchronized (queue) {
                    if (queue.isEmpty()) {
                        continue;
                    }
                    item = queue.poll();
                }
                itemsLeft--;
                System.out.println("Consumer got item: " + item);
            }
            System.out.println(counter);
        });

        consumer.start();
        producer.start();
    }
}