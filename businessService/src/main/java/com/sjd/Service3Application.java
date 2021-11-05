package com.sjd;/**
 * @projectname nacos
 * @author xinao
 * @create 2021/11/4
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author sunjidong
 * @Date 2021/11/4
 * @Describtion
 **/
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class Service3Application {
    public static void main(String[] args) {
        SpringApplication.run(Service3Application.class,args);
    }



}
