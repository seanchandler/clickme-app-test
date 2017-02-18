package com.ex.page;

/**
 * Created by sean on 10/9/16.
 */
public interface ClickMePage extends PageObject {

    String getButtonText();
    void tapButton();
    Boolean alertIsDisplayed();
    String getAlertText();
    void tapAlert();
}