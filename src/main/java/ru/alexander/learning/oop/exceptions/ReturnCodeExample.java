package ru.alexander.learning.oop.exceptions;

public class ReturnCodeExample {

    static final int OK = 0;
    static final int FILE_NOT_FOUND = 1;
    static final int NO_PERMITS = 2;

    public static void main(String[] args) {
        StringWrapper result = readFromFile();
        if (result.code == FILE_NOT_FOUND) {
            System.out.println("file not found");
            return;
        }
        if (result.code == NO_PERMITS) {
            System.out.println("no permissions");
            return;
        }
        System.out.println(result.result);
    }

    static StringWrapper readFromFile() {
        if (false) { //file not found
            return new StringWrapper(null, FILE_NOT_FOUND);
        }
        if (false) { //no permits
            return new StringWrapper(null, NO_PERMITS);
        }
        return new StringWrapper("abc", OK);
    }

}
