package ru.alexander.learning.oop.ReflectionAPI;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyClass {
    private int number;
    private String name = "default";

    public MyClass(int number, String name){
        this.number=number;
        this.name=name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void printData() {
        System.out.println(number + " " + name);
    }

    public static void main(String[] args) {
//        getClassName();
        getClassWithConstructorName();
        MyClass myClass = new MyClass(10, "vasya");
        int number = myClass.getNumber();
        String name = null;
        System.out.println(number + " " + name);
        try {
            Field field = myClass.getClass().getDeclaredField("name");
            field.setAccessible(true);
            field.set(myClass, (String) "new value");
            name = (String) field.get(myClass);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        printData(myClass);
    }

    public static void printData(Object myClass) {
        try {
            Method method = myClass.getClass().getDeclaredMethod("printData");
            method.setAccessible(true);
            method.invoke(myClass);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }

    }
    static void getClassName() { // for Class with default Constructor
        MyClass myClass = null;
        try {
            Class clazz = Class.forName(MyClass.class.getName());
            myClass = (MyClass) clazz.newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println(myClass);
    }
    static void getClassWithConstructorName() {
        MyClass myClass = null;
        try {
            Class clazz = Class.forName(MyClass.class.getName());
            Constructor[] constructors = clazz.getConstructors();
            for (Constructor constructor : constructors) {
                Class[] paramTypes = constructor.getParameterTypes();
                for (Class paramType : paramTypes) {
                    System.out.print(paramType.getName() + " ");
                }
                System.out.println();
            }
            Class[] params = {int.class, String.class};
            myClass = (MyClass) clazz.getConstructor(params).newInstance(1, "default2");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println(myClass);
    }

}
