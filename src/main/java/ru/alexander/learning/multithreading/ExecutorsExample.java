package ru.alexander.learning.multithreading;

import java.util.concurrent.*;

public class ExecutorsExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        /*
        new Thread(() -> {
            //...
            //return nothing
        }).start();
        */


        //Callable<> / Runnable -> ExecutorService -> Future<>

        System.out.println("start " + Thread.currentThread().getName());
        ExecutorService ex = Executors.newSingleThreadExecutor();
        //обычно переиспользует потоки, которые уже выполнили задачи
        Future<?> feature1 = ex.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello " + Thread.currentThread().getName());
            }
        });

        Future<Integer> ultimateAnswer = ex.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                throw new RuntimeException("aaaaa");
                //return 42;
            }
        });

        feature1.isDone(); //non blocking
        feature1.get(); //blocking
        Integer answer = ultimateAnswer.get();
        System.out.println(answer);

        ultimateAnswer.get(10, TimeUnit.SECONDS);

    }

}
