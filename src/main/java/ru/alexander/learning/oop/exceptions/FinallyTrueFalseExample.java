package ru.alexander.learning.oop.exceptions;

public class FinallyTrueFalseExample {

    public static void main(String[] args) {
        System.out.println(getBool());
    }

    static boolean getBool() {
        try {
            return true;
        } finally {
            return false;
        }
    }

}
