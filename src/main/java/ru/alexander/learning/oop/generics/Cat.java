package ru.alexander.learning.oop.generics;

import ru.alexander.learning.oop.Color;

public class Cat implements Comparable<Cat> {

    int weight;
    Color color;

    Cat(int weight, Color color) {
        this.weight = weight;
        this.color = color;
    }

    public int compareTo(Cat o) {
        int weightCompare = Integer.compare(weight, o.weight);
        return weightCompare;
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat(10, Color.WHITE);
        Cat cat2 = new Cat(10, Color.BLACK);
        int result = cat1.compareTo(cat2);
        System.out.println(result);
    }

}
