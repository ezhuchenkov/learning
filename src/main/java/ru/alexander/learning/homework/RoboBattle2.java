package ru.alexander.learning.homework;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class RoboBattle2 {
    static int r = 3;
    static int t = 15;
    static LinkedList list = new LinkedList();

    public static void main(String[] args) {
        list.add(0, 10);
        list.add(1, 20);
        list.add(2, 32);
        list.add(3, 35);
//        list.add(4, 35);
        int first = (int) list.get(0);
        int check = (int) list.get(r - 1);
        recursion(first, check);
    }

    static void recursion(int first, int check) {
        System.out.println(first + " " + check);
        if (list.size() >= r) {
            if ((check - first) > t) {
                list.remove(0);
                first = (int) list.get(0);
                check = (int) list.get(r - 1);
                recursion(first, check);
            } else {
                System.out.println("You win!");
            }

        } else {
            System.out.println("You lose");
        }
    }
}
