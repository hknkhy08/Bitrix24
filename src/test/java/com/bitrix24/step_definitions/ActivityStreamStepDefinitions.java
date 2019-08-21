package com.bitrix24.step_definitions;


import com.bitrix24.utilities.BrowserUtils;
import com.bitrix24.utilities.ConfigurationReader;
import com.bitrix24.utilities.Pages;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import javax.swing.*;


public class ActivityStreamStepDefinitions {

    Pages pages = new Pages();

    @Given("user is on the landing page")
    public void user_is_on_the_landing_page() {
        pages.loginPage().goToLandingPage();
    }

    @Given("user logs with marketing user credentials")
    public void user_logs_with_marketing_user_credentials() {
        String username = ConfigurationReader.getProperty("marketingusername");
        String password = ConfigurationReader.getProperty("marketingpassword");
        pages.loginPage().login(username, password);

    }


    @Then("user navigate to Activity Stream and Task module")
    public void user_navigate_to_Activity_Stream_and_Task_module() {
        pages.activityStreamPage().taskButton.click();

    }


    @Then("user fills Task Title")
    public void user_fills_Task_Title() {
        pages.activityStreamPage().taskTitle.click();
        pages.activityStreamPage().taskTitle.sendKeys("to do list", Keys.TAB);

        //pages.activityStreamPage().taskText.sendKeys("abcde");

    }


    @Then("user clicks Send button to Add Task")
    public void user_cliks_Send_button_to_Add_Task() {
        pages.activityStreamPage().sendButton.click();

    }

    @Then("user clicks Upload Files and clicks Select document from Bitrix24")
    public void user_clicks_Upload_Files_and_clicks_Select_document_from_Bitrix24() {
        pages.activityStreamPage().uploadFilesButton.click();
        pages.activityStreamPage().uploadFilesFrommBitrix24.click();
        pages.activityStreamPage().uploadFilesFromMyDrive.click();
        BrowserUtils.waitForClickablility(pages.activityStreamPage().selectCompanyDrive, 4);
        pages.activityStreamPage().selectCompanyDrive.click();


    }

    @Then("user chooses a file from Company Drive")
    public void user_chooses_an_file_from_My_Drive() {
        //BrowserUtils.waitForClickablility(pages.activityStreamPage().selectCompanyDrive,5).click();
        BrowserUtils.waitForClickablility(pages.activityStreamPage().selectMarketingAndAdvertisingFile,5);
        pages.activityStreamPage().selectMarketingAndAdvertisingFile.click();
        pages.activityStreamPage().selectLogoFile.click();
        pages.activityStreamPage().selectDocumentButotn.click();

    }

    @Then("user clicks Link button and writes Link Text and Link URL")
    public void user_cliks_Link_button_and_initials_Link_Text_and_Link_URL() {
        pages.activityStreamPage().linkButton.click();
        pages.activityStreamPage().linkText.sendKeys("deneme", Keys.TAB);
        pages.activityStreamPage().linkUrl.sendKeys("www.asdf.com");
        pages.activityStreamPage().linkSaveButton.click();

    }

    @Then("user clicks Checklist to add Things to do")
    public void user_cliks_Checklist_to_add_Things_to_do() {
        pages.activityStreamPage().checkListButton.click();
        pages.activityStreamPage().checkListText.sendKeys("TO DO ");
        pages.activityStreamPage().checkListAddButton.click();
    }

    @Then("user clicks Deadline and Select time")
    public void user_clicks_Deadline_and_Select_time() {
        pages.activityStreamPage().deadLineButton.click();
        pages.activityStreamPage().deadLineSelectButton.click();

    }





}
