package com.upgenix.pages;


import com.upgenix.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.upgenix.utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public abstract class  BasePage {


    //updated locators for UPGENIX
    // Add new ones as per your need

    //Ozgur added
    @FindBy(xpath = "//i[contains(@class,'fa fa-clock-o')]")
    public WebElement activities;

    @FindBy(xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li/a/span")
    public List<WebElement> menuOptions;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/ol/li")
    public WebElement pageSubTitle;

    @FindBy(xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[2]/li/a/span")
    public WebElement userName;

    @FindBy(xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[2]/li/ul/li[6]/a")
    public WebElement logOutLink;

    @FindBy(xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[2]/li/ul/li[5]/a")
    public WebElement myUser;


    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement getUserName;



    @FindBy(css = "div[class='loader-mask shown']")
    @CacheLookup
    protected WebElement loaderMask;

    //DropDown Modules More button - Cemal
    @FindBy(css = "#menu_more_container")
    public WebElement moreDropDownbtn;

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }


    /**
     * @return page name, for example: Dashboard
     */
    public String getPageSubTitle() {
        //ant time we are verifying page name, or page subtitle, loader mask appears
        waitUntilLoaderScreenDisappear();
//        BrowserUtils.waitForStaleElement(pageSubTitle);
        return pageSubTitle.getText();
    }


    /**
     * Waits until loader screen present. If loader screen will not pop up at all,
     * NoSuchElementException will be handled  bu try/catch block
     * Thus, we can continue in any case.
     */
    public void waitUntilLoaderScreenDisappear() {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.get(), 5);
            wait.until(ExpectedConditions.invisibilityOf(loaderMask));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public String getUserName(){
        waitUntilLoaderScreenDisappear();
        BrowserUtils.waitForVisibility(userName, 5);
        return userName.getText();
    }



    public void logOut(){
        BrowserUtils.waitFor(2);
        BrowserUtils.clickWithJS(userName);
        BrowserUtils.clickWithJS(logOutLink);
    }
    public void goToMyUser(){
        waitUntilLoaderScreenDisappear();
        BrowserUtils.waitForClickablility(userName, 5).click();
        BrowserUtils.waitForClickablility(myUser, 5).click();

    }

    //Navigating each module - Kuvat
    public List<String> modules() {

        List<WebElement> modules = Driver.get().findElements(By.xpath("//*[contains(@class,'-nav navbar-left')]/li"));
        List<WebElement> moreModules = Driver.get().findElements(By.xpath("//*[contains(@id,'menu_more_container')]//ul/li"));
        List<String> actualPageTitles = new ArrayList<>();

        for (int i = 0; i < modules.size(); i++) {
            WebElement module = modules.get(i);
            if(! module.getText().equals("")){
                actualPageTitles.add(module.getText());
            }

            if (module.getText().equals("More")) {
                moreDropDownbtn.click();
                BrowserUtils.waitFor(3);
                for (WebElement moreModule : moreModules) {
                    actualPageTitles.add(moreModule.getText());
                }
            }
        }
        actualPageTitles.remove("More");
        System.out.println("actualPageTitles = " + actualPageTitles);
        return actualPageTitles;
    }

    /*  Added by Cemal
         Users should be able to go all modules they have right to access
         via links on the top menu  */

   public List<String> verifyingAccessByNavigatingModules() {

        List<WebElement> modules = Driver.get().findElements(By.xpath("//*[contains(@class,'-nav navbar-left')]/li"));
        List<WebElement> moreModules = Driver.get().findElements(By.xpath("//*[contains(@id,'menu_more_container')]//ul/li"));
        List<String> actualPageTitles = new ArrayList<>();

        for (int i = 1; i < modules.size(); i++) {
            waitUntilLoaderScreenDisappear();
            WebElement module = modules.get(i);

            if (module.getText().contains("More")) {
                for (WebElement moreModule : moreModules) {
                    moreDropDownbtn.click();
                    BrowserUtils.waitFor(2);
                    moreModule.click();
                    actualPageTitles.add(Driver.get().getTitle());
                }
            }
            module.click();
            actualPageTitles.add(Driver.get().getTitle());
        }
        return actualPageTitles;
    }

}