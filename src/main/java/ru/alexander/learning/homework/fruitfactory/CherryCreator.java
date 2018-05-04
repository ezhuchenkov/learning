package ru.alexander.learning.homework.fruitfactory;

public class CherryCreator extends Creator {

    @Override
    public Fruitable factoryMethod() {
        Fruits cherry = Fruits.CHERRY;
        return cherry;
    }
}
