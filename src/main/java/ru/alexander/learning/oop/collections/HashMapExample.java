package ru.alexander.learning.oop.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {
        Map<MyKey, Integer> map = new HashMap<>();
        MyKey key = new MyKey("hello");
        map.put(key, 10);

        System.out.println(map.containsKey(key));
        System.out.println(map.containsKey(key));
        System.out.println(map.containsKey(key));
        System.out.println(map.containsKey(key));
        System.out.println(map.containsKey(key));
        System.out.println(map.containsKey(key));
        System.out.println(map.containsKey(key));
        //buckets (array of lists), size = 16
        //"hello" -> hashCode = 5
        //index = ??? hashCode % size
        //loadFactor = 0.75
    }



}
