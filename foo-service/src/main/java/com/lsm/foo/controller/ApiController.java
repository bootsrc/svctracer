package com.lsm.foo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RequestMapping("api")
@RestController
public class ApiController {

    @RequestMapping("date")
    public String date() {
        return new Date().toString();
    }
}