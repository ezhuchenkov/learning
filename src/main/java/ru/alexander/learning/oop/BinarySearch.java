package ru.alexander.learning.oop;

import java.util.Arrays;

public class BinarySearch {

    //1 2 4 4 5 8 9 10 11 16 16 17
    //search 11
    //[                          ]
    //            |
    //              [            ]
    //                     |
    //               [    ]

    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 4, 5, 8, 9, 10, 11, 16, 16, 17};
        System.out.println(indexOf(arr, 17));
    }

    static int indexOf(int[] arr, int value) {
        return indexOf(arr, value, 0, arr.length - 1);
    }

    static int indexOf(int[] arr, int value, int left, int right) {
        while (left <= right) {
            int mid = (right + left) / 2;
            if (value > arr[mid]) {
                return indexOf(arr, value, mid + 1, right);
            } else if (value < arr[mid]) {
                return indexOf(arr, value, left, mid - 1);
            } else {
                return mid;
            }
        }
        return -1;

    }
}
