package com.ex.capabilities;

import com.ex.context.SpringContextFactory;

/**
 * Created by sean on 10/12/16.
 */
public class CapabilitiesFactory {

    public static Capabilities getCapabilities() {
        return (Capabilities) SpringContextFactory.getSpringContext().getBean("capabilities");
    }
}
