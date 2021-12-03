package com.example.sep3tier3.DaoJOIN;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class daoConnection {


    private static daoConnection instance;

    private daoConnection() {
    }

    public static synchronized daoConnection getInstance() {

        if (instance == null) {
            instance = new daoConnection();
        }
        return instance;
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/CSGO-DB",
                "postgres", "42323087");
    }







}
