package org.tas.jdbcApp;

import java.sql.*;
import java.util.*;

public class AddEmployeeDetails {
	public static void main(String[] args) {
		Connection con = null;
	    PreparedStatement stmt = null;
	    Scanner s =  new Scanner(System.in);
	    System.out.println("Enter Employee ID (int):");
		int id = Integer.parseInt(s.nextLine());
	    System.out.println("Enter name ???");
	    String name = s.next();
	    System.out.println("Enter password ???");
	    String password=s.next();
		String qry = "insert into kunaldb.employee values(?,?,?)";
        try {
    	  Class.forName("com.mysql.cj.jdbc.Driver");
    	  con = DriverManager.getConnection("jdbc:mysql://10.0.2.134:3306/kunaldb","kunalj","Kunal@SQL_DB");
    	  stmt = con.prepareStatement(qry);
    	  
    	  stmt.setInt(1,id);
		  stmt.setString(2, name);
		  stmt.setString(3, password);
		  
		  stmt.execute();
		  
		  stmt.close();
		  con.close();
    	  
    	  
    	  
      }
      catch(ClassNotFoundException | SQLException e)
      {
    	  e.printStackTrace();  
      }
      
    }
}
	


