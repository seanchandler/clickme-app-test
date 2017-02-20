package com.ex.capabilities;

import com.ex.context.SpringContextFactory;

public class CapabilitiesFactory {

    public static Capabilities getCapabilities() {
        return (Capabilities) SpringContextFactory.getSpringContext().getBean("capabilities");
    }
}
