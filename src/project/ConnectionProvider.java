/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PcDoctor
 */
public class ConnectionProvider {
    public  static Connection getcon(){
    
        try {
            String url = "jdbc:mysql://localhost:3306/hotel?useUnicode=true&characterEncoding=UTF-8";
            String username="root";
            String password="";
            Connection conn=DriverManager.getConnection(url,username,password);
            return conn;
      
        } catch (Exception e) {
                return null;
        }
   
    } 
}
 