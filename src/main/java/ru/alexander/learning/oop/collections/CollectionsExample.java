package ru.alexander.learning.oop.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CollectionsExample {

    /**
     *     Collection
     *     List (order, non-unique)   Set (non-order, unique)  Queue   Stack     |   Map
     *     ArrayList, LinkedList      HashSet
     */

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.get(0); //10
        for (Integer element : list) {
            System.out.println(element);
        }
        //ArrayList
        //add to end, get -> O(1)
        //add to not-end -> O(n)
        //indexOf -> O(n)

        //LinkedList
        //add to start, end -> O(1)
        //add to middle -> search (O(n)) + modify (O(1)) = O(n)
        //get -> O(n)

        System.out.println("queue");
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());


    }


}
