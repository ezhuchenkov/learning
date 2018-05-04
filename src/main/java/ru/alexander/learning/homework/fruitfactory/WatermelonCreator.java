package ru.alexander.learning.homework.fruitfactory;

public class WatermelonCreator extends Creator {

    @Override
    public Fruitable factoryMethod() {
        Fruits watermelon = Fruits.WATERMELON;
        return watermelon;
    }
}
