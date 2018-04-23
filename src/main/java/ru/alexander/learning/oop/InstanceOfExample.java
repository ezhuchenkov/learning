package ru.alexander.learning.oop;

import ru.alexander.learning.oop.inheritance.Animal;
import ru.alexander.learning.oop.inheritance.Cat;

public class InstanceOfExample {

    public static void main(String[] args) {
        processAnimal(new Cat("masha"));
    }

    static void processAnimal(Animal animal) {
        //if (animal.getClass() == Cat.class) {
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.play();
        }
    }

}
