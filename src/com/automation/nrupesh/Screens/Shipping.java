package com.automation.nrupesh.Screens;

import com.automation.nrupesh.DriverUtils;
import io.appium.java_client.MobileBy;

public class Shipping {
    public MobileBy.ById contintueToPaymentLocator = new MobileBy.ById(String.format("%s:id/continue_button", DriverUtils.packageName));
    public MobileBy.ByXPath SicepetLocator = new MobileBy.ByXPath("//android.widget.TextView[contains(@text,'Sicepat Express')]");
}
