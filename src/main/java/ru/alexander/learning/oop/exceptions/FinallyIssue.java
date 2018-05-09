package ru.alexander.learning.oop.exceptions;

public class FinallyIssue {

    public static void main(String[] args) {
        try {
            throw new RuntimeException("exception 1");
        } finally {
            throw new RuntimeException("exception 2");
        }
    }

}
