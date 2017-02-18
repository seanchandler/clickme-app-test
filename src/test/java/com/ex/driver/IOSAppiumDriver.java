package com.ex.driver;

import com.ex.appium.Appium;
import com.ex.capabilities.CapabilitiesFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;

/**
 * Created by sean on 10/11/16.
 */
public class IOSAppiumDriver implements Driver {
    @Override
    public AppiumDriver getDriver() {
        return new IOSDriver(Appium.getUrl(), CapabilitiesFactory.getCapabilities().getCapabilities());
    }
}
