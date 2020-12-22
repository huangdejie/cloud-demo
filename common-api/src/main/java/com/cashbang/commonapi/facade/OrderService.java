package com.cashbang.commonapi.facade;

import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: huangdj
 * @Date: 2020/12/14
 */
public interface OrderService {

    @GetMapping("/orders")
    String orders();

}
