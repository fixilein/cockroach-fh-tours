package at.fhhgb.mc.fhtours.controllers;

import at.fhhgb.mc.fhtours.entities.Bus;
import at.fhhgb.mc.fhtours.services.BusService;
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
public class BusController {
    //
    private final BusService busService;

    //
    public BusController(BusService busService) {
        this.busService = busService;
    }

    //
    @RequestMapping(method = POST, value = "/bus")
    public @ResponseBody
    ResponseEntity<?> createBus(@RequestBody Bus bus, HttpServletRequest request) {
        Bus createdBus = busService.save(bus);
//
        URI createdUri = URI.create(request.getRequestURL().toString() + "/" + createdBus.getId());
        return ResponseEntity.created(createdUri).body(createdBus);
    }
}