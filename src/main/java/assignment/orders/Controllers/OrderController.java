package assignment.orders.Controllers;

import assignment.orders.Services.OrderServices;
import assignment.orders.Views.OrderCounts;
import assignment.orders.models.Customer;
import assignment.orders.models.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(name="/orders")
public class OrderController
{
    @Autowired
    private OrderServices orderServices;

    @GetMapping(name = "/order/{id}", produces = {"application/json"})
    public ResponseEntity<?> findOrderById(@PathVariable long id)
    {
        Order o = orderServices.findById(id);
        return new ResponseEntity<>(o, HttpStatus.OK);
    }

    @GetMapping(name = "/count", produces = {"application/json"})
    public ResponseEntity<?> findOrderCounts()
    {
        List<OrderCounts> myList = orderServices.findOrderCount();
        return new ResponseEntity<>(myList, HttpStatus.OK);
    }

}
