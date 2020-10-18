create database if not exists testing;
use testing;
CREATE TABLE Customer (
    CustomerID int NOT NULL AUTO_INCREMENT ,
    CustomerName nvarchar(255),
    CustomerEmail nvarchar(255),
    PhoneNumber varchar(255),
    IdentificationNo varchar(255),
    PRIMARY KEY(CustomerID)
);

CREATE TABLE Hotel (
    HotelID int NOT NULL AUTO_INCREMENT ,
    HotelName nvarchar(255),
    Address nvarchar(255),
    PhoneNumber varchar(255),
    PRIMARY KEY(HotelID)
);

CREATE TABLE Room (
    RoomID int NOT NULL AUTO_INCREMENT ,
    RoomName nvarchar(255),
    RoomType nvarchar(255),
    PRIMARY KEY(RoomID)
);

CREATE TABLE Booking (
    BookingId int NOT NULL AUTO_INCREMENT,
    HotelID int NOT NULL ,
    CustomerID int NOT NULL,
    RoomID int NOT NULL,
    CheckInDate date,
	CheckOutDate date,
    NumberOfGuest int,
    AmountPaid DECIMAL(13,2),
    PRIMARY KEY(BookingId),
	FOREIGN KEY (CustomerID) REFERENCES Customer(CustomerID),
    FOREIGN KEY (HotelID) REFERENCES Hotel(HotelID),
	FOREIGN KEY (RoomID) REFERENCES Room(RoomID)
);