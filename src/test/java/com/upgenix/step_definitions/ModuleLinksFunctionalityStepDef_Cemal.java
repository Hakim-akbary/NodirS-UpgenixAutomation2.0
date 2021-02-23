package com.upgenix.step_definitions;

import com.upgenix.pages.DashboardsPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class ModuleLinksFunctionalityStepDef_Cemal {

    //This method is used to verify User Account Name after logging successfully in
    @Then("verify the {string}")
    public void verify_the(String expectedUserAccountName) {

        Assert.assertEquals(expectedUserAccountName, new DashboardsPage().getUserName());
    }

    @Then("the user clicks on the modules to verify following page titles respectively")
    public void the_user_clicks_on_the_modules_to_verify_following_page_titles_respectively(List<String> expectedPageTitles) {

        Assert.assertEquals(expectedPageTitles, new DashboardsPage().verifyingAccessByNavigatingModules());

    }
}

