package com.sjd;/**
 * @projectname nacos
 * @author xinao
 * @create 2021/11/4
 */

import com.alibaba.nacos.api.NacosFactory;
import com.alibaba.nacos.api.config.ConfigService;
import com.alibaba.nacos.api.config.listener.Listener;
import com.alibaba.nacos.api.exception.NacosException;

import java.util.Properties;
import java.util.concurrent.Executor;

/**
 * @author sunjidong
 * @Date 2021/11/4
 * @Describtion
 **/
public class SimpleDemoMain {
    public static void main(String[] args) throws NacosException, InterruptedException {
        //使用nacos客户端远程获取nacos服务上的配置数据
        String dataId = "nacos-simple-demo.yaml";
        String group = "DEFAULT_GROUP";
        String remoteAddress = "127.0.0.1:8848";
        Properties properties = new Properties();
        properties.put("serverAddr",remoteAddress);
        properties.put("namespace","546897f2-ea83-4f86-9649-5de3b449fd34");
        ConfigService configService = NacosFactory.createConfigService(properties);
        String config = configService.getConfig(dataId, group, 5000);
        System.out.println(config);
        configService.addListener(dataId, group, new Listener() {
            @Override
            public Executor getExecutor() {
                return null;
            }

            @Override
            public void receiveConfigInfo(String configInfo) {
                System.out.println(configInfo);
            }
        });
        while (true){
            Thread.sleep(2000);
        }
    }
}
