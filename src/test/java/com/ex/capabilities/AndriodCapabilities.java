package com.ex.capabilities;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

/**
 * Created by sean on 10/12/16.
 */
public class AndriodCapabilities implements Capabilities {
    @Override
    public DesiredCapabilities getCapabilities() {

        File appDir = new File("src/test/resources");
        File app = new File(appDir, "app-debug.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
        capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        capabilities.setCapability(AndroidMobileCapabilityType.AVD, "Nexus_5_API_24");
        return capabilities;
    }
}
