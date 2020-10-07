package com.automation.nrupesh.Screens;

import com.automation.nrupesh.DriverUtils;
import io.appium.java_client.MobileBy;

public class ProductDetails {
    //Locators
    public MobileBy.ById addToCartLocator = new MobileBy.ById(String.format("%s:id/add_to_cart_button",DriverUtils.packageName));
    public MobileBy.ById buynowLocator    = new MobileBy.ById(String.format("%s:id/buy_now_button",DriverUtils.packageName));



}




