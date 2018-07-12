package ru.alexander.learning.oop.creation;

public class MoneyUsage {

    public static void main(String[] args) {
        Money eur = new Money("eur", 100);
        Money usd = Money.create("usd", 500);

        MoneyFactory factory = new LotteryFactory();
        Money randomMoney = factory.getMoney();
    }

}
