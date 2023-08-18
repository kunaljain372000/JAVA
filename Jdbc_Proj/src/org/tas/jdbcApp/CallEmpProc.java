package org.tas.jdbcApp;

import java.sql.*;


public class CallEmpProc {
    public static void main(String[] args) throws SQLException {
        
        String url = "jdbc:mysql://10.0.2.134:3306/kunaldb";
        String userName = "kunalj";
        String password = "Kunal@SQL_DB";

      
        String query = "{CALL procedure_name()}";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        
            Connection connection = DriverManager.getConnection(url, userName, password);
            CallableStatement prepareCall = connection.prepareCall(query);

          
            ResultSet rs = prepareCall.executeQuery();
            while (rs.next()) {
                String result = rs.getString(1); 
                String result2 = rs.getString(2);
                String result3 = rs.getString(3);
                System.out.println("id: " + result);
                System.out.println("name: " + result2);
                System.out.println("mobile: " + result3);
            }
            System.out.println();
            System.out.println("Data fetched successfully");
            rs.close();
            prepareCall.close();
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
//DELIMITER &&  
//CREATE PROCEDURE procedure_name [[IN | OUT | INOUT] parameter_name datatype [, parameter datatype]) ]    
//BEGIN    
//    Declaration_section    
//    Executable_section    
//END &&  
//DELIMITER ;   