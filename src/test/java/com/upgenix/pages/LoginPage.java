package com.upgenix.pages;

import com.upgenix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id="login")
    public WebElement loginEmail;

    @FindBy(id="password")
    public WebElement loginPassword;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement submit;


    public void login(String email, String password) {
        loginEmail.sendKeys(email);
        loginPassword.sendKeys(password);
        submit.click();
    }

}