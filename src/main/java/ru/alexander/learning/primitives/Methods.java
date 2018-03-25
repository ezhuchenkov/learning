package ru.alexander.learning.primitives;

public class Methods {

    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int c = plus(x, y);
        double d = plus(x, y);
        plus(x, y);
        System.out.println(x);
        prettyPrint(c);
    }

    static int plus(int a, int b) {
        return a + b;
    }

//    static double plus(int a, int b) {
//        return a + b + 0.0;
//    }

    static double plus(double a, double b) {
        return a + b;
    }

    static int plus(int a, int b, int c) { //overload = two methods with same name
        return a + b + c;
    }

    static void prettyPrint(int x) { //void = no return
        System.out.println("--=="  + x + "==--");
    }

}
