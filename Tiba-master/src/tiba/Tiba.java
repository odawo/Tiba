/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiba;

import java.sql.Connection;
import java.sql.DriverManager;
import javafx.application.Application;
import javafx.stage.Stage;
/**
 *
 * @author Vanessa
 */
public class Tiba extends Application{
   
//    String linkcut = "l?zeroDateTimeBehavior=convertToNull [root on Default schema]";
    public final static String mysqlurl = "jdbc:mysql://localhost:3306/hospitaldb";
    public final static String mysqlpwd = "";
    public final static String myDriver = "com.mysql.jdbc.Driver";
  
   /*
    Connection for MySql
    */
    public static Connection mysqlConnection()throws Exception{
        
        Connection mc = null;
        try {
            Class.forName(myDriver);

            mc = DriverManager.getConnection(mysqlurl,"root", mysqlpwd);
            System.out.print("Database connection successful");
            
            new Home().setVisible(true);
            
        } catch (Exception e) {
                      
            System.out.println(e.getMessage());

        }
        return mc;
    }
    
    
    public static void main(String[] args) throws Exception {
            mysqlConnection();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
