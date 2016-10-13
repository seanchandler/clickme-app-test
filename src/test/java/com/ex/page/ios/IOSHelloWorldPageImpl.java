package com.ex.page.ios;

import com.ex.page.HelloWorldPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IOSHelloWorldPageImpl implements HelloWorldPage {


    @FindBy(name = "CLICK ME")
    MobileElement helloButton;

    @FindBy(name = "Hello World")
    MobileElement helloAlert;

    public IOSHelloWorldPageImpl(IOSDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @Override
    public String getButtonText() {
        return helloButton.getText();
    }

    @Override
    public void tapButton() {
        helloButton.click();
    }

    @Override
    public String getAlertText() {
        return getAlertText();
    }

    @Override
    public void tapAlert() {
        helloAlert.click();
    }
}
