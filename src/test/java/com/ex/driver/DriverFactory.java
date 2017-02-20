package com.ex.driver;

import com.ex.context.SpringContextFactory;
import io.appium.java_client.AppiumDriver;

public class DriverFactory {

    protected static Driver driver = null;

    public static AppiumDriver getDriver() {
        if (driver == null) {
            driver = (Driver) SpringContextFactory.getSpringContext().getBean("driver");
        }
        return driver.getDriver();
    }

}
