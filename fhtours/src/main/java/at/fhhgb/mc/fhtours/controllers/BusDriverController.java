package at.fhhgb.mc.fhtours.controllers;

import at.fhhgb.mc.fhtours.entities.BusDriver;
import at.fhhgb.mc.fhtours.entities.Pets;
import at.fhhgb.mc.fhtours.services.BusDriverService;
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
public class BusDriverController {
    //
    private final BusDriverService busDriverService;

    //
    public BusDriverController(BusDriverService busDriverService) {
        this.busDriverService = busDriverService;
    }

    //
    @RequestMapping(method = POST, value = "/busdriver")
    public @ResponseBody
    ResponseEntity<?> createBusDriver(@RequestBody BusDriver busDriver, HttpServletRequest request) {
        BusDriver createdBusDriver = busDriverService.save(busDriver);
//
        URI createdUri = URI.create(request.getRequestURL().toString() + "/" + createdBusDriver.getId());
        return ResponseEntity.created(createdUri).body(createdBusDriver);
    }
}