package ru.job4j.queue;

import java.util.Queue;

public class AppleStore {

    private final Queue<Customer> queue;

    private final int count;

    public AppleStore(Queue<Customer> queue, int count) {
        this.queue = queue;
        this.count = count;
    }

    public String getLastHappyCustomer() {
        String lastCustomer = "";
        for (int i = 0; i < count; i++) {
            lastCustomer = queue.poll().name();
        }
        return lastCustomer;
    }

    public String getFirstUpsetCustomer() {
        String upsetCustomer = "";
        for (int i = 0; i < count + 1; i++) {
            upsetCustomer = queue.poll().name();
        }
        return upsetCustomer;
    }
}