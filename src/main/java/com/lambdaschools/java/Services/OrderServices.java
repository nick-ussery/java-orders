package com.lambdaschools.java.Services;

import com.lambdaschools.java.Views.OrderCounts;
import com.lambdaschools.java.models.Order;

import java.util.List;

public interface OrderServices {

    Order save(Order order);
    Order findById(long id);
    List<OrderCounts> findOrderCount();
}
