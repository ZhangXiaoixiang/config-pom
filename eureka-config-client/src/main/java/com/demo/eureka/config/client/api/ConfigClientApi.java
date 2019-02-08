package com.demo.eureka.config.client.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ConfigClientApi
 * 配置客户端eureka-config-client
 * @author 10905 2019/2/8
 * @version 1.0
 */
@RestController
public class ConfigClientApi {

    @Autowired
    private Environment env;

    @RequestMapping("/home")
    public String home() {

        String name = env.getProperty("test.user.name");
        System.out.println("----进入了--配置客户端eureka-config-client--home()方法------"+name);
        return "Hello " + name;
    }
}
