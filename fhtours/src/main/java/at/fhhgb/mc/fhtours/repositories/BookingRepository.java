package at.fhhgb.mc.fhtours.repositories;

import at.fhhgb.mc.fhtours.entities.Booking;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.sql.Date;
import java.util.List;
import java.util.UUID;

//

//
@RepositoryRestResource(collectionResourceRel = "booking", path = "booking")
public interface BookingRepository extends PagingAndSortingRepository<Booking, UUID> {
    //
    // TODO add findBy Medthod
}