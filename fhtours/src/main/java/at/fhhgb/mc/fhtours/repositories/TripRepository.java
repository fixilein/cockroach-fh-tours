package at.fhhgb.mc.fhtours.repositories;

import at.fhhgb.mc.fhtours.entities.Trip;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.sql.Date;
import java.util.List;
import java.util.UUID;

//

//
@RepositoryRestResource(collectionResourceRel = "trip", path = "trip")
public interface TripRepository extends PagingAndSortingRepository<Trip, UUID> {
    //
    // TODO add findBy method
}