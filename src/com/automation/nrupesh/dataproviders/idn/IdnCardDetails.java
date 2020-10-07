package com.automation.nrupesh.dataproviders.idn;

public class IdnCardDetails {
    public String cardNumber;
    public String cardHolder;
    public String expiryDate;
    public String cvv;

    public  IdnCardDetails(String cardNumber, String cardHolder, String expiryDate, String cvv) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }
}
