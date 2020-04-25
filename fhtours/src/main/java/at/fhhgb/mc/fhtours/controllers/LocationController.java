package at.fhhgb.mc.fhtours.controllers;

import at.fhhgb.mc.fhtours.entities.Location;
import at.fhhgb.mc.fhtours.services.LocationService;
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
public class LocationController {
    //
    private final LocationService locationService;

    //
    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    //
    @RequestMapping(method = POST, value = "/location")
    public @ResponseBody
    ResponseEntity<?> createLocation(@RequestBody Location location, HttpServletRequest request) {
        Location createdLocation = locationService.save(location);
//
        URI createdUri = URI.create(request.getRequestURL().toString() + "/" + createdLocation.getId());
        return ResponseEntity.created(createdUri).body(createdLocation);
    }
}