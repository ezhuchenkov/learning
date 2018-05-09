package ru.alexander.learning.homework.messagefactory;

public class MessageSingle extends Message {
    Object object;

    @Override
    Object getValue(int index) {
        checkIndex(index);
        return object;
    }

    @Override
    void setValue(Object value, int index) {
        checkIndex(index);
        object = value;
    }

    @Override
    int getMaxSize() {
        return 1;
    }

}
