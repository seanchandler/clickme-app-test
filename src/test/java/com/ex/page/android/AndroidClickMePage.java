package com.ex.page.android;

import com.ex.page.ClickMePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AndroidClickMePage implements ClickMePage {

    @FindBy(name = "CLICK ME")
    MobileElement button;

    @FindBy(name = "Alert")
    MobileElement alert;

    public AndroidClickMePage(AndroidDriver<MobileElement> driver) {
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