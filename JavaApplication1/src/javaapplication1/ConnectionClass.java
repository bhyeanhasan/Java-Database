package javaapplication1;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionClass {

    public Connection connect() {
        String url = "jdbc:mysql://localhost:3306/cse20";
        String username = "root";
        String password = "";
        Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database successfully!");

        } catch (Exception e) {
            System.out.println(e);
        }

        return connection;
    }

}
