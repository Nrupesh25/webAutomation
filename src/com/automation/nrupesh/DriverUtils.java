package com.automation.nrupesh;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.Set;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofSeconds;

public class DriverUtils {

    static AndroidDriver<AndroidElement> ad = null;
    public static String packageName = "com.zilingo.users.alpha.minSdk21.debug";

    public static AndroidDriver<AndroidElement> getAndroidDriver() {
        if (ad == null) {
            DesiredCapabilities Autodc = new DesiredCapabilities();
            Autodc.setCapability(MobileCapabilityType.DEVICE_NAME, "2c305a06");
            Autodc.setCapability("platform", "android");
            Autodc.setCapability("appPackage", packageName);
            Autodc.setCapability("appActivity", "com.zilingo.users.launcher_activity.LauncherActivity");
            Autodc.setCapability("autowebview", true);
            Autodc.setCapability(AndroidMobileCapabilityType.RECREATE_CHROME_DRIVER_SESSIONS, true);
            Autodc.setCapability("newCommandTimeout", "120");
            //Autodc.setCapability("unicodeKeyboard", "true");
            //Autodc.setCapability("resetKeyboard", "true");
            //Autodc.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
            //Autodc.setCapability("noReset", true);
            Autodc.setCapability("chromedriverExecutable", "C://Users/nruki/IdeaProjects/webAutomation/src/driver/chromedriver.exe");
            try {
                ad = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), Autodc);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
        return ad;
    }

    public static void SetContextToWeb() {
        Set<String> contexthandles = DriverUtils.getAndroidDriver().getContextHandles();
        for (String s : contexthandles) {
            if (s.contains(String.format("WEBVIEW_%s",packageName))) {
                DriverUtils.getAndroidDriver().context(s);
                break;
            }
        }

        System.out.println("context set To WebView");
    }

    public static void SetContextToNative() throws InterruptedException {
        Set<String> contexthandles = DriverUtils.getAndroidDriver().getContextHandles();
        for (String s : contexthandles) {
            if (s.contains("NATIVE_APP")) {
                DriverUtils.getAndroidDriver().context(s);
            }
        }
        System.out.println("context set To Native App");
        Thread.sleep(3000);
    }

    public static  void waitForElement(MobileBy.ByXPath byXPath){
        WebDriverWait wd = new WebDriverWait(getAndroidDriver(),20);
        wd.until(ExpectedConditions.visibilityOfElementLocated(byXPath));
    }

    public static void waitForElement(MobileBy.ById mobileBy){
        WebDriverWait wd = new WebDriverWait(getAndroidDriver(),20);
        wd.until(ExpectedConditions.visibilityOfElementLocated(mobileBy));
    }

    public static void waitForElement(MobileBy.ByAccessibilityId mobileBy){
        WebDriverWait wd = new WebDriverWait(getAndroidDriver(),20);
        wd.until(ExpectedConditions.visibilityOfElementLocated(mobileBy));
    }

    public static void assertText(MobileBy.ByXPath mobileBy , String result){
        waitForElement(mobileBy);
        Assert.assertEquals(getAndroidDriver().findElement(mobileBy).getText(),result);
        System.out.println("Actual "+ getAndroidDriver().findElement(mobileBy).getText()+" Expected "+ result);

    }
}
