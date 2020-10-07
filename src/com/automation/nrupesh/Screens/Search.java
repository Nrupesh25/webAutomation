package com.automation.nrupesh.Screens;

import com.automation.nrupesh.AndroidActions;
import com.automation.nrupesh.DriverUtils;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.MobileBy;

public class Search {
    public MobileBy.ById searchLocator = new MobileBy.ById(String.format("%s:id/menu_search", DriverUtils.packageName));
    public MobileBy.ById entersearchLocator = new MobileBy.ById(String.format("%s:id/search_src_text", DriverUtils.packageName));
    //"PRO9972269042"
    public void searchProduct(String productId){
        AndroidActions.click(searchLocator);
        AndroidActions.enterText(productId, entersearchLocator);
        AndroidActions.click(entersearchLocator);
        DriverUtils.getAndroidDriver().executeScript("mobile: performEditorAction",
                ImmutableMap.of("action", "Done"));
    }
}
