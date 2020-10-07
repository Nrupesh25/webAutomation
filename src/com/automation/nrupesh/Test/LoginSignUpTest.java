package com.automation.nrupesh.Test;

import com.automation.nrupesh.AndroidActions;
import com.automation.nrupesh.DriverUtils;
import com.automation.nrupesh.Screens.Account;
import com.automation.nrupesh.Screens.LoginSignUp;
import com.automation.nrupesh.Screens.RegionSelection;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.Point;
import org.testng.annotations.Test;

public class LoginSignUpTest {
    @Test
    public void loginHappyFlow() throws InterruptedException {
        RegionSelection regionSelection = new RegionSelection();
        regionSelection.setIndonesiaEnglish();
        LoginSignUp login = new LoginSignUp();
        Account accountActions = new Account();
        login.login();
        System.out.println("User has logged in");
        login.navdrawer();
        accountActions.account();
        Point scroll = DriverUtils.getAndroidDriver().findElement(accountActions.profileDetailsLocator).getLocation();
        AndroidActions.scroll(scroll.x,scroll.y);
        accountActions.logout();
        login.navdrawer();
        DriverUtils.assertText(login.loginSignUpLocator,"Login or Signup");
        System.out.println("User has logged out");
    }

    @Test
    public void newUserCustomSignup() throws InterruptedException {
        AndroidDriver<AndroidElement> ad = DriverUtils.getAndroidDriver();
        DriverUtils.getAndroidDriver().resetApp();
        RegionSelection regionSelection = new RegionSelection();
        regionSelection.setIndonesiaEnglish();
        LoginSignUp signup = new LoginSignUp();
        signup.navdrawer();
        signup.loginSignUp();
        DriverUtils.SetContextToWeb();
        String emailUsed = signup.enterNewUseremail();
        signup.submit();
        AndroidActions.enterText("nrunru",signup.passwordLocator);
        String nameUsed = "Nrupesh Automation";
        AndroidActions.enterText(nameUsed,signup.nameLocator);
        DriverUtils.getAndroidDriver().hideKeyboard();
        String codeUsed = signup.countryCode();
        String numberUsed = codeUsed+signup.enterPhonenumber();
        signup.tnc();
        signup.submit();
        DriverUtils.SetContextToNative();
        signup.navdrawer();
        Account accountActions = new Account();
        accountActions.account();
        accountActions.profileDetails();
        DriverUtils.assertText(accountActions.profileEmailLocator,emailUsed);
        DriverUtils.assertText(accountActions.profileNameLocator,nameUsed);
        DriverUtils.assertText(accountActions.profilepHNumberLocator,numberUsed);
    }
}
