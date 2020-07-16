package com.lambdaschools.java.Repositories;

import org.springframework.data.repository.CrudRepository;

import com.lambdaschools.java.models.Customer;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
    List<Customer> findByNameContainingIgnoreCase(String subname);
}
