package ru.alexander.learning.oop.generics;

public interface Filter<T> {

    boolean pass(T value);

}
