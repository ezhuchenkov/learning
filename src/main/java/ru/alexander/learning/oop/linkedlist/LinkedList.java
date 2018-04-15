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

    void addToFront(int value) {  //добавление элемента в начало списка
        //По дебагу всё проходит, но результат не тот, что ожидаем. Либо неправильно читаю дебаг, либо что-то не понимаю
        Node newFirstNode = new Node(value);
        if (first == null) {
            first = newFirstNode;
        } else {
            newFirstNode.next = first;
            first = newFirstNode;
        }
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

    int indexOf(int value) {  // вернуть индекс первого встреченного элемента со значением value, иначе -1
//        if (first == null) {
//            return -1;
//        }
        Node current = first;
        int index = 0;
        /*
        if (current.value == value) {
            return index;
        }
        while (current.next != null) {
            if (current.value == value) {
                return index;
            }
            current = current.next;
            ++index;
        }
        */

        while (current != null) {
            if (current.value == value) {
                return index;
            }
            index++;
            current = current.next;
        }

        return -1;
    }


    boolean set(int index, int value) {
        if (first == null) {
            return false;
        }
        Node newNode = new Node(value);
        if (index == 0) {
            newNode.next = first.next;
            first = newNode;
            return true;
        }
        Node prev = first;
        Node current = first.next;
        int currentIndex = 1;
        while (current != null) {
            if (currentIndex == index) {
                prev.next = newNode;
                newNode.next = current.next;
                return true;
            }
            currentIndex++;
            prev = current;
            current = current.next;
        }
        return false;


        /*
        Node current = first;
        for (int i = 0; i < index; i++) {
            if (current.next != null) {
                current = current.next;
            } else {
                current.value = value;
                break;
            }
        }
        current.value = value;
        */

    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
//        list.add(1);
//        list.add(2);
//        list.add(3);
        System.out.println(list.indexOf(1));
        System.out.println(list.indexOf(2));
        System.out.println(list.indexOf(3));
        System.out.println(list.indexOf(10));
//        System.out.println(list.set(4, 5));
        //list.add(4);
        //list.add(5);
        //list.add(2);
        //list.add(1);
//        list.set(3, 6);
//        list.addToFront(7);
//        System.out.println(list.get(0)); //1
//        System.out.println(list.get(3)); //1
        //System.out.println(list.get(3)); //2
        //System.out.println(list.get(5)); //2
        //System.out.println(list.indexOf(0));
//        System.out.println(list.indexOf(7));
        //list.indexOf(6); //-1
    }

}
