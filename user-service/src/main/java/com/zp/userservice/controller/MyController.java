package com.zp.userservice.controller;

import com.zp.userservice.service.orderservice.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author zp
 * @date 2024/4/8 008
 */
@RestController
@RequestMapping("/user")
public class MyController {
    @RequestMapping("/hello")
    public String hello(@RequestHeader Map<String, String> headers) {
         // 获取请求头
        headers.forEach((key, value) -> {
            System.out.println("Header '" + key + "' = " + value);
        });
        System.out.println("userservice-hello");

        return "hello word!!!";
    }

    @Autowired
    private OrderService orderService;
    @RequestMapping("/aa")
    public String echo() {
        System.out.println("userservice-echo");
        return orderService.echo();
    }
}
