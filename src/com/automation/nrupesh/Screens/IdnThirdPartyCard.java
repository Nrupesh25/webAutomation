package com.automation.nrupesh.Screens;

import com.automation.nrupesh.AndroidActions;
import com.automation.nrupesh.DriverUtils;
import io.appium.java_client.MobileBy;

public class IdnThirdPartyCard {
    public MobileBy.ByXPath idnCardPasswordLocator = new MobileBy.ByXPath("//input[@type ='password' ]");
    public MobileBy.ByXPath confirmPasswordLocator = new MobileBy.ByXPath("//button[@name='ok' ]");

    public void paymentSuccess() throws InterruptedException {
        DriverUtils.SetContextToWeb();
        AndroidActions.enterText("112233",idnCardPasswordLocator);
        AndroidActions.click(confirmPasswordLocator);
        DriverUtils.SetContextToNative();
    }
}
