package ru.alexander.learning.oop.filters;

public class PositiveFilter implements Filter {

    public boolean pass(int value) {
        return value > 0;
    }

}
