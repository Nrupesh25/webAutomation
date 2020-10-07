package com.automation.nrupesh.Screens;

import com.automation.nrupesh.DriverUtils;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;


public class RegionSelection {
    //Locators
    private MobileBy.ByXPath indonesiaEnglish = new MobileBy.ByXPath("//android.widget.TextView[contains(@text, 'Indonesia - English')]");

    public void setIndonesiaEnglish(){
        DriverUtils.waitForElement(indonesiaEnglish);
        MobileElement indonesiaEngReg = DriverUtils.getAndroidDriver().findElement(indonesiaEnglish);
        indonesiaEngReg.click();
    }
}
