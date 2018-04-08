package ru.alexander.learning.homework;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindUnpairedInAarray {


    public static void main(String[] args) {
        int[] arr = {1, 6, 7, 1, 6}; //0^1^6^7^1^6 = 0^0^0^7 = 7
        int result = 0;
        for (int elem : arr) {
            result ^= elem;
        }
        System.out.println(result);
    }

    public static void main1(String[] args) {
        int[] arr = {1, 6, 7, 1, 6};
        int a = Array.getLength(arr);
        boolean[] arr2 = new boolean[a];
        for (int i = 0; i < arr.length - 1; ++i) {
            for (int j = 1; j < arr.length; j++) {
                if (i == j) {
                    continue;
                }
                if (arr[i] != arr[j]) {
                    continue;
                } else
                    arr2[i] = true;
                arr2[j] = true;

                System.out.println(i + " элемент массива равен " + j + " элементу массива");
                break;

            }


        }
        for (int i = 0; i < arr2.length - 1; i++) {
            if (arr2[i]) {
                continue;
            } else
                System.out.println("А аот и наш элемент без пары: " + i);
        }
    }

}



  /*  public static void main(String[] args) {
        int[] arr = { 1, 6, 7, 1, 6};
        boolean hasPair=true;
        while (hasPair) {
            hasPair = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] == arr[arr.length-1]) {

        //составить алгоритм, который найдет число, не имеющее пары
    }

}
*/