package com.sjd.controller;/**
 * @projectname nacos
 * @author xinao
 * @create 2021/11/4
 */

import com.sjd.model.TabStorage;
import com.sjd.service.ConsumerFeignService;
import com.sjd.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sunjidong
 * @Date 2021/11/4
 * @Describtion
 **/
@RestController
public class CosumerController {

    @Autowired
    private ConsumerFeignService consumerFeignService;

    @Autowired
    private StorageService storageService;

    @RequestMapping("/consumer")
    public String consumer(){
        return "success=========" + consumerFeignService.getConfigs();
    }

    @RequestMapping("/reduce")
    public String reduce(Integer id){
        return "success=========" + storageService.reduce();
    }

}
