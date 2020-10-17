/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author ShaunLee
 */
public class Booking {
    
    public int BookingId;
     public int HotelID;
     public int CustomerID;
     public int RoomID;
     public Date CheckInDate;
    public Date CheckOutDate;
    public int NumberOfGuest;
    public double AmountPaid;

    public int getBookingId() {
        return BookingId;
    }

    public void setBookingId(int BookingId) {
        this.BookingId = BookingId;
    }

    public int getHotelID() {
        return HotelID;
    }

    public void setHotelID(int HotelID) {
        this.HotelID = HotelID;
    }

    public int getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(int CustomerID) {
        this.CustomerID = CustomerID;
    }

    public int getRoomID() {
        return RoomID;
    }

    public void setRoomID(int RoomID) {
        this.RoomID = RoomID;
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

    public int getNumberOfGuest() {
        return NumberOfGuest;
    }

    public void setNumberOfGuest(int NumberOfGuest) {
        this.NumberOfGuest = NumberOfGuest;
    }

    public double getAmountPaid() {
        return AmountPaid;
    }

    public void setAmountPaid(double AmountPaid) {
        this.AmountPaid = AmountPaid;
    }
    
    
    
}
