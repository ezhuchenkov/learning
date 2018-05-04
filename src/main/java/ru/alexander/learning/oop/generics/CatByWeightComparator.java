package ru.alexander.learning.oop.generics;

import ru.alexander.learning.oop.Color;

import java.util.Comparator;

public class CatByWeightComparator implements Comparator<Cat> {

    @Override
    public int compare(Cat o1, Cat o2) {
        return Integer.compare(o1.weight, o2.weight);
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat(10, Color.BLACK);
        Cat cat2 = new Cat(8, Color.WHITE);
        CatByWeightComparator comparator = new CatByWeightComparator();
        System.out.println(comparator.compare(cat1, cat2));
    }

}

