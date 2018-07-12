package ru.alexander.learning.oop.exceptions;

public class YetAnotherExceptionsExample {

    public static void main(String[] args) {
        try {
            doSmt();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    static void doSmt() throws Throwable {
        Throwable myException = new Exception();
        throw myException;
    }

}
