package com.automation.nrupesh.Screens;

import com.automation.nrupesh.DriverUtils;
import io.appium.java_client.MobileBy;

public class PaymentOptions {

    public MobileBy.ById continueToReviewLocator = new MobileBy.ById(String.format("%s:id/continue_button", DriverUtils.packageName));
    public MobileBy.ById continueToInhouse = new MobileBy.ById(String.format("%s:id/continue_button", DriverUtils.packageName));
    public MobileBy.ByXPath codLocator = new MobileBy.ByXPath("//android.widget.TextView[contains(@text,'Cash On Delivery')]");
    public MobileBy.ByXPath creditCardLocator = new MobileBy.ByXPath("//android.widget.TextView[contains(@text,'Credit / Debit Card')]");
    public MobileBy.ByXPath payLaterLocator = new MobileBy.ByXPath("//android.widget.TextView[contains(@text,'Pay Later')]");
    private MobileBy.ById payLaterTncLocator = new MobileBy.ById(String.format("%s:id/terms_and_conditon_checkbox", DriverUtils.packageName));
}
