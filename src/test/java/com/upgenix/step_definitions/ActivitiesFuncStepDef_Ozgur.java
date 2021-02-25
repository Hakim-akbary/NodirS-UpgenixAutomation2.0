package com.upgenix.step_definitions;

import com.upgenix.pages.BasePage;
import com.upgenix.pages.DashboardPage;
import com.upgenix.pages.LoginPage;
import com.upgenix.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ActivitiesFuncStepDef_Ozgur {

    BasePage basePage = new DashboardPage();

    @Then("Users should be able to see Activities link on the top menu")
    public void users_should_be_able_to_see_Activities_link_on_the_top_menu() {

        BrowserUtils.waitForVisibility(basePage.getUserName,5);

        Assert.assertTrue(basePage.activities.isDisplayed());
    }
}
