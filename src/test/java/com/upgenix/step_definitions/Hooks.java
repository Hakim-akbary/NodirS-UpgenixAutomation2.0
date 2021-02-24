package com.upgenix.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.upgenix.utilities.Driver;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setUp(){

        //Maximize and implicitly wait added - Cemal
        Driver.get().manage().window().maximize();
        Driver.get().manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        System.out.println("\tthis is coming from BEFORE");
    }

    @After
    public void tearDown(Scenario scenario){

        if(scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshot");
        }

        System.out.println("\tthis is coming from After");
        Driver.closeDriver();


    }


}
