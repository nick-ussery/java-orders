package java.orders.Repositories;

import org.springframework.data.repository.CrudRepository;

import java.orders.models.Payment;

public interface PaymentRepository extends CrudRepository<Payment, Long> {
}
