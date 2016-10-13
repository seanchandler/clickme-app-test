package com.ex.page;

/**
 * Created by sean on 10/9/16.
 */
public interface HelloWorldPage extends PageObject {

    String getButtonText();
    void tapButton();
    String getAlertText();
    void tapAlert();
}
