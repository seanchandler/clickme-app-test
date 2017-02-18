package com.ex.page.ios;

import com.ex.page.HelloWorldPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IOSHelloWorldPage implements HelloWorldPage {


    @FindBy(name = "Click Me")
    MobileElement button;

    @FindBy(name = "Alert")
    MobileElement alert;

    public IOSHelloWorldPage(IOSDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @Override
    public String getButtonText() {
        return button.getText();
    }

    @Override
    public void tapButton() {
        button.click();
    }

    @Override
    public Boolean alertIsDisplayed() {
        return alert.isDisplayed();
    }

    @Override
    public String getAlertText() {
        return alert.getText();
    }

    @Override
    public void tapAlert() {
        alert.click();
    }
}
