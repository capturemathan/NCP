/*
 * Copyright (c) 2020 | Mathana Kumar S (https://capturemathan.github.io)
 */
import java.sql.*;
import java.util.*;
public class Q2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String prodname,prodzip,prodnum,prodimg;
		int q=1;
		int loop=1;
		try {  
		      Class.forName("com.mysql.cj.jdbc.Driver");  
		      Connection c=DriverManager.getConnection( 
		        "jdbc:mysql://localhost:3306/ncp","root","pass");  
		      Statement s=c.createStatement();
		      ResultSet rs=s.executeQuery("select * from Shipping");  
		      System.out.println("The Shipping Details are as follows");
		      int count=1;
		      // FETCHING ALL THE SHIPPING DETAILS
		      while(rs.next() && count<=10){  
		      System.out.println(rs.getString(1)+"  "+rs.getString(2)+" "+rs.getString(3)+"  "+rs.getString(4));  
		      count+=1;
		      }
		      rs.close();
		      s.close();
		      while(loop!=0) {
		      // Querying by user's choice
		      System.out.println("Enter 1 to QUERY by Product Name");
		      System.out.println("Enter 2 to QUERY by ZIPCODE");
		      System.out.println("Enter 3 to QUERY by Phone Number");
		      System.out.println("Enter 4 to QUERY by Product Image");
		      q=scan.nextInt();
		      if(q==1) {
		    	  System.out.println("Enter the Product Name");
		    	  prodname=scan.next();
		    	  String sql ="select distinct * from Shipping,CityDetails where ProdName=? AND Shipping.ProdZip = CityDetails.Zipcode";
		    	  PreparedStatement stm = c.prepareStatement(sql);
		    	  stm.setString(1, prodname.trim());
		    	  ResultSet rst = stm.executeQuery();
		    	  boolean flag=false;
		    	  while(rst.next()) {
		    		  flag=true;
		    		  System.out.println(rst.getString(1)+"  "+rst.getString(2)+" "+rst.getString(3)+"  "+rst.getString(4)+" "+rst.getString(5)+"  "+rst.getString(6));
		    	  }
		    	  if(flag==true) {
		    		  System.out.println("RECORDS FOUND :)");
		    	  }
		    	  else {
		    		  System.out.println("RECORDS NOT FOUND :(");
		    	  }
		      }
		      else if(q==2) {
		    	  System.out.println("Enter the ZIPCODE");
		    	  prodzip=scan.next();
		    	  String sql ="select distinct * from Shipping,CityDetails where ProdZip=? AND Shipping.ProdZip = CityDetails.Zipcode";
		    	  PreparedStatement stm = c.prepareStatement(sql);
		    	  stm.setString(1, prodzip.trim());
		    	  ResultSet rst = stm.executeQuery();
		    	  boolean flag=false;
		    	  while(rst.next()) {
		    		  flag=true;
		    		  System.out.println(rst.getString(1)+"  "+rst.getString(2)+" "+rst.getString(3)+"  "+rst.getString(4)+" "+rst.getString(5)+"  "+rst.getString(6));
		    	  }
		    	  if(flag==true) {
		    		  System.out.println("RECORDS FOUND :)");
		    	  }
		    	  else {
		    		  System.out.println("RECORDS NOT FOUND :(");
		    	  }
		      }
		      else if(q==3) {
		    	  System.out.println("Enter the Phone Number");
		    	  prodnum=scan.next();
		    	  String sql ="select distinct * from Shipping,CityDetails where ProdNum=? AND Shipping.ProdZip = CityDetails.Zipcode";
		    	  PreparedStatement stm = c.prepareStatement(sql);
		    	  stm.setString(1, prodnum.trim());
		    	  ResultSet rst = stm.executeQuery();
		    	  boolean flag=false;
		    	  while(rst.next()) {
		    		  flag=true;
		    		  System.out.println(rst.getString(1)+"  "+rst.getString(2)+" "+rst.getString(3)+"  "+rst.getString(4)+" "+rst.getString(5)+"  "+rst.getString(6));
		    	  }
		    	  if(flag==true) {
		    		  System.out.println("RECORDS FOUND :)");
		    	  }
		    	  else {
		    		  System.out.println("RECORDS NOT FOUND :(");
		    	  }
		      }
		      else if(q==4) {
		    	  System.out.println("Enter the Product Image URL");
		    	  prodimg=scan.next();
		    	  String sql ="select distinct * from Shipping,CityDetails where ProdImg=? AND Shipping.ProdZip = CityDetails.Zipcode";
		    	  PreparedStatement stm = c.prepareStatement(sql);
		    	  stm.setString(1, prodimg.trim());
		    	  ResultSet rst = stm.executeQuery();
		    	  boolean flag=false;
		    	  while(rst.next()) {
		    		  flag=true;
		    		  System.out.println(rst.getString(1)+"  "+rst.getString(2)+" "+rst.getString(3)+"  "+rst.getString(4)+" "+rst.getString(5)+"  "+rst.getString(6));
		    	  }
		    	  if(flag==true) {
		    		  System.out.println("RECORDS FOUND :)");
		    	  }
		    	  else {
		    		  System.out.println("RECORDS NOT FOUND :(");
		    	  }
		      }
		      else {
		    	  System.out.println("Please enter a PROPER NUMBER");
		      }
		      System.out.println("Enter 0 to exit or any other number to continue");
		      loop=scan.nextInt();
		      }
		      c.close();  
		    }
		    catch(Exception e)
		    { 
		      System.out.println(e);
		    }  
	}
}