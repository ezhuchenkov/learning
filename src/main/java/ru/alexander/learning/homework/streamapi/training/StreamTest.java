package ru.alexander.learning.homework.streamapi.training;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static java.util.Arrays.asList;

public class StreamTest {
    public static void main(String[] args) {
        streamCube();
        intToStream();
        anyMatch();
        haveASquare();
    }

    public static void streamCube() {
        List<Integer> numbers = asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        numbers.stream().map(x -> x * x * x).forEach(System.out::println);
    }

    public static void intToStream() {
        Integer[][] ints = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int res = Arrays.stream(ints)
                .flatMap(Arrays::stream)
                .reduce(0, (acc, x) -> acc + x);
        System.out.println(res);
    }

    public static void anyMatch() {
        List<Integer> numbers = asList(1, 3, 7, 9);
        boolean b = numbers.stream().anyMatch(x -> x % 2 == 0);
        System.out.println(b);
    }

    public static void haveASquare() {
        List<Integer> numbers = asList(1, 6, 11);
        List<Integer> probableSquares = asList(1, 5, 36, 3, 6, 3, 121, 96, 9, 16);
        List<Integer> squares = new LinkedList<>();
        for (int n : numbers) {
            for (int p : probableSquares) {
                if (Math.sqrt(p) == (n)) {
                    squares.add(p);
                }
            }

        }
        System.out.println(squares);
    }


}
