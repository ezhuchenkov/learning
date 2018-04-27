package ru.alexander.learning.homework;

public class RoboBattle {
    static int x1 = 10;
    static int x2 = 10;
    static int x3 = 11;
    static int x4 = 35;

    public static void main(String[] args) {
        recursion(x1, x3);
    }

    static void recursion(int x1, int x3) {
        if (x3 == x4 && (x3 - x1) < 15) {
            System.out.println("You lose");
        } else {
            if ((x3 - x1) > 15) {
                x1 = x2;
                x3 = x4;
                recursion(x1, x3);
            } else {
                System.out.println("You win!");
                System.out.println("Роботы уничтожены в промежутке между " + x1 + " и " + x3);
            }
        }
    }
}
