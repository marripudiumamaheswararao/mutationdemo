package com.vmca.mutationdemo.service;

import com.vmca.mutationdemo.dao.OrderDAO;
import com.vmca.mutationdemo.model.Order;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class OrderService {

    Logger logger = LoggerFactory.getLogger(OrderService.class);

    @Autowired
    OrderDAO orderDAO;
    public List<Order> getOrders(){

        logger.info("entered service" + 10);
        log.info("Entered");
        List<Order> orders = orderDAO.getOrders();
        log.info("Existing, orders -> " + orders);
        return orders;
    }
}
