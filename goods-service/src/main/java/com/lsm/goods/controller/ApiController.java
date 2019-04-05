package com.lsm.goods.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

@RequestMapping("api")
@RestController
public class ApiController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("")
    public String index() {
        String dateStr = restTemplate.getForObject("http://localhost:28120/api/date", String.class);
        return "hello" + dateStr;
    }
}
