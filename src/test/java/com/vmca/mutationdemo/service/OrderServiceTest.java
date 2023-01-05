package com.vmca.mutationdemo.service;

import com.vmca.mutationdemo.dao.OrderDAO;
import com.vmca.mutationdemo.model.Order;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceTest {


    @Mock
    OrderDAO orderDAO;
    List<Order> orders;
    @InjectMocks
    OrderService orderService;
    @BeforeEach
    public void init(){
        MockitoAnnotations.openMocks(this);
    }
    @Test
    void getOrders() {
        Mockito.when(orderDAO.getOrders()).thenCallRealMethod();
        orders = orderService.getOrders();
        assertNotNull(orders);
        assertEquals(1, orders.size());
        assertEquals("123", orders.get(0).getOrderNumber());
    }
}