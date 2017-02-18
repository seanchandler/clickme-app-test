package com.ex.page.android;

import com.ex.page.ClickMePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by sean on 10/12/16.
 */
public class AndroidClickMePage implements ClickMePage {

    @FindBy(name = "CLICK ME")
    MobileElement button;

    @FindBy(name = "Hello World")
    MobileElement alert;

    public AndroidClickMePage(IOSDriver driver) {
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

