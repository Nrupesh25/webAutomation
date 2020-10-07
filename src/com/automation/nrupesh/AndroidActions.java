package com.automation.nrupesh;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.lang.Thread.sleep;
import static java.time.Duration.ofSeconds;


public  class AndroidActions {


    public static void enterText(String text, MobileBy.ByXPath mobileBy){
        DriverUtils.waitForElement(mobileBy);
        MobileElement textfield = DriverUtils.getAndroidDriver().findElement(mobileBy);
        textfield.sendKeys(text);
    }
    public static void enterText(String text, MobileBy.ById mobileBy) {
        DriverUtils.waitForElement(mobileBy);
        MobileElement textfield = DriverUtils.getAndroidDriver().findElement(mobileBy);
        textfield.sendKeys(text);
    }
    public static void click(MobileBy.ByAccessibilityId mobileBy){
        DriverUtils.waitForElement(mobileBy);
        MobileElement element = DriverUtils.getAndroidDriver().findElement(mobileBy);
        element.click();
    }

    public static void click(MobileBy.ByXPath byXPath){
        DriverUtils.waitForElement(byXPath);
        MobileElement element = DriverUtils.getAndroidDriver().findElement(byXPath);
        element.click();
    }
    public static void click(MobileBy.ById byId){
        DriverUtils.waitForElement(byId);
        MobileElement element = DriverUtils.getAndroidDriver().findElement(byId);
        element.click();
    }

    public static void scroll(int x , int y) {
        int startY = (int) (DriverUtils.ad.manage().window().getSize().getHeight() * 0.90);
        int endY = (int) (DriverUtils.ad.manage().window().getSize().getHeight() * 0.10);
        TouchAction action = new TouchAction(DriverUtils.ad);
        action.press(point(500, startY)).waitAction(waitOptions(ofSeconds(3))).moveTo(point(10, endY)).release().perform();
    }
}

