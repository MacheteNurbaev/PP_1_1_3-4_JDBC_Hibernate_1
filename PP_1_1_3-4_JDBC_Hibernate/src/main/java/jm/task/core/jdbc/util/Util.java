package jm.task.core.jdbc.util;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public  class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/dbtest";
    private static final String USER = "Machete";
    private static final String PASSWORD = "Machete";

    public static Connection getConnection () throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }



}