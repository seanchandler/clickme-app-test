package com.ex.appium;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

import java.io.File;
import java.net.URL;


public class Appium {

    private static String appiumHomeDir = System.getProperty("appium.home", "/usr/local/lib/node_modules/appium");
    private static AppiumDriverLocalService appium;


    public static void start() {
        AppiumServiceBuilder builder = new AppiumServiceBuilder()
                .withAppiumJS(new File( String.format("%s%s", appiumHomeDir, "/build/lib/main.js")))
                .withArgument(GeneralServerFlag.LOG_LEVEL, "debug")
                .usingAnyFreePort();
        appium = builder.build();
        appium.start();
    }

    public static void stop() {
        appium.stop();
    }

    public static String getHomeDir() {
        return appiumHomeDir;
    }

    public static URL getUrl() {
        return appium.getUrl();
    }
}
