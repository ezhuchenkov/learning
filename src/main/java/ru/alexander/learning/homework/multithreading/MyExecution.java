package ru.alexander.learning.homework.multithreading;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class MyExecution {
    public static void main(String[] args) {
        MyExecutor2 myExecutor = new MyExecutor2() {
            @Override
            public void submit(Runnable command) {

            }
        };
        myExecutor.submit(()->{
            int i = 0;
            while (i < 5) {
                try {FileOutputStream fos=new FileOutputStream("C://notes.txt");
                    System.out.println("I found file!");
                    break;}
                catch (FileNotFoundException e) {
                    System.out.println("fail");
                    ++i;
                }
            }
        }
        );

    }
}
