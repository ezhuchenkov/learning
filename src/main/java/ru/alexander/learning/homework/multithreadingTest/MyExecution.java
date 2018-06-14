package ru.alexander.learning.homework.multithreadingTest;

public class MyExecution {
    public static void main(String[] args) {
        MyExecutor myExecutor = new MyExecutor(5);
        myExecutor.submit();

    }
}
