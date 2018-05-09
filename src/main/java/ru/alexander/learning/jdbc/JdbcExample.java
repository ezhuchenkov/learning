package ru.alexander.learning.jdbc;

import java.sql.*;

public class JdbcExample {

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager
                .getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123");
        connection.setSchema("public");

        PreparedStatement ps = connection.prepareStatement("SELECT * FROM users WHERE name = ?");
        ps.setString(1, "Alexey");

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            String n = rs.getString("name");
            System.out.println(n);
        }

        rs.close();
        ps.close();
        connection.close();
    }

}
