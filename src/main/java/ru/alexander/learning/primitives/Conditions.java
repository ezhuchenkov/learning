package ru.alexander.learning.primitives;

public class Conditions {

    public static void main(String[] args) {
        int option = 0;
        if (option == 0) {
            System.out.println("exit");
        } else if (option == 1) {
            System.out.println("print");
        } else if (option == 2) {
            System.out.println("save");
        } else {
            System.out.println("unknown command");
        }

        switch (option) {
            case -1:
            case 0:
                System.out.println("exit");
                break;
            case 1:
                System.out.println("print");
                break;
            case 2:
                System.out.println("save");
                break;
            default:
                System.out.println("unknown command");
        }


    }

    static int sign(int x) {
        return x >= 0 ? 0 : 1; //ternary - Elvis
        /*
        if (x >= 0) {
            return 0;
        } else {
            return 1;
        }
        */
    }

}
