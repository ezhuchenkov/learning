package ru.alexander.learning.multithreading;

import java.util.Random;
import java.util.concurrent.*;

public class CompletableFutureExample {

    private static final Random r = new Random();

    public static void main(String[] args) {
        ExecutorService ex = Executors.newFixedThreadPool(2);
        //CompletableFuture : Runnable -> ExecutorService -> CompletableFuture


//        CompletableFuture<Void> cf1 = CompletableFuture.runAsync(() -> {
//            System.out.println("hello");
//        }, ex);

        CompletableFuture<Integer> cf1 = CompletableFuture.supplyAsync(() -> {
            return 1;
        }, ex);
        CompletableFuture<String> cf2 = CompletableFuture.supplyAsync(() -> {
            return "b";
        }, ex);

        CompletableFuture.anyOf(cf1, cf2)
                .thenAccept(System.out::println);


        CompletableFuture.supplyAsync(() -> "abc", ex)
                .thenApply(String::length)
                .thenAccept(System.out::println);
    }

    public static void main1(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService ex = Executors.newFixedThreadPool(2);
        Future<Integer> f1 = ex.submit(() -> {
            Thread.sleep(r.nextInt(1000));
            return 1;
        });
        Future<Integer> f2 = ex.submit(() -> {
            Thread.sleep(r.nextInt(1000));
            return 2;
        });
        /*
        while (true) {
            if (f1.isDone()) {
                System.out.println(f1.get());
                break;
            }
            if (f2.isDone()) {
                System.out.println(f2.get());
                break;
            }
        }
        */

        while (true) {
            try {
                System.out.println(f1.get(1, TimeUnit.MILLISECONDS));
                break;
            } catch (TimeoutException ignored) { }
            try {
                System.out.println(f2.get(1, TimeUnit.MILLISECONDS));
                break;
            } catch (TimeoutException ignored) { }
        }
    }


}
