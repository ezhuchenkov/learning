package ru.alexander.learning.innerclasses;

public class InnerClassUser {

    public static void main(String[] args) {
        OuterInnerClass outerInnerClass = new OuterInnerClass();
        OuterInnerClass.InnerClass innerClass = outerInnerClass.new InnerClass();

    }

}
