package ru.alexander.learning.homework;

public class Swap {

    public static void main(String[] args) {
        //x xor x = 0
        //x xor 0 = x
        int a = 5;
        int b = 10;
        int x = a;
        int y = b;

        x ^= y; //x == a^b, y = b
        y ^= x; //x == a^b, b = b^(a^b) = a
        x ^= y; //x == a^b^a = b, y = a

        System.out.println(x);
        System.out.println(y);

    }


}
