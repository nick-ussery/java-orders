package java.orders.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.orders.Repositories.OrdersRepository;
import java.orders.models.Order;

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
}
