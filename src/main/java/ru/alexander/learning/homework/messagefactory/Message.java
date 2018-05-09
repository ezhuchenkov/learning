package ru.alexander.learning.homework.messagefactory;

public abstract class Message {

    abstract Object getValue(int index);

    abstract void setValue(Object value, int index);

    abstract int getMaxSize();

    void checkIndex(int index) {
        if (index < 0 || index >= getMaxSize()) {
            throw new IllegalArgumentException();
        }
    }

}
