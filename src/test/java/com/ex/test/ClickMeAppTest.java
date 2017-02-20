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
        ClickMePage clickMePage = (ClickMePage) PageFactory.getPage("clickMePage", driver);
        assertThat(clickMePage.getButtonText(), is(equalTo("Click Me")));

        clickMePage.tapButton();
        assertThat(clickMePage.alertIsDisplayed(), is(true));
        assertThat(clickMePage.getAlertText(), is(equalTo("Alert")));
    }

}
