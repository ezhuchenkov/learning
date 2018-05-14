package ru.alexander.learning.homework.jdbc;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class FruitExtractorTrywithResources {
    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123");
        conn.setSchema("public");
        System.out.println(getFruitNames(conn, 10, 100).toString());
        System.out.println();
        printAllRows(conn);
        conn.close();

    }

    static List<String> getFruitNames(Connection conn, int weightFrom, int weightTo) throws SQLException {
        LinkedList<String> list = new LinkedList<>();
        try (PreparedStatement psWeight = conn.prepareStatement("SELECT name FROM Fruits WHERE weight BETWEEN ? AND ?")) {
            psWeight.setInt(1, weightFrom);
            psWeight.setInt(2, weightTo);
            ResultSet rsWeight = psWeight.executeQuery();
            while (rsWeight.next()) {
                String name = rsWeight.getString("name");
                list.add(name);
            }
            rsWeight.close();
            return list;
        }
    }

    static void printAllRows(Connection conn) throws SQLException {
        try (PreparedStatement ps = conn.prepareStatement("SELECT * FROM Fruits");) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String n = rs.getString("name");
                Double w = rs.getDouble("weight");
                String c = rs.getString("color");
                System.out.println(n + " " + w + " " + c);
            }
            rs.close();
        }
    }
}

