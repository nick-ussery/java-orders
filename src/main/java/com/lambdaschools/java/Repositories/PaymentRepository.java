package com.lambdaschools.java.Repositories;

import com.lambdaschools.java.models.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment, Long> {
}
