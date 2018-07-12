package ru.alexander.learning.oop.creation;

public class Money {

    public final String currency;
    public final int value;

    public Money(String currency, int value) {
        this.currency = currency;
        this.value = value;
    }

    public static Money create(String currency, int value) {
        return new Money(currency, value);
    }

}
