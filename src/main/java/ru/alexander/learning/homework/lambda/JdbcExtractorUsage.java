package ru.alexander.learning.homework.lambda;

import ru.alexander.learning.homework.lambda.model.Fruit;
import ru.alexander.learning.homework.lambda.model.Users;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class JdbcExtractorUsage {

    public static void main(String[] args) throws SQLException {
        try (Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123")) {
            JdbcExtractor extractor = new JdbcExtractor(conn);
            List<Users> users = extractor.loadList("SELECT * FROM users", rs -> {
                        try {
                            return new Users(
                                    rs.getString("name"),
                                    rs.getInt("age")
                            );
                        } catch (SQLException e) {
                            throw new RuntimeException(e);
                        }
                    }
            );
            System.out.println(users.toString());
        }

    }
}
