package com.ex.context;

import com.ex.config.AndroidConfig;
import com.ex.config.IOSConfig;
import com.ex.platform.PlatformManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by sean on 10/12/16.
 */
public class SpringContextFactory {

    private static ApplicationContext applicationContext = null;

    public static ApplicationContext getSpringContext() {
        if (applicationContext == null) {
            if (PlatformManager.getPlatform().equalsIgnoreCase("ios")) {
                applicationContext = new AnnotationConfigApplicationContext(IOSConfig.class);
            }
            else if (PlatformManager.getPlatform().equalsIgnoreCase("android")) {
                applicationContext = new AnnotationConfigApplicationContext(AndroidConfig.class);
            }
            else {
                throw new RuntimeException("unrecognized platform " + PlatformManager.getPlatform());
            }
        }
        return applicationContext;
    }
  }
