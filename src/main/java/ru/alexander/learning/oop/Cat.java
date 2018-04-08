package ru.alexander.learning.oop;

public class Cat {

    final String name;
    int age;

    Cat(String catName) {
        name = catName;
    }

    Cat(String catName, int catAge) {
        name = catName;
        age = catAge;
    }

    void say() {
        System.out.println(name + ": meow");
    }

    public static void main(String[] args) {
        Cat cat = new Cat("alice", 10);
        //cat.name = "abc";
        //fillName(cat);


        Cat cat2 = new Cat("bob");

        System.out.println(cat.name);
        System.out.println(cat2.name);

        cat.say();


    }



}
