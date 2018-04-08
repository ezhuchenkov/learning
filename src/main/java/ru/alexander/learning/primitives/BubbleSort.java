package ru.alexander.learning.primitives;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {7, 1, 9, 5, 3, 8};
        sort(arr);
    }
    //> < =

    //7 1 9 5 3 8
    //1 7 5 3 8 9
    //1 5 3 7 8 9
    //1 3 5 7 8 9
    //1 3 5 7 8 9

    static void sort(int[] arr) { //memory: O(n) - linear
        //O(n^2)
        //устойчивость:   1(a)  2(b)  1(c) -> 1(a) 1(c) 2(b)
        //                                 -> 1(c) 1(a) 2(b)
        boolean hasChanged = true;
        while (hasChanged) {
            hasChanged = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    hasChanged = true;
                }
            }
        }
    }


}
