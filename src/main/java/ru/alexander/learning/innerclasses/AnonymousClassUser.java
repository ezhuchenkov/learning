package ru.alexander.learning.innerclasses;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnonymousClassUser {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.sort(new Comparator<Car>() { //anonymous
            @Override
            public int compare(Car o1, Car o2) {
                cars.size();
                return Integer.compare(o1.price, o2.price);
            }
        });

        //anonymous
        cars.sort((o1, o2) -> {
            cars.size();
            return Integer.compare(o1.price, o2.price);
        });
    }


    static class Car {
        int price;
    }

}
