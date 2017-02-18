package com.ex.test;

import com.ex.appium.Appium;
import com.ex.driver.DriverFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.junit.After;
import org.junit.Before;

import java.util.logging.Logger;

public class TestBase {

    protected AppiumDriver<MobileElement> driver;
    protected Logger logger = Logger.getLogger(this.getClass().getName());

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
