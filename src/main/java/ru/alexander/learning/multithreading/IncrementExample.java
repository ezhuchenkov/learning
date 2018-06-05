package ru.alexander.learning.multithreading;

public class IncrementExample {

    static int counter = 0;
    static final Object monitor = new Object();

    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> {
            for (int i = 0; i < 1_000_000_000; i++) {
                synchronized (monitor) {
                    counter++;
                }
            }
        };
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(counter); //2_000_000_000
    }
    /*
    10++
    read: 10
    10+1 = 11
    write: 11

    t1  r:0         w:1 r:1 w:2 r:2 w:3
    t2  r:0 w:1 r:1                     w:2

    t1  r:0 ...            w:1     r:1 .... w:999
    t2  r:0 w:1 .... w:998     r:1                w:2

    */


}
