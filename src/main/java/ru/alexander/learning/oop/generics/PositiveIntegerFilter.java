package ru.alexander.learning.oop.generics;

public class PositiveIntegerFilter implements Filter<Integer> {

    public boolean pass(Integer value) {
        return value > 0;
    }

}
