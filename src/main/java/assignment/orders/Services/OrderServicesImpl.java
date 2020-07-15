package assignment.orders.Services;

import assignment.orders.Views.OrderCounts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import assignment.orders.Repositories.OrdersRepository;
import assignment.orders.models.Order;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Transactional
@Service(value = "orderServices")
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
