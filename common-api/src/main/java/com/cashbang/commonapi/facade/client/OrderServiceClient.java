package com.cashbang.commonapi.facade.client;

import com.cashbang.commonapi.facade.OrderService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Author: huangdj
 * @Date: 2020/12/14
 */
@FeignClient("order-service")
public interface OrderServiceClient extends OrderService {
}
