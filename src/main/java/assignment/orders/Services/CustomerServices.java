package assignment.orders.Services;

import assignment.orders.models.Customer;

import java.util.List;

public interface CustomerServices {
    Customer save(Customer customer);
    List<Customer> findAllCustomers();
    Customer findById(long id);
    List<Customer> findNameLike(String subname);
}
