package org.tas.jdbcApp;

import java.sql.*;


public class Top10 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://10.0.2.134:3306/kunaldb","kunalj","Kunal@SQL_DB");
			Statement stmt = con.createStatement();
			String qry = "select * from kunaldb.employee limit 10";
			ResultSet rs = stmt.executeQuery(qry);
			while(rs.next())
			{
				int id = rs.getInt(1);
				String name= rs.getString(2);
				String password= rs.getString(3);
				
				System.out.println("Id:---"+id);
				System.out.println("Name:---"+name);
				System.out.println("Password:---"+password);
			}
			rs.close();
			stmt.close();
			con.close();
		}
		catch(ClassNotFoundException| SQLException e)
		{
			e.printStackTrace();
		}
	}

}
