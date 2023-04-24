package com.Accio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    static Connection connection = null;
    public static Connection getConnection(){
        if(connection!=null){
            return connection;
        }
        String db = "searchenginejava";//need to check
        String user = "root";
        String pwd = "PFH#23kgrw9";//need to correct
        return getConnection(db, user, pwd);
    }
    private static Connection getConnection(String db, String user, String pwd){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            // connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+db+"?user="+user+"&password="+pwd);
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+db , user,pwd);
        }
        catch (ClassNotFoundException | SQLException classNotFoundException){
            classNotFoundException.printStackTrace();
        }
        return connection;
    }
}
