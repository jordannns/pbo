/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.sql.*;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Asus
 */
public class MyConnection {
    private static String servername = "localhost";
    private static String username = "root";
    private static String dbname  = "db";
    private static Integer portnumber  = 3306;
    private static String password = "";
    
    
    public static Connection getConnection(){
        Connection con = null;
        MysqlDataSource datasource = new MysqlDataSource();
        
        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setPassword(password);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portnumber);
        
        try{
       
       con = datasource.getConnection();
    }catch (SQLException ex) {
            System.out.println(ex.getMessage()); 
    }
        return con;
}
}
