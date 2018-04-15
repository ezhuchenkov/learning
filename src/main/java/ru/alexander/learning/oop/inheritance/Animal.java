package ru.alexander.learning.oop.inheritance;

public abstract class Animal {

    final String name;

    Animal(String name) {
        this.name = name;
    }

    abstract void say();

}
