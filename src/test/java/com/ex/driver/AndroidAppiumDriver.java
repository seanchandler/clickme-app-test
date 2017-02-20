package com.ex.driver;

import com.ex.appium.Appium;
import com.ex.capabilities.CapabilitiesFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AndroidAppiumDriver implements Driver {
    @Override
    public AppiumDriver getDriver() {
        return new AndroidDriver<MobileElement>(Appium.getUrl(), CapabilitiesFactory.getCapabilities().getCapabilities());
    }
}
