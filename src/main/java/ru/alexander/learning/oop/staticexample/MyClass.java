package ru.alexander.learning.oop.staticexample;

import static java.lang.Math.max;
import static ru.alexander.learning.oop.staticexample.StringUtils.prettyPrint;

public class MyClass {

    final static int staticValue = 100;
    final int value;

    public MyClass(int value) {
        this.value = value;
    }

    void print() {
        System.out.println("my " + value + " / " + staticValue);
    }

    static void staticPrint() {
        System.out.println("static " + staticValue);
        //System.out.println(value);
    }

    public static void main(String[] args) {
        MyClass my1 = new MyClass(1);
        MyClass my2 = new MyClass(2);

        System.out.println(my1.value);
        my1.print();

        System.out.println(MyClass.staticValue);
        MyClass.staticPrint();

        my2 = null;
        my2.staticPrint(); //bad

        prettyPrint("hello");

        int max = max(1, max(2, 3));
    }

}
