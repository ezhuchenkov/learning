package ru.alexander.learning.currencybase;

import ru.alexander.learning.currencybase.currency.ValueLoader;
import ru.alexander.learning.currencybase.currency.Valute;

import java.sql.*;
import java.util.Map;

public class BaseConnector {
    private static final String URL_PAHT = "jdbc:postgresql://localhost:5432/postgres";
    String USER = "postgres";
    String PASSWORD = "1899181010";


    protected void baseConnector() {
        try (Connection connection = DriverManager.getConnection(URL_PAHT, USER, PASSWORD)) {
            connection.setSchema("public");
            ValueLoader valueLoader = new ValueLoader();

            for (Map.Entry<String, Valute> entry : valueLoader.getMoney().map.entrySet()) {
                try (PreparedStatement ps = connection.prepareStatement(
                        "INSERT INTO currency(valute,currency,date) VALUES (?,?,CURRENT_DATE)")) {
                    String name = entry.getKey();
                    double value = entry.getValue().value;
                    ps.setString(1, name);
                    ps.setDouble(2, value);
                    ps.executeUpdate();
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Smth wrong with: " + URL_PAHT, e);
        }
    }
}
