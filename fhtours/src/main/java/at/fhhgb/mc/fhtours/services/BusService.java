package at.fhhgb.mc.fhtours.services;

import at.fhhgb.mc.fhtours.entities.Bus;
import at.fhhgb.mc.fhtours.repositories.BusRepository;
import org.springframework.stereotype.Service;

//
@Service
public class BusService {
    //
    private final BusRepository busRepository;

    //
    public BusService(BusRepository busRepository) {
        this.busRepository = busRepository;
    }

    //
    public Bus save(Bus bus) {
        return busRepository.save(bus);
    }
}