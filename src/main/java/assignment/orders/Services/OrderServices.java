package assignment.orders.Services;

import assignment.orders.Views.OrderCounts;
import assignment.orders.models.Order;

import java.util.List;

public interface OrderServices {

    Order save(Order order);
    Order findById(long id);
    List<OrderCounts> findOrderCount();
}
