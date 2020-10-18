/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqldb;

import helloworld.HelloWorldResource;
import java.sql.*;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import model.Customer;
import model.Booking;
import ViewModel.CustomerOrder;

/**
 *
 * @author ShaunLee
 */
public class BookingRepo {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/hotelorder?autoReconnect=true&useSSL=false";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "admin";

    public static CustomerOrder newOrder(Booking newBooking) {

        Connection conn = null;
        Statement stmt = null;
        CustomerOrder cusOrder=new CustomerOrder();
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

            String query = " Insert Into hotelorder.booking(HotelID, CustomerID, RoomID, CheckInDate, CheckOutDate,NumberOfGuest,AmountPaid)"
                    + " values (?, ?, ?, ?, ?,?,?)";
             Calendar calendar = Calendar.getInstance();
             java.sql.Date checkinDate = new java.sql.Date(newBooking.CheckInDate.getTime());
             java.sql.Date checkOutDate = new java.sql.Date(newBooking.CheckOutDate.getTime());
            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            preparedStmt.setInt(1, newBooking.HotelID);
            preparedStmt.setInt(2, newBooking.CustomerID);
            preparedStmt.setInt(3, newBooking.RoomID);
            preparedStmt.setDate(4, checkinDate);
            preparedStmt.setDate(5, checkOutDate);
            preparedStmt.setInt(6, newBooking.NumberOfGuest);
            preparedStmt.setDouble(7, newBooking.AmountPaid);
            preparedStmt.execute();
            int last_bookingId=0;
            ResultSet bookingId = preparedStmt.getGeneratedKeys();
                if(bookingId.next())
                {
                     last_bookingId = bookingId.getInt(1);
                }
            if(last_bookingId!=0){
             //STEP 4: Execute a query
            System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String selectSql;
            selectSql = "select hotelorder.customer.CustomerName,hotelorder.hotel.HotelName,hotelorder.room.RoomName,CheckInDate,CheckOutDate " +
                        "from hotelorder.booking " +
                        "INNER JOIN hotelorder.customer ON  hotelorder.booking.BookingId= hotelorder.customer.CustomerID " +
                        "INNER JOIN hotelorder.hotel ON hotelorder.booking.HotelID = hotelorder.hotel.HotelID " +
                        "INNER JOIN hotelorder.room ON hotelorder.booking.RoomID = hotelorder.room.RoomID where hotelorder.booking.BookingId="+last_bookingId;
            ResultSet rs = stmt.executeQuery(selectSql);

            //STEP 5: Extract data from result set
            while (rs.next()) {
                //Retrieve by column name
                cusOrder.CustomerName = rs.getString("CustomerName");
                cusOrder.HotelName = rs.getString("HotelName");
                cusOrder.RoomName= rs.getString("RoomName");
                cusOrder.CheckInDate= rs.getDate("CheckInDate");
                cusOrder.CheckOutDate= rs.getDate("CheckOutDate");

            }
            rs.close();
            stmt.close();
            conn.close();
            
            return cusOrder;
            }
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
        return cusOrder;

    }

}
