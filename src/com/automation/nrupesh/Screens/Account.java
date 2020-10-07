package com.automation.nrupesh.Screens;

import com.automation.nrupesh.DriverUtils;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;


public class Account {
    //Locators
    public MobileBy.ByXPath profileNameLocator = new MobileBy.ByXPath(String.format("//android.widget.LinearLayout[contains(@resource-id,'%s:id/name')]/android.widget.RelativeLayout/android.widget.LinearLayout[contains(@resource-id,'%s:id/text_input_layout')]/android.widget.FrameLayout/android.widget.EditText",DriverUtils.packageName,DriverUtils.packageName));
    public MobileBy.ByXPath profilepHNumberLocator = new MobileBy.ByXPath(String.format("//android.widget.LinearLayout[contains(@resource-id,'%s:id/number')]/android.widget.RelativeLayout/android.widget.LinearLayout[contains(@resource-id,'%s:id/text_input_layout')]/android.widget.FrameLayout/android.widget.EditText",DriverUtils.packageName,DriverUtils.packageName));
    public MobileBy.ByXPath profileEmailLocator = new MobileBy.ByXPath(String.format("//android.widget.LinearLayout[contains(@resource-id,'%s:id/email')]/android.widget.RelativeLayout/android.widget.LinearLayout[contains(@resource-id,'%s:id/text_input_layout')]/android.widget.FrameLayout/android.widget.EditText",DriverUtils.packageName,DriverUtils.packageName));
    public MobileBy.ByXPath accountLocator = new MobileBy.ByXPath(String.format("//android.widget.RelativeLayout[contains(@resource-id,'%s:id/nav_item_layout')]",DriverUtils.packageName));
    public MobileBy.ByXPath profileDetailsLocator = new MobileBy.ByXPath("//android.widget.TextView[contains(@text,'Profile')]");
    private MobileBy.ByXPath logoutLocator = new  MobileBy.ByXPath("//android.widget.Button[contains(@text,'LOGOUT')]");
    public MobileBy.ByXPath addressLocator = new MobileBy.ByXPath("//android.widget.TextView[contains(@text,'Addresses')]");



    public void account() {
        MobileElement account = DriverUtils.getAndroidDriver().findElement(accountLocator);
        account.click();
    }
    public void profileDetails() {
        MobileElement profile = DriverUtils.getAndroidDriver().findElement(profileDetailsLocator);
        profile.click();
    }
    public void logout() {
        MobileElement logout = DriverUtils.getAndroidDriver().findElement(logoutLocator);
        logout.click();
        MobileElement logoutPositive = DriverUtils.getAndroidDriver().findElementByXPath("//android.widget.TextView[contains(@text,'YES')]");
        logoutPositive.click();
    }


}

