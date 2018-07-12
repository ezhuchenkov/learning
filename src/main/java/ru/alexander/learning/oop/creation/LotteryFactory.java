package ru.alexander.learning.oop.creation;

import java.util.Random;

public class LotteryFactory implements MoneyFactory {

    private final Random R = new Random();

    @Override
    public Money getMoney() {
        return new Money(
                R.nextBoolean() ? "usd" : "eur",
                R.nextInt(1000) + 1
        );
    }

}
