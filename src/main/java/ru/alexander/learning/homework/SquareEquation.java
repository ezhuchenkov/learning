package ru.alexander.learning.homework;

public class SquareEquation {

    public static void main(String[] args) {
        solveAndPrint(2, 6, 1);

        //b ^ false = b
        //b ^ b = false
        //b ^ a ^ b = (b ^ b) ^ a = false ^ a = a

        //0101 ^ 0000 = 0101
        //1010 ^ 1010 = 0000

        /*
         *    x y   x^y
         *    0 0    0
         *    0 1    1
         *    1 0    1
         *    1 1    0
         *
         * */
    }

    static void solveAndPrint(int a, int b, int c) {
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Equation has infinity solutions");
                } else {
                    System.out.println("Equation has no solution");
                }
            } else {
                System.out.println("Simple Equation:");
                double x = ((double) -c) / b;
                System.out.println("x=" + x);
            }
        }else{

                System.out.println("Square Equation:");
                double d = (b*b)- (4 * a * c);
                double sqrt = Math.sqrt(d);
                if (d > 0) {
                    double x1 = (-b + sqrt) / (2 * a); //есть ли разница в памяти, если не создавать переменную, а вычислять ее 2 раза?
                    double x2 = (-b - sqrt) / (2 * a);
                    System.out.println("The equation is solved, the discriminant is greater than 0, the solutions are: ");
                    System.out.println("x1 = " + x1);
                    System.out.println("x2 = " + x2);
                    int p1 = (int) ((a * x1 * x1) + (b * x1) + c);
                    int p2 = (int) ((a * x2 * x2) + (b * x2) + c);
                    System.out.println("Checking x1: " + a + "*" + x1 + "^2+" + b + "*" + x1 + "+" + c + "=" + p1);
                    System.out.println("Checking x2: " + a + "*" + x2 + "^2+" + b + "*" + x2 + "+" + c + "=" + p2);

                } else if (d == 0) {
                    double x1 = (-b + sqrt) / (2 * a);
                    System.out.println("The equation is solved, the discriminant is equal to 0, the solution is: ");
                    System.out.println("x = " + x1);
                    int p1 = (int) ((a * x1 * x1) + (b * x1) + c);
                    System.out.println("Checking: " + a + "*" + x1 + "^2+" + b + "*" + x1 + "+" + c + "=" + p1);

                } else
                    System.out.println("Equation has no solutions");

            }
        }
    }


//            if (a == 0 && b != 0) {
//                System.out.println("Простое уравнение:");
//                double x = (double) -c / b;
//                System.out.println("x=" + x);
//            } else if (a == 0 && b == 0) {
//                System.out.println("Нет решения, введено уравнение " + c + "=0");
//            } else if (b == 0 && c != 0) {
//                System.out.println("Неполное квадратное уравнение:");
//                double xl = (double) Math.sqrt(c / a);
//                double x2 = (double) -Math.sqrt(c / a);
//                System.out.println("x1=" + xl);
//                System.out.println("x2=" + x2);
//                int p1 = (int) ((a * Math.pow(xl, 2)) + (b * xl) + c);
//                int p2 = (int) ((a * Math.pow(x2, 2)) + (b * x2) + c);
//                System.out.println("Проверка: " + a + "*" + xl + "^2+" + b + "*" + xl + c + "=" + p1);
//                System.out.println("Проверка: " + a + "*" + x2 + "^2+" + b + "*" + x2 + c + "=" + p2);
//            } else if (b != 0 && c == 0) {
//                System.out.println("Неполное квадратное уравнение:");
//                double xl = 0;
//                double x2 = (double) -b / a;
//                System.out.println("x1=" + xl);
//                System.out.println("x2=" + x2);
//                int p1 = (int) ((a * Math.pow(xl, 2)) + (b * xl) + c);
//                int p2 = (int) ((a * Math.pow(x2, 2)) + (b * x2) + c);
//                System.out.println("Проверка: " + a + "*" + xl + "^2+" + b + "*" + xl + "+" + c + "=" + p1);
//                System.out.println("Проверка: " + a + "*" + x2 + "^2+" + b + "*" + x2 + "+" + c + "=" + p2);
//            } else if (b == 0 && c == 0) {
//                System.out.println("Неполное квадратное уравнение:");
//                double xl = 0;
//                System.out.println("x=" + xl);
//            } else {
//                System.out.println("Квадратное уравнение:");
//                double x1;
//                double x2;
//                double d = Math.pow(b, 2) - (4 * a * c); //почему ругается на int d?
//                double sqrt = Math.sqrt(d);
//                if (d > 0) {
//                    x1 = (-b + sqrt) / (2 * a);
//                    x2 = (-b - sqrt) / (2 * a);
//                    System.out.println("Уравнение решено, дискриминант больше 0, варианты решений: ");
//                    System.out.println("x1 = " + x1);
//                    System.out.println("x2 = " + x2);
//                    int p1 = (int) ((a * Math.pow(x1, 2)) + (b * x1) + c);
//                    int p2 = (int) (a * Math.pow(x2, 2) + b * x2 + c);
//                    System.out.println("Проверка: " + a + "*" + x1 + "^2+" + b + "*" + x1 + "+" + c + "=" + p1);
//                    System.out.println("Проверка: " + a + "*" + x2 + "^2+" + b + "*" + x2 + "+" + c + "=" + p2);
//
//                } else if (d == 0) {
//                    x1 = (-b + sqrt) / (2 * a);
//                    System.out.println("Уравнение решено, дискриминант равен 0, решение: ");
//                    System.out.println("x = " + x1);
//                    int p1 = (int) ((a * Math.pow(x1, 2)) + (b * x1) + c);
//                    System.out.println("Проверка: " + a + "*" + x1 + "^2+" + b + "*" + x1 + "+" + c + "=" + p1);
//
//                } else
//                    System.out.println("Уравнение не имеет решения");
//
//            }
//        }
//    }
