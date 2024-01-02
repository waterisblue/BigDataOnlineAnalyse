package com.bdoa.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @RequestMapping("/{name}")
    public String provider(@PathVariable("name") String name){
        return "Hi, You're " + name;
    }
}
