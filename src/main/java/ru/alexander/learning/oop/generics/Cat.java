package ru.alexander.learning.oop.generics;

import ru.alexander.learning.oop.inheritance.Dog;

import java.util.Comparator;

public class Cat implements Comparable<Cat> {

    int weight;
    int color;

    Cat(int weight, int color) {
        this.weight = weight;
        this.color = color;
    }

    public int compareTo(Cat o) {
        int weightCompare = Integer.compare(weight, o.weight);
        if (weightCompare != 0) {
            return weightCompare;
        }
        return Integer.compare(color, o.color);
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat(10, 100500);
        Cat cat2 = new Cat(10, 100500);
        int result = cat1.compareTo(cat2);
        System.out.println(result);
    }

}
