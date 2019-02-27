package com.example.learnboot1.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component
@ConfigurationProperties(prefix = "sp")
public class TestConfig2 {
    /**
     * 这就是默认读取application.properties中的 sp.url.注意:要用get and set
     */
    public String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
