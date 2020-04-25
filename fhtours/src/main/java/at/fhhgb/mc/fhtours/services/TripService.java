package at.fhhgb.mc.fhtours.services;

import at.fhhgb.mc.fhtours.entities.Trip;
import at.fhhgb.mc.fhtours.repositories.TripRepository;
import org.springframework.stereotype.Service;

//
@Service
public class TripService {
    //
    private final TripRepository tripRepository;

    //
    public TripService(TripRepository tripRepository) {
        this.tripRepository = tripRepository;
    }

    //
    public Trip save(Trip trip) {
        return tripRepository.save(trip);
    }
}