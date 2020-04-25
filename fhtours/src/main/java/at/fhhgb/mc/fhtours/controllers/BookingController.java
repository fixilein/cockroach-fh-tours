package at.fhhgb.mc.fhtours.controllers;

import at.fhhgb.mc.fhtours.entities.Booking;
import at.fhhgb.mc.fhtours.services.BookingService;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.net.URI;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

//
@RepositoryRestController
public class BookingController {
    //
    private final BookingService bookingService;

    //
    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    //
    @RequestMapping(method = POST, value = "/booking")
    public @ResponseBody
    ResponseEntity<?> createBooking(@RequestBody Booking booking, HttpServletRequest request) {
        Booking createdBooking = bookingService.save(booking);
//
        URI createdUri = URI.create(request.getRequestURL().toString() + "/" + createdBooking.getId());
        return ResponseEntity.created(createdUri).body(createdBooking);
    }
}