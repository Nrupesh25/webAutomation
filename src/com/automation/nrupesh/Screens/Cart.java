package com.automation.nrupesh.Screens;

import com.automation.nrupesh.DriverUtils;
import io.appium.java_client.MobileBy;

public class Cart {
    public MobileBy.ById continueToCheckout = new MobileBy.ById(String.format("%s:id/rl_continue", DriverUtils.packageName));
}
