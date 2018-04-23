package ru.alexander.learning.homework;

import java.util.ArrayList;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {100, 14, 7, 3, 9, 13, 26, 2, 78, 45, 12, 2, 6};
        int[] sorted = quicksort(arr);
    }

//    static void quicksort(int[] arr, int left, int end) {
//        if (arr.length == 0)
//            return;
//        while (left <= end) {
//            int baseElem = (end + left) / 2; //получаем базовый элемент
//            for (int i = 0; i < arr.length; i++) { //проходим по всему массиву для сравнения значений
//                if (arr[i] < arr[baseElem]) { //если значение i элеменета массива меньше значения базового элемента
//                    if (i < baseElem) {
//                        continue; // если он и так левее базового, ничего не делаем
//                    } else { //если он  правее базового, переносим его левее
//                        int temp = arr[left];
//                        // TODO: 21.04.2018
//                    }
//                }else {
//if (i>baseElem) {
//    continue;
//}else {
//
//}
//
//                    }
//                }
//            }
//
//        }

    static void quicksort1(int[] arr, int left, int end) {
        if (arr.length == 0)
            return;
        while (left <= end) {
            int baseElem = (end + left) / 2;
            for (int i = left; i < baseElem; i++) {
                for (int j = baseElem + 1; j <= end; j++) {
                    if (arr[i] > arr[baseElem]) {
                        if (arr[j] < arr[baseElem]) {
                            int temp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = temp;
                            break;
                        }
                    }
                }
            }
            quicksort1(arr, baseElem + 1, arr.length - 1);
            quicksort1(arr, 0, baseElem - 1);
        }
    }

    static int[] quicksort(int[] arr) {
        return quicksort(arr, arr.length);
    }

    static int[] quicksort(int[] arr, int length) {
        if (length < 2) {
            return arr;
        }
        int baseElem = arr[length / 2];
        int[] leftArr = new int[length];
        int[] rightArr = new int[length];
        int leftIndex = 0;
        int rightIndex = 0;
        for (int i = 0; i < length; i++) {
            int element = arr[i];
            if (element < baseElem) {
                leftArr[leftIndex] = element;
                leftIndex++;
            } else {
                rightArr[rightIndex] = element;
                rightIndex++;
            }
        }
        leftArr = quicksort(leftArr, leftIndex);
        rightArr = quicksort(rightArr, rightIndex);
        int resultIndex = 0;
        int[] result = new int[length];
        for (int i = 0; i < leftIndex; i++) {
            result[resultIndex] = leftArr[i];
            resultIndex++;
        }
        for (int i = 0; i < rightIndex; i++) {
            result[resultIndex] = rightArr[i];
            resultIndex++;
        }
        return result;
    }





}