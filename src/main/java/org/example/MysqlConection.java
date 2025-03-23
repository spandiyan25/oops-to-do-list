package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlConection {

    private static Connection conn = null;
    MysqlConection(){}

    public static  Connection getConnection() throws ClassNotFoundException {
        if (conn == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/to_do_list", "root", "spandiyan@12");
                System.out.println("Connected to Database!");
            } catch (SQLException e  ) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
        }


        return conn;
    }

}
