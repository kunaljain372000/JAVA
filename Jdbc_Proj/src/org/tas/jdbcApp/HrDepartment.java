package org.tas.jdbcApp;

import java.sql.*;

public class HrDepartment {

    public static void main(String[] args) {
        PreparedStatement pstmt = null;
        String selectQuery = "SELECT * FROM kunaldb.employee";
        String insertQuery = "INSERT INTO kunaldb.employee (id, name, password) VALUES (?, ?, ?)";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://10.0.2.134:3306/kunaldb", "kunalj", "Kunal@SQL_DB");

            pstmt = con.prepareStatement(selectQuery);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String password = rs.getString(3);

                System.out.println("Id:---" + id);
                System.out.println("Name:---" + name);
                System.out.println("Password:---" + password);
            }
            rs.close();
            pstmt.close();

            pstmt = con.prepareStatement(insertQuery);
            int newId = 4;
            String newName = "qaz";
            String newPassword = "qaz123";
            pstmt.setInt(1, newId);
            pstmt.setString(2, newName);
            pstmt.setString(3, newPassword);
            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("New employee inserted successfully!");
            } else {
                System.out.println("Failed to insert new employee.");
            }
            pstmt.close();

            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
