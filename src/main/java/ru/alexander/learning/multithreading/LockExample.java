package ru.alexander.learning.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class LockExample {

    public static void main(String[] args) {
        ReadWriteLock rwLock = new ReentrantReadWriteLock();
        Lock rLock = rwLock.readLock();
        Lock wLock = rwLock.writeLock();

        rLock.lock();
        try {
            //other can read
        } finally {
            rLock.unlock();
        }

    }

}
