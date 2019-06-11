package com.zomato.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionUtil {
	public static Connection getConnection() {
		Connection connection=null;
		try {
			
			Class.forName("com.mysql.jdbc.Driver");  
			connection=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/sample","root","openmysql");  
					
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
	
	public static void close(Connection connection,PreparedStatement preparestatement,ResultSet resultset) throws SQLException
	{
                 if(connection!=null)
                 {
                	 connection.close();
                 }
                 if(preparestatement!=null)
                 {
                	 preparestatement.close();
                 }
                 if(resultset!=null)
                 {
                	 resultset.close();
                 }

	}
    
	

}
