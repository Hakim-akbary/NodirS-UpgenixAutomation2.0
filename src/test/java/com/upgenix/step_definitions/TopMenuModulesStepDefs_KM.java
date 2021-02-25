package com.upgenix.step_definitions;

import com.upgenix.pages.DashboardPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class TopMenuModulesStepDefs_KM {

    @Then("User should be able to see all modules on the top menu")
    public void user_should_be_able_to_see_all_modules_on_the_top_menu(List<String> expectedModuleNames) {

        System.out.println("expectedModuleNames = " + expectedModuleNames);
        Assert.assertEquals(expectedModuleNames, new DashboardPage().modules());

    }
}
