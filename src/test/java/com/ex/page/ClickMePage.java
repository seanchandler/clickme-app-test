package com.ex.page;

public interface ClickMePage extends PageObject {

    String getButtonText();
    void tapButton();
    Boolean alertIsDisplayed();
    String getAlertText();
    void tapAlert();
}
