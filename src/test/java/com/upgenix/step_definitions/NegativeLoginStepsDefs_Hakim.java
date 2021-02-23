package com.upgenix.step_definitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import com.upgenix.pages.LoginPage;

public class NegativeLoginStepsDefs_Hakim {



    @Then("the user should see {string}")
    public void the_user_should_see(String message) {

        LoginPage login = new LoginPage();
        String alertMessage = login.alertMessage.getText();

        Assert.assertEquals("To verify user is alerted about wrong email/password", message, alertMessage);

    }

    @Then("the user should be reminded to {string}")
    public void the_user_should_be_reminded_to(String message) {


        LoginPage login = new LoginPage();

        Assert.assertEquals("To verify that user is instructed to fill in the blank fields", message, login.loginEmail.getAttribute("validationMessage"));

    }


}
