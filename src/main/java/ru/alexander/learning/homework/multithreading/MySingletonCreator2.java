package ru.alexander.learning.homework.multithreading;

import java.util.ArrayList;
import java.util.List;

public class MySingletonCreator2 {


    public static void main(String[] args) {
        Runnable runnable = MySingleton::getInstance;
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(runnable);
            threads.add(thread);
        }
        threads.forEach(thread -> System.out.println(thread.getName()));
        threads.forEach(Thread::start);


    }
}
