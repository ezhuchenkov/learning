package ru.alexander.learning.oop.inheritance;
//A.m(), B.m() -> A,B - m() ?
public class Cat extends Animal implements Playable {

    int age;

    public Cat(String name) {
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

    public void play() {
        System.out.println("cat plays");
    }
}
