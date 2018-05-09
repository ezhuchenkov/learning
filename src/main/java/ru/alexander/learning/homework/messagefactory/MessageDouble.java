package ru.alexander.learning.homework.messagefactory;

public class MessageDouble extends Message {
    Object object;
    Object object2;

    @Override
    Object getValue(int index) {
        checkIndex(index);
        return index == 0 ? object : object2;
    }

    @Override
    void setValue(Object value, int index) {
        checkIndex(index);
        if (index == 0) {
            object = value;
        } else {
            object2 = value;
        }
    }

    @Override
    int getMaxSize() {
        return 2;
    }
}

