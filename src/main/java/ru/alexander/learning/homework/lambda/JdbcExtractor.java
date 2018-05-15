package ru.alexander.learning.homework.lambda;

import java.lang.reflect.Type;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;

public class JdbcExtractor {

    private final Connection connection;

    public JdbcExtractor(Connection connection) {
        this.connection = connection;
    }

    public <T> List<T> loadList(String sql, Function<ResultSet, T> mapper) throws SQLException {
        LinkedList list = new LinkedList<T>();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            try (ResultSet rs = ps.executeQuery()) {

                while (rs.next()) {
                    String name = rs.getString("name");
                    Integer weight = rs.getInt("weight");
                    String color = (String) rs.getString("color");
                    list.add(name);
                    list.add(weight);
                    list.add(color);


                }
            }
        }


        return list;

    }


}
