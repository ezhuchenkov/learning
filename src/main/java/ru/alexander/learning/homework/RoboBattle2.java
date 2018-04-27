package ru.alexander.learning.homework;


import java.util.LinkedList;

public class RoboBattle2 {
    static int r = 3;
    static int t = 15;
    static LinkedList list = new LinkedList();

    public static void main(String[] args) {
        list.add(0, 10);
        list.add(1, 10);
        list.add(2, 11);
        list.add(3, 21);
        list.add(4, 36);
        int first = (int) list.get(0);
        int check = (int) list.get(r - 1);
        recursion(first, check);
    }

    static void recursion(int first, int check) {
        if (list.size() >= r) {
            if ((check - first) > t) {
                list.remove(0);
                first = (int) list.get(0);
                recursion(first, check);
            } else {
                System.out.println("You win!");
            }

        } else {
            System.out.println("You lose");
        }
    }
}
