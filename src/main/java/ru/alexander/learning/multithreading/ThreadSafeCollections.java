package ru.alexander.learning.multithreading;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class ThreadSafeCollections {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> syncList = Collections.synchronizedList(list);

        List<String> copyLisy = new CopyOnWriteArrayList<>();

        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> syncMap = Collections.synchronizedMap(map);

        Map<String, Integer> concurrentMap = new ConcurrentHashMap<>();

        concurrentMap.putIfAbsent("a", 1);
        concurrentMap.putIfAbsent("a", 2);

        concurrentMap.compute("alex", (name, oldValue) -> oldValue == null ? 1 : oldValue + 1);

        //сериализация в json, dependency injection (guice / spring), http, logging

    }

}
