package com.lambdaschools.java.Services;

import com.lambdaschools.java.models.Customer;

import java.util.List;

public interface CustomerServices {
    Customer save(Customer customer);
    List<Customer> findAllCustomers();
    Customer findById(long id);
    List<Customer> findNameLike(String subname);
}
