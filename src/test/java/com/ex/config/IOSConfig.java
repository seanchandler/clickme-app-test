package com.ex.config;


import com.ex.capabilities.Capabilities;
import com.ex.capabilities.IOSCapabilities;
import com.ex.driver.Driver;
import com.ex.driver.IOSAppiumDriver;
import com.ex.page.HelloWorldPage;
import com.ex.page.ios.IOSHelloWorldPage;
import io.appium.java_client.ios.IOSDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class IOSConfig {

    @Bean(name = "driver")
    public Driver getDriver() {
        return new IOSAppiumDriver();
    }

    @Bean(name = "capabilities")
    public Capabilities getCapabilities() { return new IOSCapabilities(); }

    @Scope("prototype")
    @Bean(name = "helloworld")
    public HelloWorldPage getHelloWorldPage(IOSDriver driver) { return new IOSHelloWorldPage(driver); }
}
