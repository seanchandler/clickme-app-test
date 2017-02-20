package com.ex.driver;

import com.ex.appium.Appium;
import com.ex.capabilities.CapabilitiesFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;

public class IOSAppiumDriver implements Driver {
    @Override
    public AppiumDriver getDriver() {
        return new IOSDriver<MobileElement>(Appium.getUrl(), CapabilitiesFactory.getCapabilities().getCapabilities());
    }
}
