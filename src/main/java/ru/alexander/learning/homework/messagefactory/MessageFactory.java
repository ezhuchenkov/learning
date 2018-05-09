package ru.alexander.learning.homework.messagefactory;

public class MessageFactory {

    Message createMessage(int maxValues) {
        if (maxValues <= 0) {
            throw new IllegalArgumentException();
        } else if (maxValues == 1) {
            return new MessageSingle();
        } else if (maxValues == 2) {
            return new MessageDouble();
        } else {
            return new MessageArr(maxValues);
        }
    }

    public static void main(String[] args) {
        MessageFactory factory = new MessageFactory();
        Message m1 = factory.createMessage(1);
        Message m2 = factory.createMessage(5);
    }
}
