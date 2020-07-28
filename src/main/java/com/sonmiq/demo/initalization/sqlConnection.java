package com.sonmiq.demo.initalization;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class sqlConnection {

   private Connection connection;
   private static final sqlConnection instance=new sqlConnection();


 private sqlConnection() {

     if(instance==null) {
         String connectionURL = "jdbc:mysql://localhost:3306/imdb";
         String username = "root";
         String password = "Yelena1988";


         try {
             connection = DriverManager.getConnection(connectionURL, username, password);
         } catch (SQLException e) {
             e.printStackTrace();
         }
     }
 }

    public static sqlConnection getInstance() {
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
}
