package ru.alexander.learning.oop.filters;

public class FilterExample {

    public static void main(String[] args) {
        Filter filter = new FilterChain(new Filter[] {
                new EvenFilter(),
                new PositiveFilter()
        });
        System.out.println(filter.pass(5));
        System.out.println(filter.pass(6));
        System.out.println(filter.pass(-2));
    }

}
