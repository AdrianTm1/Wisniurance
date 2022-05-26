package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
    public Statement getNewSt() {
        try {
            String url = "jdbc:sqlite:./baza.sqlite";
            Connection conn = DriverManager.getConnection(url);
            Statement st = conn.createStatement();
            return st;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
