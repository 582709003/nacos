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
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author sunjidong
 * @Date 2021/11/4
 * @Describtion
 **/
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
//这个注解加不加都一样，因为源码有地方已经加上了
@EnableTransactionManagement
@MapperScan("com.sjd.mapper")
public class Service1Application {
    public static void main(String[] args) {
        SpringApplication.run(Service1Application.class,args);
    }



}
