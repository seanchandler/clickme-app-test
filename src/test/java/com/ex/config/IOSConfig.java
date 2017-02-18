package com.ex.config;


import com.ex.capabilities.Capabilities;
import com.ex.capabilities.IOSCapabilities;
import com.ex.driver.Driver;
import com.ex.driver.IOSAppiumDriver;
import com.ex.page.ClickMePage;
import com.ex.page.ios.IOSClickMePage;
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
    @Bean(name = "clickMePage")
    public ClickMePage getClickMePage(IOSDriver driver) { return new IOSClickMePage(driver); }
}
