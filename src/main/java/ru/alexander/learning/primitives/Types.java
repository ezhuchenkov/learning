package ru.alexander.learning.primitives;

public class Types {

    public static void main(String[] args) { //psvm
        //sout
        System.out.println("hello world");

        int i; //definiition
        i = 10; //assign
        System.out.println(i);

        //signed
        byte b; // [-128; 127]  1 byte = 8 bit = 2^8 = 256
        short sh; //2^16
        int j; //2^32
        long l; //2^64

        char c = 'a'; //2 byte

        float f;
        double d;
        d = 3.14;

        //0 101 = + 1 * 2^2 + 0 * 2^1 + 1 * 2^0 = +5
        // 0111
        // + 01
        // 1000

        boolean bo = false;

        int a = 10;

        a = 10 + 20; //binary operator
        a += 20; //a = a + 20;

        a = 5;
        a = 5 / 2; //2.5 -> 2;   3.99 -> 3
        System.out.println(a); //2



        int a1 = 10;
        long a2 = a1; //autocasting

        long a3 = Integer.MAX_VALUE + 10L;
        int a4 = (int) a3; //manual casting
        System.out.println(a4);

        double a5 = a3;
        a3 = (long) a5;

        boolean b1 = true & false; //and, or, xor


    }

}
