package com.cashbang.userservice.controller;

import com.cashbang.commonapi.facade.client.OrderServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: huangdj
 * @Date: 2020/12/14
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private OrderServiceClient orderServiceClient;

    @GetMapping("/userOrders")
    public String getUserOrders(){
        return orderServiceClient.orders();
    }
}
