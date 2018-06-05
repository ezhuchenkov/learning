package ru.alexander.learning.homework.streamapi.functional;

import java.util.function.UnaryOperator;

public class UnaryOperatorExmpl {
    public static void main(String[] args) {

        UnaryOperator<Integer> square = x -> x*x;
        System.out.println(square.apply(5)); // 25
    }
}
