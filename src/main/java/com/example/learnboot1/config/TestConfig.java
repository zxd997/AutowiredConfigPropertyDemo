package com.example.learnboot1.config;

import com.example.learnboot1.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.converter.StringHttpMessageConverter;

import java.nio.charset.Charset;

@Configuration
//@ComponentScan("com.example.learnboot1.config")//其实用不到加这个
//@PropertySource(value = {"classpath:application.properties"})//其实不加默认也是他
public class TestConfig {
    @Value("${timor}")
    public String name;
    public String getName(){
        return name+"1";
    }
    @Bean
    public Student getStudent(){
        Student student = new Student();
        student.setSage("45");
        student.setSname("xiohua");
        return student;
    }
    /**
     * 配置编码转换,其实默认就是utf8
     */
    @Bean
    public StringHttpMessageConverter stringHttpMessageConverter(){
        return new StringHttpMessageConverter(Charset.forName("utf-8"));
    }
}
