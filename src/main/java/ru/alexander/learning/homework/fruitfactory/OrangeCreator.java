package ru.alexander.learning.homework.fruitfactory;

public class OrangeCreator extends Creator {

    @Override
    public Fruitable factoryMethod() {
        Fruits orange = Fruits.ORANGE;
        return orange;
    }
}
