package com.sjd.controller;/**
 * @projectname nacos
 * @author xinao
 * @create 2021/11/4
 */

import com.sjd.model.TabOrder;
import com.sjd.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sunjidong
 * @Date 2021/11/4
 * @Describtion
 **/
@RestController
@RefreshScope
public class NacosController {

    @Autowired
    private OrderService orderService;

    @Value("${spring.datasource.username}")
    private String name;

    @GetMapping("/getConfigs")
    public String getConfigs(){
        return name;
    }

    @GetMapping("/createOrder")
    public String createOrder(){
        boolean b = orderService.create();
        if (b) {
            return "success";
        }else {
            return "false";
        }

    }

}
