package ru.alexander.learning.oop.lambda;

public class FilterUsage {

    public static void main(String[] args) {

        Filter filter = new Filter() { //anonymous class
            @Override
            public boolean filter(int value) {
                return value > 0;
            }
        };
        boolean result = filter.filter(10);

        Filter filter2 = val -> val > 0;

    }

}
