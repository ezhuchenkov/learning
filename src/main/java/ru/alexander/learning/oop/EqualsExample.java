package ru.alexander.learning.oop;

public class EqualsExample {

    public static void main(String[] args) {
        int i1 = 10;
        int i2 = 20;
        System.out.println(i1 == i2);

        String s1 = "hello";
        String s21 = "hel";
        String s22 = "lo";
        String s2 = s21 + s22;
        String s3 = "hello";
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s3);

        Integer i3 = 10000;
        Integer i4 = 10000;
        System.out.println(i3 == i4);
    }

}
