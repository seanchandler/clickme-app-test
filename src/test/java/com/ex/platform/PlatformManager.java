package com.ex.platform;

import org.eclipse.jetty.io.RuntimeIOException;

/**
 * Created by sean on 10/12/16.
 */
public class PlatformManager {

//    @Value("${app.platform}")
    private static String platform = System.getProperty("app.platform");

    public static String getPlatform() {
        if (platform != null) {
            return platform;
        }
        else {
            throw new RuntimeIOException("missing -Dapp.platform=[ios,android]");
        }
    }
}
