package ru.alexander.learning.jdbc.ormexample;

import ru.alexander.learning.jdbc.ormexample.model.Fruit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class ExctractorUsage {

    public static void main(String[] args) throws SQLException, IllegalAccessException {
        Connection connection = DriverManager
                .getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123");
        Extractor extractor = new Extractor(connection);
        List<Fruit> fruits = extractor.getAll(Fruit.class);
    }

}
