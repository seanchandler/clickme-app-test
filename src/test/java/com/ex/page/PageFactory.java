package com.ex.page;


import com.ex.context.SpringContextFactory;
import org.springframework.context.ApplicationContext;

public class PageFactory {


    private static ApplicationContext applicationContext = null;

    public static PageObject getPage(String pageName) {
        ApplicationContext applicationContext = SpringContextFactory.getSpringContext();
        return (PageObject) applicationContext.getBean(pageName);
    }
}
