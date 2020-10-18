# Hotel
Hotel Create Order Api
1. Using Netbean IDE 8.2 To run the project
2. MYSql Workbench 8.0 to store the data
3. Glassfish server 4.1.1
4. Postman 

#################################################################
1. Clone the project 
2. Open Netbean, go to Team tab and select Remote and select clone
3. Copy this url to clone the project -->   https://github.com/ShaunLCX/Hotel and select master branch
4. Open MYSql Workbench
5. Open the folder (sqlscript) to run the sql script to create the db
   1.1 First, run the createDBScript
   1.2 Second run the insert value to insert some value into the db.
6. Please add the jar files inside if the library inside are missing
7. To run the web service, Please do as the following:
    7.1 Run the project
    7.2 The service is sucess fully deploy if the browser pop up with this link ===>eg: http://localhost:8080/Hotel/resources/helloWorld
8. To run the create order web services , use postman to call the api ==========>eg: http://localhost:8080/Hotel/resources/bookings/createorder
    *************/Hotel/resources/bookings/createorder************************ This is a post method
9. Follow this sample format for the json 
   {
        "HotelID" : 3,
        "CustomerID" : 2,
        "RoomID" : 3,
        "CheckInDate":"2020-08-09T00:00:00.000Z",
        "CheckOutDate":"2020-09-30T00:00:00.000Z",
        "NumberOfGuest" : 6,
        "AmountPaid" : 1800.00
 }
 
 *******************************************************************************\
 Error that may occur
 1. If you see the error HTTP Status 500 - Internal Server Error during firing the create order api
    please fire the api again to create the order
 2. GlassFish server 4.1.1 may have error on the some jar files
    if does please replace the org.eclipse.persistence.moxy.jar file in the modules ======> glassfish-4.1.1\glassfish\modules

     


