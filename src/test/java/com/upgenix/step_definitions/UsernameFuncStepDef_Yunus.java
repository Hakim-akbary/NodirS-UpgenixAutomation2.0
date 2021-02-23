package com.upgenix.step_definitions;

import com.upgenix.pages.BasePage;
import com.upgenix.pages.DashboardsPage;
import com.upgenix.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import org.junit.Assert;

public class UsernameFuncStepDef_Yunus {

   BasePage basePage = new DashboardsPage();

    @Given("I should be able to see {string} on the top menu")
    public void i_should_be_able_to_see_on_the_top_menu(String UsernameFunc) {

        BrowserUtils.waitForVisibility(basePage.getUserName,5);

        String actual = basePage.getUserName.getText();
        Assert.assertEquals(UsernameFunc,actual);

    }
}
