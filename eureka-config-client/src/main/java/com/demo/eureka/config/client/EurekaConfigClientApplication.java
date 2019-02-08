package com.demo.eureka.config.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaConfigClientApplication.class, args);
        System.out.println("配置服务器客户端端口8081:   http://localhost:8761");
        System.out.println("配置服务器客户端端读取配置服务器AVN的数据(注意密码和账号root,1234):   http://localhost:8081/home");
        System.out.println("直接访问:   http://localhost/svn/test-project/eureka/eureka-config-client-dev.yml");
    }

}

