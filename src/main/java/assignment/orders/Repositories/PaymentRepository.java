package assignment.orders.Repositories;

import org.springframework.data.repository.CrudRepository;

import assignment.orders.models.Payment;

public interface PaymentRepository extends CrudRepository<Payment, Long> {
}
