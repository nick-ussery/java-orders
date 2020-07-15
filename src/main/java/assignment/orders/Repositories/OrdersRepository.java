package assignment.orders.Repositories;

import org.springframework.data.repository.CrudRepository;

import assignment.orders.models.Order;

public interface OrdersRepository extends CrudRepository<Order, Long> {
}
