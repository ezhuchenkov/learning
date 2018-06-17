package ru.alexander.learning.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadLocalExample {

    public static void main(String[] args) {
        ThreadLocal<String> threadLocal = new ThreadLocal<>();

        ExecutorService ex = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 5; i++) {
            ex.submit(() -> {
                System.out.println(threadLocal.get());
                threadLocal.set(Thread.currentThread().getName());
            });
        }
    }

}
