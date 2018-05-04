package ru.alexander.learning.oop;

public enum Color {

    WHITE(111),
    BLACK(000);

    final int code;

    Color(int code) {
        this.code = code;
    }

    public static void main(String[] args) {
        Color color = Color.values()[BLACK.ordinal()]; //BLACK
        System.out.println(color.name()); //"BLACK"
        Color black = Color.valueOf("BLACK");
        System.out.println(color.code);

        black = null;
        System.out.println(black == BLACK); //not only equals
    }

}
