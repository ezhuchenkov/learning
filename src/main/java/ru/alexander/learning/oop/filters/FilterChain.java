package ru.alexander.learning.oop.filters;

public class FilterChain implements Filter {

    final Filter[] filters;

    FilterChain(Filter[] filters) {
        this.filters = filters;
    }

   public boolean pass(int value) {
        for (Filter filter : filters) {
            if (!filter.pass(value)) {
                return false;
            }
        }
        return true;
    }

}
