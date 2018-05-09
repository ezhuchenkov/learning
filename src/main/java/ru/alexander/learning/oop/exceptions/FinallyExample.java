package ru.alexander.learning.oop.exceptions;

public class FinallyExample {

    public static void main(String[] args) {
        try {
            if (true) {
                throw new RuntimeException();
            }
        } catch (Throwable e) {
            System.out.println("caught exception");
        } finally {
            System.out.println("finally");
        }
        System.out.println("after");
    }

}
