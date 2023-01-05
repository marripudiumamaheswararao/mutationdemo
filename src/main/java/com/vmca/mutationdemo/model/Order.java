package com.vmca.mutationdemo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Order {

    private String orderNumber;
    private String productName;
    private String productPrice;
    private String deliveryLoc;
}
