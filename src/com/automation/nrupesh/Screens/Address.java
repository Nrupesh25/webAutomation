package com.automation.nrupesh.Screens;

import com.automation.nrupesh.AndroidActions;
import com.automation.nrupesh.DriverUtils;
import com.automation.nrupesh.dataproviders.idn.IdnAddress;
import io.appium.java_client.MobileBy;

public class Address {
    private MobileBy.ById addNewAddressLocator = new MobileBy.ById(String.format("%s:id/text_view", DriverUtils.packageName));
    private MobileBy.ByXPath homeAddressLoacator = new MobileBy.ByXPath("//android.widget.EditText[contains(@text,'Home Address/Building and Floor')]");
    private MobileBy.ByXPath roadAddressLoacator = new MobileBy.ByXPath("//android.widget.EditText[contains(@text,'Road/Lane Number, Locality')]");
    private MobileBy.ByXPath postalCodeLoacator = new MobileBy.ByXPath("//android.widget.EditText[contains(@text,'Postal Code')]");
    private MobileBy.ById l1DropdownLocator = new MobileBy.ById(String.format("%s:id/level1_button", DriverUtils.packageName));
    //private MobileBy.ByXPath idnL1valueLocator = new MobileBy.ByXPath("//android.widget.TextView[contains(@text,'DKI Jakarta')]");
    private MobileBy.ById l2DropdownLocator = new MobileBy.ById(String.format("%s:id/button_level2", DriverUtils.packageName));
    //private MobileBy.ByXPath idnL2valueLocator = new MobileBy.ByXPath("//android.widget.TextView[contains(@text,'Kota Administrasi Jakarta Pusat')]");
    private MobileBy.ById l3DropdownLocator = new MobileBy.ById(String.format("%s:id/button_level3", DriverUtils.packageName));
    //private MobileBy.ByXPath idnL3valueLocator = new MobileBy.ByXPath("//android.widget.TextView[contains(@text,'Gambir')]");
    public MobileBy.ById confirmAddressLocator = new MobileBy.ById(String.format("%s:id/bottom_button", DriverUtils.packageName));
    public MobileBy.ById addAddressLocator = new MobileBy.ById(String.format("%s:id/add_address", DriverUtils.packageName));

    public void fillAddress(IdnAddress idnaddressdp){
        AndroidActions.click(addNewAddressLocator);
        AndroidActions.enterText(idnaddressdp.homeaddress,homeAddressLoacator);
        AndroidActions.enterText(idnaddressdp.road,roadAddressLoacator);
        AndroidActions.enterText(idnaddressdp.postalcode,postalCodeLoacator);
        DriverUtils.getAndroidDriver().hideKeyboard();
        AndroidActions.click(l1DropdownLocator);
        AndroidActions.click(getIdnZoneLocator(idnaddressdp.l1province));
        AndroidActions.click(l2DropdownLocator);
        AndroidActions.click(getIdnZoneLocator(idnaddressdp.l2city));
        AndroidActions.click(l3DropdownLocator);
        AndroidActions.click(getIdnZoneLocator(idnaddressdp.l3kacamatan));
        AndroidActions.click(confirmAddressLocator);

    }

    private MobileBy.ByXPath getIdnZoneLocator(String matchingText){
       return new MobileBy.ByXPath(String.format("//android.widget.TextView[contains(@text,'%s')]",matchingText));
    }



}
