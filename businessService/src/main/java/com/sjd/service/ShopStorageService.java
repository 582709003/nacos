package com.sjd.service;/**
 * @projectname nacos
 * @author xinao
 * @create 2021/11/5
 */

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author sunjidong
 * @Date 2021/11/5
 * @Describtion
 **/
@FeignClient(name = "storageService2")
public interface ShopStorageService {
    @RequestMapping("/reduce")
    public String reduce(Integer id);
}
