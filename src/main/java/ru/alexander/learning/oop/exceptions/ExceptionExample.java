package ru.alexander.learning.oop.exceptions;

public class ExceptionExample {

    public static void main(String[] args) {
        try {
            String result = readFromFile();
            System.out.println(result);
        } catch (MyFileNotFoundException e) {
            System.out.println("file not found");
        }
    }

    static String readFromFile() {
        if (true) {
            throw new MyFileNotFoundException();
        }
        return "abc";
    }

}
