package ru.alexander.learning.homework.StreamAPITest;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class FilterPredicate {
    public static void main(String[] args) {
        System.out.println(filt(5));
        LinkedList collection = new LinkedList();
        collection.add(1);
        collection.add(-1);
        collection.add(45);
        collection.add(11);
        collection.add(-20);
        collection.add(-5);
        collection.add(1);
        collection.add(-16);
        System.out.println(listFilter(collection).toString());


    }


    public static LinkedList listFilter(LinkedList list) {
        LinkedList result = new LinkedList();
        Predicate<Integer> isPositive = q -> q > 0;
        for (Object o : list) {
            if (isPositive.test((Integer) o)) {
                result.add(o);
            }
        }
        return result;
    }
    public static boolean filt(Integer x) {
        Predicate<Integer> isPositive = q -> q > 0;
        return isPositive.test(x);
    }

}
