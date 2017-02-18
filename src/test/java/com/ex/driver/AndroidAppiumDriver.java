package com.ex.driver;

import com.ex.appium.Appium;
import com.ex.capabilities.CapabilitiesFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

/**
 * Created by sean on 10/12/16.
 */
public class AndroidAppiumDriver implements Driver {
    @Override
    public AppiumDriver getDriver() {
        return new AndroidDriver(Appium.getUrl(), CapabilitiesFactory.getCapabilities().getCapabilities());
    }
}
