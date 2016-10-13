package com.ex.config;


import com.ex.driver.Driver;
import com.ex.page.HelloWorldPage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IOSConfig {

    @Bean
    public Driver getDriver() {
        return null;
    }

    @Bean(name = "helloworld")
    public HelloWorldPage getHelloWorldPage() {
        return null;
    }
}
