package ru.alexander.learning.homework.StreamAPITest.FunctionalInterfaces;

import java.util.function.Consumer;

public class ConsumerExmpl {
    public static void main(String[] args) {

        Consumer<Integer> printer = x-> System.out.printf("%d долларов \n", x);
        printer.accept(600); // 600 долларов
    }
}
