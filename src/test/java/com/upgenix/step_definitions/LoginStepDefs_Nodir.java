package com.upgenix.step_definitions;

import com.upgenix.pages.LoginPage;
import com.upgenix.utilities.ConfigurationReader;
import com.upgenix.utilities.Driver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs_Nodir {

    @When("the user enters {string} and {string}")
    public void theUserEntersAnd(String email, String password) {

        LoginPage loginPage = new LoginPage();
        loginPage.login(email, password);
    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {

        String actualPage = Driver.get().getTitle();
        Assert.assertEquals("Odoo", actualPage);

    }
}