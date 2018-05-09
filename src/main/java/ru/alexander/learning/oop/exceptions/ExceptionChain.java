package ru.alexander.learning.oop.exceptions;

public class ExceptionChain {

    public static void main(String[] args) {
        m1();
    }

    static void m1() {
        try {
            m2();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    static void m2() throws Exception {
        throw new Exception();
    }

}
