package ru.alexander.learning.multithreading;

public class InterruptionExample {

    public static void main(String[] args) throws InterruptedException {
        Thread hello = new Thread(() -> {
            int i = 0;
            while (true) {
                if (i % 1000000 == 0) {
                    System.out.println("hello");
                    i++;
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    return;
                }
                if (Thread.interrupted()) {
                    return;
                }
            }
        });
        hello.start();
        Thread.sleep(1000);
        hello.interrupt();
        System.out.println("interrupt!");
    }

}
