package com.sjd.controller;/**
 * @projectname nacos
 * @author xinao
 * @create 2021/11/4
 */

import com.sjd.service.ShopOrderService;
import com.sjd.service.ShopStorageService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
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
    private ShopStorageService storageService;

    @Autowired
    private ShopOrderService shopOrderService;

    @GetMapping("/shop")
//    @GlobalTransactional(name = "sjd1",rollbackFor = Exception.class)
    @GlobalTransactional
    public String shop(){
        shopOrderService.createOrder();
        storageService.reduce(1);
        return "success";
    }

}
