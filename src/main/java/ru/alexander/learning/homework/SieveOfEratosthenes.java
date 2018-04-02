package ru.alexander.learning.homework;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26};
        for (int elem : arr) {
            if (elem != 0) {
                for (int j = 2; j < arr.length + 2; j++) {
                    if (elem == j) {
                        arr[elem - 2] = elem;
                    } else if (j % elem == 0) {
                        arr[j - 2] = 0;
                    }

                }
                System.out.print(elem+" ");
            }
        }
    }
}


// решето Эратосфена

//5 = 1 * 5
//6 = 1 * 2 * 3
//1 = 1

//2 3 - 5 - 7 - - - 11 - 13 - -
// { false, false, true, true, false, true, .. }