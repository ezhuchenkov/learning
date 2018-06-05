package ru.alexander.learning.multithreading;

public class SynchronizedReentryExample {

    static final Object monitor = new Object();

    public static void main(String[] args) {
        synchronized (monitor) {
            synchronized (monitor) { //reentrancy
                System.out.println("hello");
            }
        }
    }

    static void m1() {
        synchronized (monitor) {
            System.out.println("m1");
            m2();
        }
    }

    static synchronized void m2() { //synchronized (SynchronizedReentryExample.class)
        System.out.println("m2");
    }

    synchronized void m3() { //synchronized (this)

    }



    static class A {
        synchronized void f() {
            System.out.println("hello");
        }
    }

    static class B extends A {
        @Override
        synchronized void f() {
            super.f();
            System.out.println("world");
        }
    }


}
