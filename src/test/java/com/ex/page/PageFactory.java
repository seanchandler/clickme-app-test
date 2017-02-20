package com.ex.page;

import com.ex.context.SpringContextFactory;
import io.appium.java_client.AppiumDriver;

public class PageFactory {

    public static PageObject getPage(String pageName, AppiumDriver driver) {
        return (PageObject) SpringContextFactory.getSpringContext().getBean(pageName, driver);
    }
}
