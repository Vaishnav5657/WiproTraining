package com.wipro.jdbcdemo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
            String url = "jdbc:mysql://localhost:3306/jdbc";
            String userName = "root";
            String passWord = "Vaishnav@5657";
            
            try {
    			Connection conn = DriverManager.getConnection(url,userName,passWord);
    			java.sql.Statement stmt = conn.createStatement();
    			String insertSQL = "insert into new_table(empid,empname,empdept)"
    					+"values('emp1','Rohan','AI')";
    			stmt.execute(insertSQL);
    			
    		} catch (SQLException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
            
            
    }
}
