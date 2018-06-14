package ru.alexander.learning.homework.multithreadingTest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class MyExecutor {
   final int attempt;

    public MyExecutor(int attempt) {
        this.attempt = attempt;
    }

    public void submit() {
        int i = 0;
        while (i < attempt) {
            try {FileOutputStream fos=new FileOutputStream("C://notes.txt");
                System.out.println("I found file!");
            break;}
            catch (FileNotFoundException e) {
                System.out.println("fail");
                ++i;
            }
        }
    }
}


