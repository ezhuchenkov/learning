package ru.alexander.learning.oop.inheritance;

public class Dog extends Animal {

    int weight;

    Dog(String name) {
        super(name);
    }

    @Override
    void say() {
        System.out.println("woof");
    }

    void play() {
        System.out.println("playing");
    }

}
