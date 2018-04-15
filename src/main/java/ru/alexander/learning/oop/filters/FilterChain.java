package ru.alexander.learning.oop.filters;

public class FilterChain extends Filter {

    final Filter[] filters;

    FilterChain(Filter[] filters) {
        this.filters = filters;
    }

    @Override
    boolean pass(int value) {
        for (Filter filter : filters) {
            if (!filter.pass(value)) {
                return false;
            }
        }
        return true;
    }

}
