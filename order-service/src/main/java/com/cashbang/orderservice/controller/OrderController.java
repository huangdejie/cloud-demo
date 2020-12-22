package com.cashbang.orderservice.controller;

import com.cashbang.commonapi.facade.OrderService;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: huangdj
 * @Date: 2020/12/14
 */
@RestController
public class OrderController implements OrderService {
    @Override
    public String orders() {
        return "All Orders";
    }
}
