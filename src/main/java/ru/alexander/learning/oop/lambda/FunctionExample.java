package ru.alexander.learning.oop.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionExample {

    public static void main(String[] args) {
        printStringInt("abc", s -> s.length());
        printStringInt("def", s -> {
            int result = 10;
            return result;
        });

        printSmt(() -> "qwer");
        printBiFunc("hello", 5, (s, i) -> {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < i; j++) {
                sb.append(s);
            }
            return sb.toString();
        });
        printBiFunc("hello", 5, (s, i) -> s + i);
        printBiFunc("hello", 5, new BiFunction<String, Integer, String>() {
            @Override
            public String apply(String s, Integer i) {
                return s + i;
            }
        });
    }

    static void printStringInt(String s, Function<String, Integer> func) {
        System.out.println(s + " " + func.apply(s));
    }

    static void printSmt(Supplier<String> supplier) {
        System.out.println(supplier.get());
    }

    static void printBiFunc(String s, Integer i, BiFunction<String, Integer, String> biFunction) {
        System.out.println(biFunction.apply(s, i));
    }

}
