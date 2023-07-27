/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankmanagementsystem;
import java.sql.*;
/**
 *
 * @author Prarthana
 */
import java.sql.*;  

public class Conn{
    Connection c;
    Statement s;
    public Conn(){  
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            c =DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","root");    
            s =c.createStatement(); 
           
          
            
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  
    
    
    
    
//    public final String DB_URL="jdbc:mysql://localhost:3306/bankmanagementsystem";
//	public final String USERNAME="root";
//	public final String PASSWORD="root";
//	public final String DRIVER="com.mysql.cj.jdbc.Driver";                                                              //cj add krna mysql version 6high+
//	
//	public Connection getConnection() throws Exception {
//		Class.forName(DRIVER);
//		Connection connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD); //crt+2,L
//		System.out.println("Connection created successfully");
//		return connection;
//	}
//        public static void main(String[] args) {
//	try {
//		new Connectivity().getConnection();	
//	} catch (Exception e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}

