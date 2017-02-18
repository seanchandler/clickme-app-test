package com.ex.driver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

/**
 * Created by sean on 10/11/16.
 */
public interface Driver {

    AppiumDriver<MobileElement> getDriver();
}
