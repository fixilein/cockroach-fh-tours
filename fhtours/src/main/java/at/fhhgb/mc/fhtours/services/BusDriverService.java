package at.fhhgb.mc.fhtours.services;

import at.fhhgb.mc.fhtours.entities.BusDriver;
import at.fhhgb.mc.fhtours.repositories.BusDriverRepository;
import org.springframework.stereotype.Service;

//
@Service
public class BusDriverService {
    //
    private final BusDriverRepository busDriverRepository;

    //
    public BusDriverService(BusDriverRepository busDriverRepository) {
        this.busDriverRepository = busDriverRepository;
    }

    //
    public BusDriver save(BusDriver busDriver) {
        return busDriverRepository.save(busDriver);
    }
}