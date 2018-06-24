package ru.alexander.learning.lombok;

public class UserExample {

    public static void main(String[] args) {
        User user = new User("alex", 27);
        System.out.println(user.getName());

        User user2 = new User("vasya");
        System.out.println(user2.getAge());
    }

}
