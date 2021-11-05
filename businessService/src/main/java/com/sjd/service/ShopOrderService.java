package com.sjd.service;/**
 * @projectname nacos
 * @author xinao
 * @create 2021/11/5
 */

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author sunjidong
 * @Date 2021/11/5
 * @Describtion
 **/
@FeignClient(name = "orderService1")
public interface ShopOrderService {
    @GetMapping("/createOrder")
    public String createOrder();
}
