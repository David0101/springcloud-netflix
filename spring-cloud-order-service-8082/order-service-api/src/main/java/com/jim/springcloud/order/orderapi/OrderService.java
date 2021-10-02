package com.jim.springcloud.order.orderapi;


import com.jim.springcloud.order.orderapi.dto.OrderDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public interface OrderService {

    @GetMapping("/orders")
    String orders();

    @PostMapping("/order")
    int insert(OrderDto dto);
}