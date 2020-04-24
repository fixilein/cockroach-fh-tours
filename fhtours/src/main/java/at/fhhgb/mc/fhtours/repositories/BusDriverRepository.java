package at.fhhgb.mc.fhtours.repositories;

import at.fhhgb.mc.fhtours.entities.Bus;
import at.fhhgb.mc.fhtours.entities.BusDriver;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.UUID;

@RepositoryRestResource(collectionResourceRel = "busdriver", path = "busdriver")
public interface BusDriverRepository extends PagingAndSortingRepository<BusDriver, UUID> {
    //
    List findByName(@Param("name") String name);
}
