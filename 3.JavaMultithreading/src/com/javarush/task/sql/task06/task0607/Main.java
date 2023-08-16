package com.javarush.task.sql.task06.task0607;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        Connection connection = DriverManager.getConnection("jdbc:mysql://192.168.99.100:3306/test", "root", "root");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM object");
        ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
        int colunmCount = resultSetMetaData.getColumnCount();
        List<String> typeColumn = new ArrayList<>();
        for (int i = 1; i <= colunmCount; i++) {
            typeColumn.add(resultSetMetaData.getColumnTypeName(i));
            System.out.print(resultSetMetaData.getColumnName(i) + "\t");
        }
        System.out.println();
        while (resultSet.next()) {
            for (int i = 1; i <= colunmCount; i++) {
                switch (typeColumn.get(i - 1)) {
                    case "INT" -> System.out.print(resultSet.getInt(i) + "\t");
                    case "VARCHAR" -> System.out.print(resultSet.getString(i) + "\t");
                    case "DATE" -> System.out.print(resultSet.getDate(i) + "\t");
                }
            }
            System.out.println();
        }
        connection.close();
    }
}

