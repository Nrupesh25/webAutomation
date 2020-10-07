package com.automation.nrupesh.Screens;

import com.automation.nrupesh.AndroidActions;
import com.automation.nrupesh.DriverUtils;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;


public class LoginSignUp {

    //Locators
    public MobileBy.ByAccessibilityId navIconLocator = new MobileBy.ByAccessibilityId("Navigate up");
    public MobileBy.ByXPath loginSignUpLocator = new MobileBy.ByXPath("//android.widget.TextView[contains(@text,'Login or Signup')]");
    private MobileBy.ByXPath emailLocator = new MobileBy.ByXPath("//input[@type = 'text']");
    public MobileBy.ByXPath nameLocator = new MobileBy.ByXPath("//input[@name = 'name']");
    public MobileBy.ByXPath passwordLocator = new MobileBy.ByXPath("//input[@type = 'password']");
    private MobileBy.ByXPath submitLocator = new MobileBy.ByXPath("//button");
    private MobileBy.ByXPath countrycodeLocator = new MobileBy.ByXPath("//option[@value='+91']");
    private MobileBy.ByXPath phNumberLocator = new MobileBy.ByXPath("//input[@name = 'contactNumber']");
    private MobileBy.ByXPath termsAndConditionLocator = new MobileBy.ByXPath("//input[@name = 'TNC_CONSENT']");

    public String countryCode(){
        MobileElement countryCodeNum = DriverUtils.getAndroidDriver().findElement(countrycodeLocator);
        countryCodeNum.click();
        String code = DriverUtils.getAndroidDriver().findElement(countrycodeLocator).getText();
       String[] split = code.split("-");

        return split[1].trim();
    }

    public String enterPhonenumber(){
        DriverUtils.getAndroidDriver().executeScript("window.scrollBy(0,1000)");
        MobileElement phNoTextView = DriverUtils.getAndroidDriver().findElement(phNumberLocator);
        String Number = getRandompHNumber();
        phNoTextView.sendKeys(Number);
        return(Number);
    }

    public String getRandompHNumber() {
        long bigConstent = 9000000000l;
        long bigmultiplier = (long) (Math.random()*10000000);
        String phNumber = String.valueOf(bigmultiplier+bigConstent);
        return(phNumber);

    }
    public String enterNewUseremail(){
        MobileElement emailTextView = DriverUtils.getAndroidDriver().findElement(emailLocator);
        String randomEmail = "nru_"+getRandomLetter()+getRandomLetter()+ getRandomLetter()+"@gmail.com";
        emailTextView.sendKeys(randomEmail);
        return (randomEmail);
    }

    private char getRandomLetter() {
        return (char)(((int)(Math.random()*100))%26 + 97);
    }

    public void submit(){
        MobileElement submitButton = DriverUtils.getAndroidDriver().findElement(submitLocator);
        submitButton.click();
    }
    public void navdrawer(){
        DriverUtils.waitForElement(navIconLocator);
        MobileElement navdrawericon = DriverUtils.getAndroidDriver().findElement(navIconLocator);
        navdrawericon.click();
    }
    public void loginSignUp(){
        MobileElement loginSignUpText = DriverUtils.getAndroidDriver().findElement(loginSignUpLocator);
        loginSignUpText.click();
    }
    public void tnc(){
        MobileElement tandc = DriverUtils.getAndroidDriver().findElement(termsAndConditionLocator);
        tandc.click();
    }
    //Todo: add login data provider
    public void login() throws InterruptedException {
        DriverUtils.waitForElement(navIconLocator);
        AndroidActions.click(navIconLocator);
        AndroidActions.click(loginSignUpLocator);
        DriverUtils.SetContextToWeb();//Since our app is Hybrid and login screen is WebView we are setting the context
        AndroidActions.enterText("nru123@gmail.com",emailLocator);
        submit();
        AndroidActions.enterText("nrunru",passwordLocator);
        submit();
        DriverUtils.SetContextToNative();
    }


}
