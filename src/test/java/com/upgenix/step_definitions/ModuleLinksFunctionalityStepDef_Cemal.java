package com.upgenix.step_definitions;

import com.upgenix.pages.DashboardPage;
import com.upgenix.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ModuleLinksFunctionalityStepDef_Cemal {

    //This method is used to verify User Account Name after logging successfully in
    @Then("verify the {string}")
    public void verify_the(String expectedUserAccountName) {

        Assert.assertEquals(expectedUserAccountName, new DashboardPage().getUserName());
    }

    @Then("the user clicks on the modules to verify following page titles respectively")
    public void the_user_clicks_on_the_modules_to_verify_following_page_titles_respectively(List<String> expectedPageTitles) {

        Assert.assertEquals(expectedPageTitles, new DashboardPage().verifyingAccessByNavigatingModules());


    }
}

