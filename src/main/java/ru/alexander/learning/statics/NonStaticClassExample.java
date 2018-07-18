package ru.alexander.learning.statics;

public class NonStaticClassExample {
    public String field;

    void print() {
        System.out.println("Hello, " + field);
    }

    public static void main(String[] args) {
        NonStaticClassExample example = new NonStaticClassExample();
        example.field = "abc";

        NonStaticClassExample example2 = new NonStaticClassExample();
        example2.field = "qwe";

        example.print();

        System.out.println(example.field);
        System.out.println(example2.field);
    }

}
