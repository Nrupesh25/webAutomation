package com.automation.nrupesh.Screens;

import com.automation.nrupesh.DriverUtils;
import io.appium.java_client.MobileBy;

public class ProductListing {
    public MobileBy.ById productnameLocator = new MobileBy.ById(String.format("%s:id/product_name", DriverUtils.packageName));
}
