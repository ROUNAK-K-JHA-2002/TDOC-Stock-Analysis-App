/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * 
 * 
 *
 * @author dextrix
 */
public class SqlConnection {
    
    public static Connection getConnection(){
    Connection con = null;
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/User_Database","root","Satyam@123");
    }
    catch(ClassNotFoundException | SQLException ex){
        System.out.println(ex.getMessage());
    }
    return con;
}
}
