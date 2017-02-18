package com.ex.page;


import com.ex.context.SpringContextFactory;
import io.appium.java_client.AppiumDriver;
import org.springframework.context.ApplicationContext;

public class PageFactory {


    private static ApplicationContext applicationContext = null;

    public static PageObject getPage(String pageName, AppiumDriver driver) {
        return (PageObject) SpringContextFactory.getSpringContext().getBean(pageName, driver);
    }
}
