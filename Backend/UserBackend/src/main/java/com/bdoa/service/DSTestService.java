package com.bdoa.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "data-backend", path = "/test")
@Component
public interface DSTestService {
    @RequestMapping("/{name}")
    public String provider(@PathVariable("name") String name);
}
