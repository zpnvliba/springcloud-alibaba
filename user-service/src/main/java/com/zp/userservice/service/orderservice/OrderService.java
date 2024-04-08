package com.zp.userservice.service.orderservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zp
 * @date 2024/4/7 007
 */
@FeignClient("orderservice")
public interface OrderService {
    @RequestMapping("/hello")
    String echo();
}
