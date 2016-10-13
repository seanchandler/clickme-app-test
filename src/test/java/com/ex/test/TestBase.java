package com.ex.test;

import com.ex.driver.DriverFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.junit.After;
import org.junit.Before;
import org.springframework.context.annotation.Import;

/**
 * Created by sean on 10/9/16.
 */

@Import({PageConfig.class})
public class TestBase {

    protected AppiumDriver<MobileElement> driver;

    @Before
    public void setup() {
        driver = DriverFactory.getDriver();
    }

    @After
    public void teardown() {
        if (driver != null) {
            driver.removeApp("ccc.helloworld");
            driver.close();
        }
    }
}
