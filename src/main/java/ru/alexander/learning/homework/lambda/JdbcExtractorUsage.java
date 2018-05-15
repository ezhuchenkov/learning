package ru.alexander.learning.homework.lambda;

import ru.alexander.learning.homework.lambda.model.Fruit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class JdbcExtractorUsage {

    public static void main(String[] args) throws SQLException {
        try (Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123")) {
            JdbcExtractor extractor = new JdbcExtractor(conn);
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

                    }

            );
            System.out.println(fruits.toString());
        }

    }
}
