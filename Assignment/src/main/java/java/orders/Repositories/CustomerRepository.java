package java.orders.Repositories;

import org.springframework.data.repository.CrudRepository;

import java.orders.models.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
