package com.vmca.mutationdemo.controller;

import com.vmca.mutationdemo.model.Order;
import com.vmca.mutationdemo.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/orders")
    public List<Order> getOrders(){

        return orderService.getOrders();
    }
}
