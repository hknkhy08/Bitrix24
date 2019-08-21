package com.bitrix24.pages.activityStream;

import com.bitrix24.utilities.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActivityStreamPage extends BasePage {


    @FindBy(xpath = "(//*[@class='menu-item-link-text'])[1]")
    public WebElement activityStreamButton;

    @FindBy(id = "feed-add-post-form-tab-message")
    public WebElement messageButton;

    @FindBy(id = "feed-add-post-form-tab-tasks")
    public WebElement taskButton;

    @FindBy(css = "#blog-submit-button-save")
    public WebElement sendButton;

    @FindBy(id = "feed-add-post-form-tab-calendar")
    public WebElement eventButton;

    @FindBy(css = "[name='ACTION[0][ARGUMENTS][data][TITLE]']")
    public WebElement taskTitle;

    @FindBy(id = "divlifefeed_task_form")
    public WebElement taskText;

    @FindBy(id = "bx-b-uploadfile-task-form-lifefeed_task_form")
    public WebElement uploadFilesButton;

    @FindBy(css = "[title='My Drive']")
    public WebElement uploadFilesFromMyDrive;

    @FindBy(xpath = "(//span[@class='wd-fa-add-file-light-title-text diskuf-selector-link'])[5]")
    public WebElement uploadFilesFrommBitrix24;

    @FindBy(xpath = "(//*[@class='bx-file-dialog-tab-item-link-text'])[3]")
    public WebElement selectCompanyDrive;

    @FindBy(xpath = "(//*[@class='bx-file-dialog-content-link bx-file-dialog-icon bx-file-dialog-icon-folder'])[1]")
    public WebElement selectMarketingAndAdvertisingFile;

    @FindBy(css = "[title='Name: Logo.gif']")
    public WebElement selectLogoFile;

    @FindBy(css = "[class='popup-window-button popup-window-button-accept']")
    public WebElement selectDocumentButotn;

    @FindBy(xpath = "(//*[@class='bxhtmled-top-bar-btn bxhtmled-button-link'])[2]")
    public WebElement linkButton;

    @FindBy(css = "#linklifefeed_task_form-text")
    public WebElement linkText;

    @FindBy(css = "#linklifefeed_task_form-href")
    public WebElement linkUrl;

    @FindBy(css = ".adm-btn-save")
    public WebElement linkSaveButton;

    @FindBy(css = ".tasks-task-mpf-link")
    public WebElement checkListButton;

    @FindBy(css = "[class='js-id-checklist-is-form-title task-checklist-field-add']")
    public WebElement checkListText;

    @FindBy(css = "[class='js-id-checklist-is-open-form task-dashed-link-inner']")
    public WebElement checkListAddButton;

    @FindBy(xpath = "(//*[@class='task-options-inp-container task-options-date t-empty'])[1]")
    public WebElement deadLineButton;

    @FindBy(xpath = "(//*[@class='bx-calendar-button-text'])[1]")
    public WebElement deadLineSelectButton;
















}
