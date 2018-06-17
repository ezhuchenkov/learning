package ru.alexander.learning.homework.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RetryExecutor {

    private final ExecutorService ex = Executors.newFixedThreadPool(2);
    private final int maxTryNumber;

    public RetryExecutor(int maxTryNumber) {
        this.maxTryNumber = maxTryNumber;
    }

    public void submit(Runnable task) {
        submit(task, 1);
    }

    private void submit(Runnable task, int tryNumber) {
        if (tryNumber > maxTryNumber) {
            return;
        }
        ex.submit(() -> {
            try {
                task.run();
            } catch (Throwable e) {
                submit(task, tryNumber + 1);
            }
        });
    }

}
