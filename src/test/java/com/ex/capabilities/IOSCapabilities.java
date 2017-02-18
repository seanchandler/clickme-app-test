package com.ex.capabilities;

import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

/**
 * Created by sean on 10/12/16.
 */
public class IOSCapabilities implements Capabilities {
    @Override
    public DesiredCapabilities getCapabilities() {
        File appDir = new File("src/test/resources");
        File app = new File(appDir, "clickme.zip");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "IOS");
        capabilities.setCapability("deviceName", "iPhone 6");
        capabilities.setCapability("platformVersion", "10.2");
        capabilities.setCapability("automationName", "XCUITest");
        //sometimes environment has performance problems
        capabilities.setCapability(IOSMobileCapabilityType.LAUNCH_TIMEOUT, 500000);
        capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        return capabilities;
    }
}
