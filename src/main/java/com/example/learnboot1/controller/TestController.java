package com.example.learnboot1.controller;

import com.example.learnboot1.config.TestConfig;
import com.example.learnboot1.config.TestConfig2;
import com.example.learnboot1.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    TestConfig2 testConfig2;
    @Autowired
    TestConfig testConfig;
    @Autowired
    Student student;
    @RequestMapping("/test1")
    public String get1(){
        return testConfig.name;
    }
    @RequestMapping("/test2")
    public String get2(){
        return testConfig.getName();
    }
    @RequestMapping("/test3")
    public Student get3(){
        return student;
    }
    @RequestMapping("/test4")
    public String get4(){
        return "你好";
    }

    @RequestMapping("/test5")
    public String get5(){
        return testConfig2.getUrl();
    }
}
