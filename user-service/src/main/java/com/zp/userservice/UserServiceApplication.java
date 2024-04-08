package com.zp.userservice;

import com.zp.userservice.service.orderservice.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class UserServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }

    @RestController
    public class TestController {

        // private final RestTemplate restTemplate;
        //
        // public TestController(RestTemplate restTemplate) {this.restTemplate = restTemplate;}

        @Autowired
        private OrderService orderService;
        @RequestMapping("/aa")
        public String echo() {
            return orderService.echo();
            // return restTemplate.getForObject("http://orderservice/hello/", String.class);
        }
    }

}
