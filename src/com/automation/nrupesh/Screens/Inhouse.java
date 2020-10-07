package com.automation.nrupesh.Screens;

import com.automation.nrupesh.AndroidActions;
import com.automation.nrupesh.DriverUtils;
import com.automation.nrupesh.dataproviders.idn.IdnCardDetails;
import io.appium.java_client.MobileBy;

public class Inhouse {

    public MobileBy.ByXPath cardNumberLocator = new MobileBy.ByXPath("//android.widget.EditText[contains(@text,'XXXX XXXX XXXX XXXX')]");
    public MobileBy.ByXPath cardHolderLocator = new MobileBy.ByXPath("//android.widget.EditText[contains(@text,'CARD HOLDER')]");
    public MobileBy.ByXPath expiryDateLocator = new MobileBy.ByXPath("//android.widget.EditText[contains(@text,'MM/YY')]");
    public MobileBy.ByXPath cvvLocator = new MobileBy.ByXPath("//android.widget.EditText[contains(@text,'CVV/CODE')]");
    public MobileBy.ById continueToReviewLocator = new MobileBy.ById(String.format("%s:id/continue_button", DriverUtils.packageName));

    public void enterCardDetails(IdnCardDetails idnCardDetails){
        AndroidActions.enterText(idnCardDetails.cardNumber,cardNumberLocator);
        AndroidActions.enterText(idnCardDetails.cardHolder,cardHolderLocator);
        AndroidActions.enterText(idnCardDetails.expiryDate,expiryDateLocator);
        AndroidActions.enterText(idnCardDetails.cvv,cvvLocator);
    }
}
