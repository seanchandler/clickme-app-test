package com.ex.test;

import com.ex.page.ClickMePage;
import com.ex.page.PageFactory;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class ClickMeAppTest extends TestBase {

    @Test
    public void clickMeTest() throws Exception {
        ClickMePage helloWorldPage = (ClickMePage) PageFactory.getPage("clickMePage", driver);
        assertThat(helloWorldPage.getButtonText(), is(equalTo("Click Me")));

        helloWorldPage.tapButton();
        assertThat(helloWorldPage.alertIsDisplayed(), is(true));
        assertThat(helloWorldPage.getAlertText(), is(equalTo("Alert")));
    }

}
