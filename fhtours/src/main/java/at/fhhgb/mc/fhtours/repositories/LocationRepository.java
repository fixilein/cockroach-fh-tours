package at.fhhgb.mc.fhtours.repositories;

import at.fhhgb.mc.fhtours.entities.Location;
import at.fhhgb.mc.fhtours.entities.Pets;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.UUID;

//

//
@RepositoryRestResource(collectionResourceRel = "location", path = "location")
public interface LocationRepository extends PagingAndSortingRepository<Location, UUID> {
    //
    List findByName(@Param("name") String name);
}