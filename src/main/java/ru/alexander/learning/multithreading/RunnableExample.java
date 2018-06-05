package ru.alexander.learning.multithreading;

public class RunnableExample {

    public static void main(String[] args) throws InterruptedException {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello world " + Thread.currentThread());
            }
        };
        Thread thread = new Thread(runnable);
        thread.setName("newthread");
//        thread.setDaemon(true);
        thread.start();

        thread.join(); //ждем завершения потока
        System.out.println("main() " + Thread.currentThread());


    }

}
