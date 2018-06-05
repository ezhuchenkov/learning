package ru.alexander.learning.multithreading;

public class WaitNotifyExample {

    static final Object monitor = new Object();
    static boolean shouldWakeUp = false;

    public static void main(String[] args) {

        new Thread(() -> {
            synchronized (monitor) {
                System.out.println("waiting");
                while (!shouldWakeUp) {
                    try {
                        monitor.wait(); //release monitor, get into wait set
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("finished");
            }
        }).start();

        new Thread(() -> {
            synchronized (monitor) {

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("notifying");
                monitor.notify(); //not fair -> random
                shouldWakeUp = true;
            }
        }).start();

    }


}
