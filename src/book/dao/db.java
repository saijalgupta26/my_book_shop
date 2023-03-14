package book.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class db {
    public static Connection getConnection() {

        Connection connection = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/saijal", "root", "root");
        }

        catch (Exception e) {
            System.out.println("inside getConnection catch");
            e.printStackTrace();
        }
        return connection;
    }
}
