package at.fhhgb.mc.fhtours.repositories;

import at.fhhgb.mc.fhtours.entities.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.UUID;

//

//
@RepositoryRestResource(collectionResourceRel = "customer", path = "customer")
public interface CustomerRepository extends PagingAndSortingRepository<Customer, UUID> {
    //
    List findByName(@Param("name") String name);
}