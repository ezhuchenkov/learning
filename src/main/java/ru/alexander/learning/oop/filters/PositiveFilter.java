package ru.alexander.learning.oop.filters;

public class PositiveFilter extends Filter {

    @Override
    boolean pass(int value) {
        return value > 0;
    }

}
