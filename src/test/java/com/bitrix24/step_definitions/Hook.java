package com.bitrix24.step_definitions;

import com.bitrix24.utilities.ConfigurationReader;
import com.bitrix24.utilities.Driver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hook {

    //default HOOK runs for any scenario
    @Before
    public void setup(Scenario scenario){
        System.out.println(scenario.getSourceTagNames());
        System.out.println(scenario.getName());
        System.out.println("BEFORE");
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @After
    public void teardown(Scenario scenario){
        if(scenario.isFailed()){
            TakesScreenshot takesScreenshot = (TakesScreenshot) Driver.getDriver();
            byte[] image = takesScreenshot.getScreenshotAs(OutputType.BYTES);
            //will attach screenshot into report
            scenario.embed(image, "image/png");
        }
        Driver.closeDriver();
        System.out.println("AFTER");
    }

}
