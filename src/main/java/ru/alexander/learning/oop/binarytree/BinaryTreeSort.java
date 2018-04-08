package ru.alexander.learning.oop.binarytree;

public class BinaryTreeSort {

    /*
     *    5 3 1 8 4 2 9 7 9'
     *
     *             5
     *         3       8
     *      1    4    7  9
     *       2            9'
     *
     *       количество уровней: log(n)
     *
     *       выведи левую ветку
     *       выведи себя
     *       выведи правую ветку
     *
     *       1 2 3 4 5 7 8 9 9
     *
     *       memory: O(n)
     *       complexity: O(n * log(n))
     *       stability: true
     * */

    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 8, 4, 2, 9, 7, 9};
        sortAndCollect(arr);
    }

    static int[] sortAndCollect(int[] arr) {
        if (arr.length == 0) {
            return arr;
        }
        Node root = new Node(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            Node newElement = new Node(arr[i]);
            addElement(root, newElement);
        }
        int[] result = new int[arr.length];
        collect(root, 0, result);
        return result;
    }

    static void addElement(Node root, Node newElement) {
        if (root.value > newElement.value) {
            if (root.left == null) {
                root.left = newElement;
            } else {
                addElement(root.left, newElement);
            }
        } else {
            if (root.right == null) {
                root.right = newElement;
            } else {
                addElement(root.right, newElement);
            }
        }
    }

    static void print(Node root) {
        if (root.left != null) {
            print(root.left);
        }
        System.out.println(root.value);
        if (root.right != null) {
            print(root.right);
        }
    }

    static int collect(Node root, int index, int[] arr) {
        //todo
        return 0;
    }

}
