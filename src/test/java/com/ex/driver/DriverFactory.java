package com.ex.driver;

import com.ex.context.SpringContextFactory;
import io.appium.java_client.AppiumDriver;
import org.springframework.beans.factory.annotation.Value;

/**
 * Created by sean on 10/11/16.
 */
public class DriverFactory {

    @Value("${app.platform}")
    private static String platform = null;
    private static Driver driver = null;

    public static AppiumDriver getDriver() {
        if (driver == null) {
            driver = (Driver) SpringContextFactory.getSpringContext().getBean("driver");
        }
        return driver.getDriver();
    }

}
