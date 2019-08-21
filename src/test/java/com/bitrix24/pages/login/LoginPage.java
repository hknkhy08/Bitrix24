package com.bitrix24.pages.login;

import com.bitrix24.utilities.BrowserUtils;
import com.bitrix24.utilities.ConfigurationReader;
import com.bitrix24.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){ PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(css = "[name='USER_LOGIN']")
    @CacheLookup
    public WebElement userNameElement;

    @FindBy(css = "[name='USER_PASSWORD']")
    @CacheLookup
    public WebElement passwordElement;

    @FindBy(css ="[class='login-btn']")
    public WebElement loginButtonElement;

    @FindBy(id = "USER_REMEMBER")
    public WebElement rememberMeElement;

    @FindBy(css = "[class=login-link-forgot-pass]")
    public WebElement forgotPasswordElement;

    @FindBy(css = "[class=errortext]")
    public WebElement errorMessageElement;


    public void login(String username, String password){
        userNameElement.sendKeys(username);
        passwordElement.sendKeys(password);
        loginButtonElement.click();
    }

    public void login(){
        String username = ConfigurationReader.getProperty("helpdeskusername");
        String password = ConfigurationReader.getProperty("helpdeskpassword");
        userNameElement.sendKeys(username);
        passwordElement.sendKeys(password);
        loginButtonElement.click();
    }

    public void login(String role) {
        String username = "";
        String password = "";
        if (role.equalsIgnoreCase("helpdesk")) {
            username = ConfigurationReader.getProperty("helpdeskusername");
            password = ConfigurationReader.getProperty("helpdeskpassword");
        } else if (role.equalsIgnoreCase("marketing")) {
            username = ConfigurationReader.getProperty("marketingusername");
            password = ConfigurationReader.getProperty("marketingpassword");
        } else if (role.equalsIgnoreCase("hr")) {
            username = ConfigurationReader.getProperty("hrusername");
            password = ConfigurationReader.getProperty("hrpassword");
        }
        userNameElement.sendKeys(username);
        passwordElement.sendKeys(password);
        loginButtonElement.click();
    }

    public String getErrorMessage(){
        return errorMessageElement.getText();
    }

    public void clickRememberMe(){
        BrowserUtils.waitForClickablility(rememberMeElement, Integer.valueOf(ConfigurationReader.getProperty("SHORT_WAIT")));
        if(!rememberMeElement.isSelected()){
            rememberMeElement.click();
        }
    }

    public void goToLandingPage(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
}


