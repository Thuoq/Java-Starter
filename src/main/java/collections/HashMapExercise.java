package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class HashMapExercise {
    // main
    public static void main(String[] args) {
        Map<String, Integer> stockPrice = new HashMap<>();

        stockPrice.put("Oracle", 56);
        stockPrice.put("Fiserv", 117);
        stockPrice.put("BMW", 73);
        stockPrice.put("Microsoft", 213);
        stockPrice.put("Google", 421);
        stockPrice.put("Ford", 456);
        stockPrice.put("Novartis", 43);
        stockPrice.put("TCS", 23);
        // Find the highest stock price by forEach
        final int[] max = {0};
        final String[] maxKey = {""};
        stockPrice.forEach((key,value) -> {
            if(value > max[0]) {
                max[0] = value;
                maxKey[0] = key;
            }
        });
        System.out.println("Highest stock price is: " + max[0] + " of " + maxKey[0]);

        // AVG
        AtomicInteger sum = new AtomicInteger();
        AtomicInteger length = new AtomicInteger();
        stockPrice.forEach((key,value) -> {
            sum.addAndGet(value);
            length.getAndIncrement();
        });
        System.out.println("Average stock price is: " + sum.get() / length.get());
        //  Remove companies with stock price below 50#
        stockPrice.entrySet().removeIf(entry -> entry.getValue() < 50);
        System.out.println(stockPrice);

    }
}
