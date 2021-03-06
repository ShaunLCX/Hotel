/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqldb;
import helloworld.HelloWorldResource;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import model.Customer;

/**
 *
 * @author ShaunLee
 */
public class CustomerRepo {

     static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/hotelorder?autoReconnect=true&useSSL=false";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "admin";

       
    public static Customer customerDetails()
    {
        Customer customerdetail=new Customer();
        Connection conn = null;
        Statement stmt = null;
        try {
            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            //STEP 3: Open a connection
            System.out.println("Connecting to database.....");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            //STEP 4: Execute a query
            System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT * FROM hotelorder.Customer ";
            ResultSet rs = stmt.executeQuery(sql);

            //STEP 5: Extract data from result set
            while (rs.next()) {
                //Retrieve by column name
                customerdetail.CustomerName = rs.getString("CustomerName");
                customerdetail.CustomerEmail = rs.getString("CustomerEmail");
                customerdetail.PhoneNumber= rs.getString("PhoneNumber");
                customerdetail.IdentificationNo= rs.getString("IdentificationNo");

            }
            //STEP 6: Clean-up environment
            rs.close();
            stmt.close();
            conn.close();
              return customerdetail;
        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            //finally block used to close resources
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException se2) {
            }// nothing we can do
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }//end finally try
        }//end try
    
            return customerdetail;
    }


}
