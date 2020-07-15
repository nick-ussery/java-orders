package assignment.orders.Repositories;

import org.springframework.data.repository.CrudRepository;

import assignment.orders.models.Customer;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
    List<Customer> findByNameContainingIgnoreCase(String subname);
}
