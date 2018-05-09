package ru.alexander.learning.oop.exceptions;

public class JavaExceptions {

    public static void main(String[] args) {
        Object obj = null;
        obj.hashCode();

        int i = 1 / 0;

        int[] arr = new int[2];
        arr[10] = 1;

        m1();
    }

    static void m1() {
        m1();
    }

}
