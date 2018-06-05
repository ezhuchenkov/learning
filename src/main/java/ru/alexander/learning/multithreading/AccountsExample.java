package ru.alexander.learning.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AccountsExample {

    static final Random r = new Random();

    static class Account {
        final int id;
        int value;

        Account(int id) {
            this.id = id;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        List<Account> accounts = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Account account = new Account(i);
            account.value = 10_000;
            accounts.add(account);
        }

        Runnable task = () -> {
            for (int i = 0; i < 100000000; i++) {

                int fromIndex = r.nextInt(accounts.size());
                int toIndex = r.nextInt(accounts.size());
                int value = r.nextInt(10);
                if (fromIndex == toIndex) {
                    return;
                }
                Account from = accounts.get(fromIndex);
                Account to = accounts.get(toIndex);

                Account first = from.id > to.id ? from : to;
                Account second = from.id > to.id ? to : from;

                synchronized (first) {
                    synchronized (second) {
                        if (from.value < value) {
                            return;
                        }
                        from.value -= value;
                        to.value += value;
                    }
                }
            }
        };

        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 25; i++) {
            Thread thread = new Thread(task);
            threads.add(thread);
        }
        threads.forEach(Thread::start);

        for (Thread thread : threads) {
            thread.join();
        }

        for (Account account : accounts) {
            System.out.println(account.value);
        }
        int sum = accounts.stream().mapToInt(a -> a.value).sum();
        System.out.println(sum);

    }

}
