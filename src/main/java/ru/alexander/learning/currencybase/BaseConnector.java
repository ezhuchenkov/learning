package ru.alexander.learning.currencybase;

import ru.alexander.learning.currencybase.currency.ValueLoader;
import ru.alexander.learning.currencybase.currency.Valute;

import java.sql.*;
import java.util.Map;

public class BaseConnector {
    private static final String URL_PAHT = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USER = "postgres";
    private static final String PASSWORD = "1899181010";
    private static final String SQL = "INSERT INTO currency(valute,currency,date) VALUES (?,?,CURRENT_DATE)";


    protected void baseConnector() {
        try (Connection connection = DriverManager.getConnection(URL_PAHT, USER, PASSWORD)) {
            connection.setSchema("public");
            ValueLoader valueLoader = new ValueLoader();
            try (PreparedStatement ps = connection.prepareStatement(SQL)) {
                for (Map.Entry<String, Valute> entry : valueLoader.getMoney().map.entrySet()) {
                    String name = entry.getKey();
                    double value = entry.getValue().value;
                    ps.setString(1, name);
                    ps.setDouble(2, value);
                    ps.addBatch();
                }
                ps.executeBatch();
            }
        } catch (SQLException e) {
            throw new RuntimeException("Something wrong with connection or statement", e);
        }
    }
}
