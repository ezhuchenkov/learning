package ru.alexander.learning.primitives;

public class Recursion {

    public static void main(String[] args) {
        System.out.println(factIter(5));
        System.out.println(factRec(5));
    }

    //fact(5) = 1 * 2 * 3 * 4 * 5 = 120

    static int factIter(int x) {
        int result = 1;
        for (int i = 2; i <= x; i++) {
            result *= i;
        }
        return result;
    }

    //fact(5) = 1 * 2 * 3 * 4 * 5 = (1 * 2 * 3 * 4) * 5
    //fact(4) = 1 * 2 * 3 * 4
    //fact(5) = fact(4) * 5
    //fact(x) = if x > 1 :    fact(x - 1) * x,    x == 1 : fact = 1

    static int factRec(int x) {
        if (x == 1) {
            return 1;
        } else {
            return factRec(x - 1) * x;
        }
    }

}
