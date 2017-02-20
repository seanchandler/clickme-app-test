package com.ex.test;

import com.ex.appium.Appium;
import com.ex.driver.DriverFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.junit.After;
import org.junit.Before;

public class TestBase {

    protected AppiumDriver<MobileElement> driver;

    @Before
    public void setup() {
        Appium.start();
        driver = DriverFactory.getDriver();

    }

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
        Appium.stop();
    }
}
