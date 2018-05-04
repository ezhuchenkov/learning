package ru.alexander.learning.oop.collections;

import java.util.Random;

public class MyKey {

    static final Random random = new Random();
    static int counter = 0;

    final String line;
    final int hashCode;

    public MyKey(String line) {
        this.line = line;
        this.hashCode = counter++;
    }

    @Override
    public int hashCode() {
        //return line.length();
        //return random.nextInt(2);
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj instanceof MyKey) {
            MyKey other = (MyKey) obj;
            return line.equals(other.line);
        } else {
            return false;
        }
    }
}
