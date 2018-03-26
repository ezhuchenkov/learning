package ru.alexander.learning.homework;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println("Метод итерации. Вывод числа, соответствующего задонному n:  "+fibIter(4));
        System.out.println("Метод рекурсии. Вывод числа, соответствующего задонному n:  "+fibRec(4));
    }
    static int fibIter(long n) {
        int n1=1;
        int n2=1;
        int nx;
        System.out.print("Метод интерации. Вывод чисел от 1 до n:"+"    "+n1+" "+n2+" ");
        for (int i = 3; i <=n; i++) {
            nx=n1+n2;
            n1=n2;
            n2=nx;
            System.out.print(nx+" ");
        }
        System.out.println();
        return n2;
    }

    static int fibRec(int n) {
        if (n==1 || n==2){
        return 1;}
        else {
//            System.out.println("n="+n);
//            int q=fibRec(n-1)+ fibRec(n-2);
//            System.out.print("Пытаемся получить значения q="+q+" ");
//            System.out.println();
            return fibRec(n-1)+ fibRec(n-2);
        }
    }


}
