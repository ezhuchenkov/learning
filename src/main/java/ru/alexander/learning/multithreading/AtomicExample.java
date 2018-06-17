package ru.alexander.learning.multithreading;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class AtomicExample {

    public static void main(String[] args) {
        //CAS = compare and set

        int value = 5;

        //start atomic
        if (value == 5) {
            value = 10;
        }
        //end atomic

        AtomicInteger atomicInt = new AtomicInteger(5);
        boolean wasSet = atomicInt.compareAndSet(5, 10);

        atomicInt.getAndIncrement();



        Object object1 = new Object();
        AtomicReference<Object> reference = new AtomicReference<>(object1);
        reference.compareAndSet(object1, new Object());

    }

}
