/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BookingService;

import ViewModel.CustomerOrder;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import model.Booking;
import sqldb.BookingRepo;

/**
 * REST Web Service
 *
 * @author ShaunLee
 */
@Path("bookings")
public class BookingsResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of BookingsResource
     */
    public BookingsResource() {
    }

    @POST
    @Path("/createorder")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String Booking(Booking booking)throws Exception {
      CustomerOrder cusOrder=new CustomerOrder();
      cusOrder=BookingRepo.newOrder(booking);
      return "Order Sucess \n" +
              "Customer Name : "+cusOrder.CustomerName+"\n"+
                "Hotel Name : "+cusOrder.HotelName+"\n"+
                "Room Name : "+cusOrder.RoomName+"\n"+
                "Check in Date : "+cusOrder.CheckInDate+"\n"+
                "Check Out Date : "+cusOrder.CheckOutDate;
    }
}
