package ru.alexander.learning.oop.inheritance;

public class DogsAndCats {

    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("masha"),
                new Dog("rex")
        };

        for (Animal animal : animals) {
            animal.say();
            System.out.println(animal.name);
        }
    }

}
