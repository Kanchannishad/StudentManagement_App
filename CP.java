package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
    static Connection con;

    public static Connection createC() {
        try {
            // Load MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Local MySQL credentials
            String user = "root";  
            String password = "root";  
            String url = "jdbc:mysql://localhost:3306/student"; // local DB
            
            
            // Create connection
           con = DriverManager.getConnection(url, user, password);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
