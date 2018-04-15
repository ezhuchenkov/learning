package ru.alexander.learning.oop.filters;

public class EvenFilter extends Filter {

    @Override
    boolean pass(int value) {
        return value % 2 == 0;
    }

}
