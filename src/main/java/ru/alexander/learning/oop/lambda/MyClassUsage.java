package ru.alexander.learning.oop.lambda;

public class MyClassUsage {

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
//        System.out.println(myClass.field);
        MyClass.InnerClass innerClass1 = myClass.new InnerClass();
        MyClass.InnerClass innerClass2 = myClass.new InnerClass();
//        MyClass.InnerClass innerClass = new MyClass.InnerClass();

        MyClass.NestedClass nestedClass = new MyClass.NestedClass();
    }

}
