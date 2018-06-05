package ru.alexander.learning.multithreading;

public class VisibilityExample {

    static class Holder {
        volatile int value = 0;

        public Holder(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {

        Holder holder = null;

        //t1:
        holder = new Holder(10);

        //t2:
        while (true) {
            if (holder != null) {
                System.out.println(holder.value); //10
                System.out.println(holder.value); //0
                return;
            }
        }

    }

    /*
    * synchronized actions:
    *
    * volatile var x
    * write to x    hb    read from x
    *
    * unlock mon1     hb     lock mon1
    *
    * actions     hb    thread start
    *
    * thread join    hb    its actions
    *
    * */

}
