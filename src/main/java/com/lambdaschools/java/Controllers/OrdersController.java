package com.lambdaschools.java.Controllers;

import com.lambdaschools.java.Services.OrderServices;
import com.lambdaschools.java.Views.OrderCounts;
import com.lambdaschools.java.models.Customer;
import com.lambdaschools.java.models.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrdersController
{
    @Autowired
    private OrderServices orderServices;

    @GetMapping(value = "/order/{id}", produces = {"application/json"})
    public ResponseEntity<?> findOrderById(@PathVariable long id)
    {
        Order o = orderServices.findById(id);
        return new ResponseEntity<>(o, HttpStatus.OK);
    }

    @GetMapping(value = "/count", produces = {"application/json"})
    public ResponseEntity<?> findOrderCounts()
    {
        List<OrderCounts> myList = orderServices.findOrderCount();
        return new ResponseEntity<>(myList, HttpStatus.OK);
    }

}
