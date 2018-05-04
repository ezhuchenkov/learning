package ru.alexander.learning.homework.fruitfactory;

public class StrawberryCreator extends Creator {

    @Override
    public Fruitable factoryMethod() {
        Fruits strawberry = Fruits.STRAWBERRY;
        return strawberry;
    }
}
