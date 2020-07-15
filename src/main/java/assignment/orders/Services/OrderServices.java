package assignment.orders.Services;

import assignment.orders.models.Order;

public interface OrderServices {

    Order save(Order order);
    Order findById(long id);
}
