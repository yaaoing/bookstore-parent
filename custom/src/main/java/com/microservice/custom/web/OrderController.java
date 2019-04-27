package com.microservice.custom.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @RequestMapping("/submit/{orderId:\\d+}")
    public Object submit(@PathVariable("orderId") String orderId) {
        return "orderId = " + orderId + " confirmed!";
    }
}
