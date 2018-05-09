package ru.alexander.learning.oop.exceptions;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        try {
            throw new Exception(); //checked
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
