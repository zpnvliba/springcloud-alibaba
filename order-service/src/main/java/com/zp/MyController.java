package com.zp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zp
 * @date 2024/4/7 007
 */
@RestController
public class MyController {

    @Value("hello")
    private String name;

    @RequestMapping("/hello")
    public String hello() {
        System.out.println(11111111);
        return "hello word !!!" + "---" + name;
    }
}
