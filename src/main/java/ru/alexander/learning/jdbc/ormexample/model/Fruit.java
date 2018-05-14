package ru.alexander.learning.jdbc.ormexample.model;

import ru.alexander.learning.jdbc.ormexample.Column;
import ru.alexander.learning.jdbc.ormexample.Table;

@Table(name = "fruits")
public class Fruit {
    String name;
    Integer color;
    @Column(name = "weight")
    Integer weight;

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
