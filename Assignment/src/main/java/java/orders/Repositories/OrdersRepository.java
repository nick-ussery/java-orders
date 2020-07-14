package java.orders.Repositories;

import org.springframework.data.repository.CrudRepository;

import java.orders.models.Order;

public interface OrdersRepository extends CrudRepository<Order, Long> {
}
