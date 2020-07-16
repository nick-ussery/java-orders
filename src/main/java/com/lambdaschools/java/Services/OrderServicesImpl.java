package com.lambdaschools.java.Services;

import com.lambdaschools.java.Views.OrderCounts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lambdaschools.java.Repositories.OrdersRepository;
import com.lambdaschools.java.models.Order;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Transactional
@Service(value = "OrderServices")
public class OrderServicesImpl implements OrderServices
{
    @Autowired
    private OrdersRepository ordersRepo;

    @Transactional
    @Override
    public Order save(Order order)
    {
        return ordersRepo.save(order);
    }

    @Override
    public Order findById(long id) {
        Order o = new Order();
        o = ordersRepo.findById(id).orElseThrow(()->new EntityNotFoundException("Order " + id + " not found"));
        return o;
    }

    @Override
    public List<OrderCounts> findOrderCount() {
        return ordersRepo.getOrderCounts();
    }
}
