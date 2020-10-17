/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ShaunLee
 */
public class Customer {


    public int CustomerId;
    public String CustomerName;
    public String CustomerEmail ;
    public String PhoneNumber ;
    public String IdentificationNo;

    public Customer(String CustomerName, String CustomerEmail, String PhoneNumber, String IdentificationNo) {
        this.CustomerName = CustomerName;
        this.CustomerEmail = CustomerEmail;
        this.PhoneNumber = PhoneNumber;
        this.IdentificationNo = IdentificationNo;
    }
    
    
    public Customer(){
    }
    
    public int getCustomerId() {
        return CustomerId;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public String getCustomerEmail() {
        return CustomerEmail;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public String getIdentificationNo() {
        return IdentificationNo;
    }

    public void setCustomerId(int CustomerId) {
        this.CustomerId = CustomerId;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public void setCustomerEmail(String CustomerEmail) {
        this.CustomerEmail = CustomerEmail;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public void setIdentificationNo(String IdentificationNo) {
        this.IdentificationNo = IdentificationNo;
    }
    
}
