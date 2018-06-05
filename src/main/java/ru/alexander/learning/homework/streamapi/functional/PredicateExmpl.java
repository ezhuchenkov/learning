package ru.alexander.learning.homework.streamapi.functional;

import java.util.function.Predicate;

public class PredicateExmpl {

        public static void main(String[] args) {

            Predicate<Integer> isPositive = x -> x > 0;

            System.out.println(isPositive.test(5)); // true
            System.out.println(isPositive.test(-7)); // false
        }


        static class MyPredicate implements Predicate<Integer> {
            @Override
            public boolean test(Integer integer) {
                return integer > 0;
            }
        }
    }

