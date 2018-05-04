package ru.alexander.learning.homework.fruitfactory;

public class BlackberryCreator extends Creator {

    @Override
    public Fruitable factoryMethod() {
        Fruits blackberry = Fruits.BLACKBERRY;
        return blackberry;
    }
}
