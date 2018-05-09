package ru.alexander.learning.homework.messagefactory;

public class MessageArr extends Message {

    final Object[] arr;

    public MessageArr(int size) {
        this.arr = new Object[size];
    }

    @Override
    Object getValue(int index) {
        checkIndex(index);
        return arr[index];
    }

    @Override
    void setValue(Object value, int index) {
        checkIndex(index);
        arr[index] = value;
    }

    @Override
    int getMaxSize() {
        return arr.length;
    }

}
