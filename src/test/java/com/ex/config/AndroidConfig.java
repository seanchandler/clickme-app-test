package com.ex.config;


import com.ex.capabilities.AndriodCapabilities;
import com.ex.capabilities.Capabilities;
import com.ex.driver.AndroidAppiumDriver;
import com.ex.driver.Driver;
import com.ex.page.ClickMePage;
import com.ex.page.android.AndroidClickMePage;
import io.appium.java_client.ios.IOSDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AndroidConfig {

    @Bean(name = "driver")
    public Driver getDriver() {
        return new AndroidAppiumDriver();
    }

    @Bean(name = "capabilities")
    public Capabilities getCapabilities() { return new AndriodCapabilities(); }

    @Scope("prototype")
    @Bean(name = "clickMePage")
    public ClickMePage getClickMePage(IOSDriver driver) { return new AndroidClickMePage(driver); }
}
