package ru.alexander.learning.statics;

public class StaticClassExample {

    static String field;

    static void print() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        StaticClassExample.field = "abc";

        StaticClassExample.field = "qwe";

        StaticClassExample example = new StaticClassExample();
        example.field = "zxc";

        StaticClassExample.print();

        System.out.println(StaticClassExample.field);

    }

}
