package com.ex.driver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public interface Driver {

    AppiumDriver<MobileElement> getDriver();
}
