package ru.alexander.learning.currencybase;

import ru.alexander.learning.currencybase.currency.Money;
import ru.alexander.learning.currencybase.currency.ValueLoader;

import java.sql.*;
import java.util.Set;

public class BaseConnector {
    String URL_PAHT = "jdbc:postgresql://localhost:5432/postgres";
    String USER = "postgres";
    String PASSWORD = "1899181010";

    protected void baseconnector() {
        try {
            Connection connection = DriverManager.getConnection(URL_PAHT, USER, PASSWORD);
            connection.setSchema("public");
            ValueLoader vl = new ValueLoader();
            Money money = vl.getMoney();
            String[] moneySet = money.map.keySet().toArray();

            PreparedStatement ps = connection.prepareStatement("INSERT INTO currency(valute,currency) VALUES (?,?)");
            ps.setString(1,"AUD" );
            ps.setDouble(2, 10);
            ResultSet rs = ps.executeQuery();
            rs.close();
            ps.close();
            connection.close();
        } catch (SQLException e) {
            throw new IllegalArgumentException("Wrong url: " + URL_PAHT, e);}
    }


}
