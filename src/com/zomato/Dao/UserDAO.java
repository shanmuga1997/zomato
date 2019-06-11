package com.zomato.Dao;
import java.sql.*;

import com.zomato.model.User;
public class UserDAO
{
	
	public boolean validateCredentials(User user) throws SQLException
	{
		Connection connection=ConnectionUtil.getConnection();	
		String url="select * from UserCredentials where uname=? and password=?";
	    PreparedStatement prepareStatement=connection.prepareStatement(url);
		prepareStatement.setString(1,user.getUname());
		prepareStatement.setString(2,user.getPassword());
	    ResultSet result=prepareStatement.executeQuery();
	    if(result.next())
	    {
	    	connection.close();
	    	return true;
	    }
	    connection.close();
	    return false;
	}
	
	
	
	
	
	

}
