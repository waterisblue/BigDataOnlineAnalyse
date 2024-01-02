package com.bdoa.controller;

import com.bdoa.service.DSTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testcon")
public class TestController {
    @Autowired
    DSTestService dsTestService;

    @RequestMapping("/{name}")
    public String testCon(@PathVariable("name") String name){
        return dsTestService.provider(name);
    }
}
