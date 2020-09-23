/*
 * Copyright (c) 2020 | Mathana Kumar S (https://capturemathan.github.io)
 */
import java.sql.*;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {  
		      Class.forName("com.mysql.cj.jdbc.Driver");  
		      Connection c=DriverManager.getConnection( 
		        "jdbc:mysql://localhost:3306/ncp","root","pass");  
		      Statement s=c.createStatement();  
		      // DATA is populated using US DATA CSV
		      ResultSet rs=s.executeQuery("select * from CityDetails");  
		      int count=1;
		      // FETCHING THE FIRST TEN ROWS of CITY DETAILS
		      while(rs.next() && count<=10){  
		      System.out.println(rs.getInt(1)+"  "+rs.getString(2));  
		      count+=1;
		      }
		      c.close();  
		    }
		    catch(Exception e)
		    { 
		      System.out.println(e);
		    }  
	}
}