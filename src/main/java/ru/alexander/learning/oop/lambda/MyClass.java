package ru.alexander.learning.oop.lambda;

public class MyClass {

    //private
    //public
    //protected
    //_

    private String field;


    public class InnerClass {
        public void print() {
            System.out.println(field); //closure
        }
    }

    public static class NestedClass {
        public void print() {
//            System.out.println(field);
        }
    }


}
