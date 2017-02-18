package com.ex.platform;


public class PlatformManager {

    private static String platform = System.getProperty("app.platform");

    public static String getPlatform() {
        if (platform != null) {
            return platform;
        }
        else {
            throw new RuntimeException("missing -Dapp.platform=[ios,android]");
        }
    }
}
