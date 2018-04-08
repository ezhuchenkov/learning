package ru.alexander.learning.oop.linkedlist;

public class LinkedList {

    //1 4 5
    // first -> (1) -> (4) -> (5) -> (2) -> null

    Node first;

    void add(int value) {
        Node newNode = new Node(value);
        if (first == null) {
            first = newNode;
            return;
        }
        Node current = first;
        while (current.next != null) {
            current = current.next;
        }
        //current == last
        current.next = newNode;
    }

    void addToFront(int value) {

        //todo

    }

    int get(int index) {
        if (first == null) {
            return -1;
        }
        Node current = first;
        for (int i = 0; i < index; i++) {
            if (current.next != null) {
                current = current.next;
            } else {
                return -1;
            }
        }
        return current.value;
    }

    int indexOf(int value) {
        //todo вернуть индекс первого встреченного элемента со значением value, иначе -1
        return 0;
    }

    void set(int index, int value) {
//todo
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(2);
        list.add(1);
        System.out.println(list.get(0)); //1
        System.out.println(list.get(3)); //2
        System.out.println(list.get(5)); //2
        list.indexOf(1); //0
        list.indexOf(5); //2
        list.indexOf(6); //-1
    }

}
