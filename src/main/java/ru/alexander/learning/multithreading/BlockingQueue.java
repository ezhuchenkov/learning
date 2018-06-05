package ru.alexander.learning.multithreading;

import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue {

    private final int capacity;
    private final Queue<Object> queue = new LinkedList<>();

    public BlockingQueue(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void add(Object o) throws InterruptedException {
        while (queue.size() >= capacity) {
            wait();
        }
        queue.add(o);
        notifyAll();
    }

    public synchronized Object get() throws InterruptedException {
        while (queue.isEmpty()) {
            wait();
        }
        Object result = queue.poll();
        notifyAll();
        return result;
    }


}
