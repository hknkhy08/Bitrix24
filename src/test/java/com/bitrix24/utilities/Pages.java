package com.bitrix24.utilities;

import com.bitrix24.pages.activityStream.ActivityStreamPage;
import com.bitrix24.pages.login.LoginPage;

public class Pages {

    private LoginPage loginPage;
    private ActivityStreamPage activityStreamPage;

    public LoginPage loginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public ActivityStreamPage activityStreamPage(){
        if(activityStreamPage == null){
            activityStreamPage = new ActivityStreamPage();
        }
        return activityStreamPage;
    }



}
