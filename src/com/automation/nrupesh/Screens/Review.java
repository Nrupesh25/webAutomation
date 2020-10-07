package com.automation.nrupesh.Screens;

import com.automation.nrupesh.DriverUtils;
import io.appium.java_client.MobileBy;

public class Review {
    public MobileBy.ById placeOrderLocator = new MobileBy.ById(String.format("%s:id/sticky_button", DriverUtils.packageName));
    public MobileBy.ById changeAddressLocator = new MobileBy.ById(String.format("%s:id/change_address", DriverUtils.packageName));
    public MobileBy.ById changePaymentLocator = new MobileBy.ById(String.format("%s:id/change", DriverUtils.packageName));
    public MobileBy.ById changeShippingLocator = new MobileBy.ById(String.format("%s:id/change_shipping", DriverUtils.packageName));
}
