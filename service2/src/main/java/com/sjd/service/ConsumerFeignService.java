package com.sjd.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author xinao
 * @projectname nacos
 * @create 2021/11/4
 */
@FeignClient("service1")
public interface ConsumerFeignService {

    @GetMapping("/getConfigs")
    public String getConfigs();
}
