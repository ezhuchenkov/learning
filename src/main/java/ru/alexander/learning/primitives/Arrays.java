package ru.alexander.learning.primitives;

public class Arrays {

    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int elem : arr) { //foreach
            System.out.println(elem);
        }
    }

    public static void main1(String[] args) {
        int[] arr = {1, 2, 3};
        int[] arr2 = new int[] { 1, 2, 3};
        int[] arr3 = new int[5];
        int x = arr[0]; //index from zero

        arr[1] = 22;

        System.out.println(arr.length);
        //arr.length = 10;

        //System.out.println(arr[10]);

        long lo = x;

        //long[] longArr = arr;
    }

}
