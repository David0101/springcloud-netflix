package com.jim.example.order.serviceprovider.impl;

import com.jim.springcloud.order.orderapi.OrderService;
import com.jim.springcloud.order.orderapi.dto.OrderDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderServiceImpl  implements OrderService {
    Logger logger = LoggerFactory.getLogger(OrderServiceImpl.class);
    @Override
    public String orders() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.info("Return All Orders-8082");
        return "Return All Orders-8082";
    }

    @Override
    public int insert(OrderDto dto) {
        logger.info("1 dto");
        return 1;
    }
}
