package ru.alexander.learning.homework;

import ru.alexander.learning.primitives.Arrays;

import java.lang.reflect.Array;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 100;
        main1(n);
        main2(n);
        //   main3(n);
        main4(n);

    }

    private static void main1(int n) {
        int[] arr = new int[n + 1];
        for (int i = 0; i < n + 1; ++i) {
            arr[i] = i;
        }
        System.out.print("Простые числа main1: ");
        for (int elem : arr) {
            if (elem != 0 && elem != 1) {
                for (int j = 2; j < arr.length; j++) {
                    if (elem == j) {
                        continue;
                    } else if (j % elem == 0) {
                        arr[j] = 0;
                    }

                }
                System.out.print(elem + " ");
            }
        }
        System.out.println();
    }

    private static void main2(int n) {
        int[] arr = new int[n + 1];
        for (int i = 0; i < n + 1; ++i) {
            arr[i] = i;
        }
        System.out.print("Простые числа main2: ");
        for (int q = 0; q <= Math.sqrt(n); ++q) {
            if (q != 0 && q != 1) {
                for (int j = 2; j < arr.length; j++) {
                    if (q == j) {
                        continue;
                    } else if (j % q == 0) {
                        arr[j] = 0;
                    }
                }
            }
        }
        for (int elem2 : arr) {
            if (elem2 != 0) {
                if (elem2 != 1) {
                    System.out.print(elem2 + " ");
                }
            }
        }
        System.out.println();
    }

    private static void main3(int n) {
        System.out.print("Простые числа main3: ");
        boolean[] crossedOut = new boolean[n - 1];
        for (int i = 2; i <= Math.sqrt(n); i++) {
            for (int j = 2; j <= crossedOut.length; j++) {
                if (crossedOut[j - 2] = false) {
                    continue;
                }
                if (i == j || j % i != 0) {
                    crossedOut[j - 2] = true;

                } else {
                    crossedOut[j - 2] = false;
                }

            }
        }

        System.out.println();
        for (
                boolean elem : crossedOut)

        {
            System.out.print(elem + " ");
        }
    }


    private static void main4(int n) {
        System.out.println("Main4: ");
        boolean[] array = new boolean[n + 2];
        for (int m = 2; m * m <= n; m++) {
            if (array[m]) {
                continue;
            }

            for (int k = m * m; k <= n; k += m) {
                array[k] = true;
            }
        }
        for (int m = 2; m <= n; m++)
            if (!array[m])
                System.out.print(m + " ");
    }
}


// решето Эратосфена

//5 = 1 * 5
//6 = 1 * 2 * 3
//1 = 1

//2 3 - 5 - 7 - - - 11 - 13 - -
// { false, false, true, true, false, true, .. }