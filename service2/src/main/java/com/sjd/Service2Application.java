package com.sjd;/**
 * @projectname nacos
 * @author xinao
 * @create 2021/11/4
 */

import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author sunjidong
 * @Date 2021/11/4
 * @Describtion
 **/
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@MapperScan("com.sjd.mapper")
public class Service2Application {
    public static void main(String[] args) {
        SpringApplication.run(Service2Application.class,args);
    }
}
