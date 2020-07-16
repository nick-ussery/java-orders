package com.lambdaschools.java.Repositories;

import com.lambdaschools.java.Views.OrderCounts;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.lambdaschools.java.models.Order;

import java.util.List;

public interface OrdersRepository extends CrudRepository<Order, Long>
{
    @Query(value ="SELECT c.name as name, count(o.ordnum) as countorders From customers c LEFT JOIN orders o ON o.ordnum = c.custcode GROUP BY c.name ORDER BY countmenus desc", nativeQuery = true)
    List<OrderCounts> getOrderCounts();
}
