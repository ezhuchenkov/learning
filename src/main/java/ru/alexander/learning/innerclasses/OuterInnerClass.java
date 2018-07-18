package ru.alexander.learning.innerclasses;

public class OuterInnerClass {

    String outerField;

    class InnerClass {

        void print() {
            System.out.println(outerField);
        }

    }

}
