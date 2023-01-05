package com.vmca.mutationdemo.dao;

import com.vmca.mutationdemo.model.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrderDAO {
    public List<Order> getOrders() {
        List<Order> orders = null;
        orders = List.of(new Order("123", "Bag", "$100", "Hyd"));
        return orders;
    }
}
