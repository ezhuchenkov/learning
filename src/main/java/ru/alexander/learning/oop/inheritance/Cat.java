package ru.alexander.learning.oop.inheritance;

public class Cat extends Animal {

    int age;

    Cat(String name) {
        super(name);
    }

    @Override
    void say() {
        System.out.println(name + ": meow");
    }

    void eat() {
        System.out.println("eating");
    }

    public static void main(String[] args) {
        Animal animal1 = new Cat("masha");
        animal1.say();
        System.out.println(animal1.name);
    }

}
