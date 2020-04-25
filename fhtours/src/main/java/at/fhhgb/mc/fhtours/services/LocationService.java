package at.fhhgb.mc.fhtours.services;

import at.fhhgb.mc.fhtours.entities.Location;
import at.fhhgb.mc.fhtours.repositories.LocationRepository;
import org.springframework.stereotype.Service;

//
@Service
public class LocationService {
    //
    private final LocationRepository locationRepository;

    //
    public LocationService(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    //
    public Location save(Location location) {
        return locationRepository.save(location);
    }
}