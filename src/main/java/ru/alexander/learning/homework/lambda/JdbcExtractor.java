package ru.alexander.learning.homework.lambda;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class JdbcExtractor {

    private final Connection connection;

    public JdbcExtractor(Connection connection) {
        this.connection = connection;
    }

    public <T> List<T> loadList(String sql, Function<ResultSet, T> mapper) {
        try (ResultSet resultSet = new ResultSet() {
        }) {
        }


        return Collections.emptyList(); //todo

    }


}
