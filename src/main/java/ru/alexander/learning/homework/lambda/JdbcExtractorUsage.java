package ru.alexander.learning.homework.lambda;

import ru.alexander.learning.homework.lambda.model.Fruit;

import java.sql.SQLException;
import java.util.List;

public class JdbcExtractorUsage {

    public static void main(String[] args) {
        JdbcExtractor extractor = new JdbcExtractor("jdbc:postgresql://localhost:5432/postgres", "postgres", "123");

        List<Fruit> fruits = extractor.loadList("SELECT * FROM fruits", rs -> {
            try {
                return new Fruit(
                        rs.getString("name"),
                        rs.getString("color"),
                        rs.getInt("weight")
                );
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        });
    }

}
