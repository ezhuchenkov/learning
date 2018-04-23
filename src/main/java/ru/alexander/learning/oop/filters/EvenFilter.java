package ru.alexander.learning.oop.filters;

public class EvenFilter implements Filter {

    public boolean pass(int value) {
        return value % 2 == 0;
    }

}
