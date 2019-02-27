package com.example.learnboot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan("","")
//可以指定扫描bean的范围,com.这种的报名  ,
//@SpringBootApplication(exclude = {ResdisAutoConfiguration.class})

/**
 * 上面是排除自动配置,因为自动配置类种有很多数据源是自动配置的,如果想让自己手动配置就需要这样设置.
 */
@SpringBootApplication
public class Learnboot1Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(Learnboot1Application.class, args);
//        for (String name : applicationContext.getBeanDefinitionNames()) {
//            System.out.println(name);
//        }
    }
}

