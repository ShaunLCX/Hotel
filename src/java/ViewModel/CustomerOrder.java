/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewModel;

import java.util.Date;

/**
 *
 * @author ShaunLee
 */
public class CustomerOrder {
    
    public String CustomerName;
    public String HotelName;
    public Date CheckInDate;
    public Date CheckOutDate;
    public String RoomName;

    public CustomerOrder() {
    }

    public CustomerOrder(String CustomerName, String HotelName, Date CheckInDate, Date CheckOutDate, String RoomName) {
        this.CustomerName = CustomerName;
        this.HotelName = HotelName;
        this.CheckInDate = CheckInDate;
        this.CheckOutDate = CheckOutDate;
        this.RoomName = RoomName;
    }
    
    

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public String getHotelName() {
        return HotelName;
    }

    public void setHotelName(String HotelName) {
        this.HotelName = HotelName;
    }

    public Date getCheckInDate() {
        return CheckInDate;
    }

    public void setCheckInDate(Date CheckInDate) {
        this.CheckInDate = CheckInDate;
    }

    public Date getCheckOutDate() {
        return CheckOutDate;
    }

    public void setCheckOutDate(Date CheckOutDate) {
        this.CheckOutDate = CheckOutDate;
    }

    public String getRoomName() {
        return RoomName;
    }

    public void setRoomName(String RoomName) {
        this.RoomName = RoomName;
    }
    
    
}
