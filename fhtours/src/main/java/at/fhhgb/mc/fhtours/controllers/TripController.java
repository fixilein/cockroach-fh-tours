package at.fhhgb.mc.fhtours.controllers;

import at.fhhgb.mc.fhtours.entities.Trip;
import at.fhhgb.mc.fhtours.services.TripService;
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
public class TripController {
    //
    private final TripService tripService;

    //
    public TripController(TripService tripService) {
        this.tripService = tripService;
    }

    //
    @RequestMapping(method = POST, value = "/trip")
    public @ResponseBody
    ResponseEntity<?> createTrip(@RequestBody Trip trip, HttpServletRequest request) {
        Trip createdTrip = tripService.save(trip);
//
        URI createdUri = URI.create(request.getRequestURL().toString() + "/" + createdTrip.getId());
        return ResponseEntity.created(createdUri).body(createdTrip);
    }
}