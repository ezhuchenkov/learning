package ru.alexander.learning.jdbc.ormexample;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Extractor {

    private final Connection connection;

    public Extractor(Connection connection) {
        this.connection = connection;
    }

    public <T> List<T> getAll(Class<T> clazz) throws SQLException, IllegalAccessException {
        String tableName = getTableName(clazz);
        PreparedStatement ps = connection.prepareStatement("SELECT * FROM " + tableName);
        ResultSet rs = ps.executeQuery();
        List<T> result = new ArrayList<>();
        while (rs.next()) {
            T instance;
            try {
                instance = clazz.newInstance();
            } catch (InstantiationException e) {
                throw new IllegalArgumentException("Class " + clazz.getSimpleName() + " missing no-arg constructor");
            }
            result.add(instance);
            for (Field field : clazz.getDeclaredFields()) {
                String columnName = getColumnName(field);
                Object columnValue;
                try {
                    columnValue = rs.getObject(columnName);
                } catch (SQLException e) {
                    throw new IllegalArgumentException("Column " + columnName
                            + " not found for class " + clazz.getSimpleName());
                }
                field.setAccessible(true);
                try {
                    field.set(instance, columnValue);
                } catch (IllegalArgumentException e) {
                    throw new IllegalArgumentException("Column " + columnName
                            + " has different type in class " + clazz.getSimpleName());
                }
            }
        }
        return result;
    }

    private String getColumnName(Field field) {
        Column columnAnnotation = field.getAnnotation(Column.class);
        return columnAnnotation == null ? field.getName() : columnAnnotation.name();
    }

    private String getTableName(Class<?> clazz) {
        Table tableAnnotation = clazz.getAnnotation(Table.class);
        if (tableAnnotation == null) {
            throw new IllegalArgumentException("Class " + clazz.getSimpleName()
                    + " is not annotated with " + Table.class.getSimpleName());
        }
        return tableAnnotation.name();
    }


}
