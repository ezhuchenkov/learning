package ru.alexander.learning.multithreading;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorExample {

    public static void main(String[] args) {
        ScheduledExecutorService ex = Executors.newScheduledThreadPool(5);
        ex.scheduleAtFixedRate(
                () -> {
                    try {
                        System.out.println("hello");
                        throw new RuntimeException("aaa");
                    } catch (Throwable e) {
                        //log
                    }
                },
                2,
                3,
                TimeUnit.SECONDS
        );
    }

}
