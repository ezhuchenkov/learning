package ru.alexander.learning.primitives;

public class Loops {

    public static void main(String[] args) {
        iterate();
    }

    static void iterate() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("i = " + i + " j = " + j + " * = " + (i * j));
                if (i * j > 50) {
                    return;
                }
            }
        }
    }

    public static void main4(String[] args) {
        label123:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("i = " + i + " j = " + j + " * = " + (i * j));
                if (i * j > 50) {
                    break label123;
                }
            }
        }
    }

    public static void main3(String[] args) {

        boolean shouldBreak = false;

        for (int i = 0; i < 10; i++) {

            if (shouldBreak) {
                break;
            }

            for (int j = 0; j < 10; j++) {
                System.out.println("i = " + i + " j = " + j + " * = " + (i * j));
                if (i * j > 50) {
                    shouldBreak = true;
                    break; //inner only
                }
            }
        }
    }

    public static void main2(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            if (i == 7) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("finished");
    }

    public static void main1(String[] args) {
        int i = 5;
        while (i < 10) {
            System.out.println(i);
            i++; //i = i + 1; //i += 1;
        }

        int j = 15;
        do {
            System.out.println(j);
            j++;
        } while (j < 10);

        for (int k = 0; k < 10; k++) {
            System.out.println(k);
        }

    }

}
