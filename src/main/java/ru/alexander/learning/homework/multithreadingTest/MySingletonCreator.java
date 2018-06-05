//package ru.alexander.learning.homework.multithreadingTest;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class MySingletonCreator {
//    static final Object monitor = new Object();
//    public static void main(String[] args) {
//
//        List<Thread> threads = new ArrayList<>();
//        for (int i = 0; i < 5; i++) {
//            Thread thread = new Thread(MySingleton.getInstance());
//            threads.add(thread);
//        }
//        threads.forEach(Thread::start);
//
//
//
//    }
//}
