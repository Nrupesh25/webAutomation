package com.automation.nrupesh.Test;

import com.automation.nrupesh.AndroidActions;
import com.automation.nrupesh.Screens.*;
import com.automation.nrupesh.dataproviders.idn.IdnAddressProvider;
import com.automation.nrupesh.dataproviders.idn.IdnCardDetailsProviders;
import org.testng.annotations.Test;

public class CheckoutTest {
@Test
public void checkoutHappyflow()throws InterruptedException{
    RegionSelection regionSelection = new RegionSelection();
    LoginSignUp login = new LoginSignUp();
    Search search = new Search();
    ProductListing productListing = new ProductListing();
    ProductDetails productDetails = new ProductDetails();
    Cart cart = new Cart();
    Address address =   new Address();
    Shipping shipping = new Shipping();
    PaymentOptions paymentOptions = new PaymentOptions();
    Review review = new Review();
    regionSelection.setIndonesiaEnglish();
    login.login();
    search.searchProduct("PRO9972269042");
    AndroidActions.click(productListing.productnameLocator);
    AndroidActions.click(productDetails.buynowLocator);
    AndroidActions.click(cart.continueToCheckout);
    address.fillAddress(IdnAddressProvider.completeAddressS());
    AndroidActions.click(shipping.SicepetLocator);
    Thread.sleep(2000);
    AndroidActions.click(shipping.contintueToPaymentLocator);
    AndroidActions.click(paymentOptions.codLocator);
    Thread.sleep(2000);
    AndroidActions.click(paymentOptions.continueToReviewLocator);
    AndroidActions.click(review.placeOrderLocator);
}

    @Test
    public void checkoutCreditCardflow()throws InterruptedException{
        RegionSelection regionSelection = new RegionSelection();
        LoginSignUp login = new LoginSignUp();
        Search search = new Search();
        ProductListing productListing = new ProductListing();
        ProductDetails productDetails = new ProductDetails();
        Cart cart = new Cart();
        Address address =   new Address();
        Shipping shipping = new Shipping();
        PaymentOptions paymentOptions = new PaymentOptions();
        Inhouse inhouse = new Inhouse();
        Review review = new Review();
        IdnThirdPartyCard idnThirdPartyCard = new IdnThirdPartyCard();
        regionSelection.setIndonesiaEnglish();
        login.login();
        search.searchProduct("PRO9972269042");
        AndroidActions.click(productListing.productnameLocator);
        AndroidActions.click(productDetails.buynowLocator);
        AndroidActions.click(cart.continueToCheckout);
        address.fillAddress(IdnAddressProvider.completeAddressS());
        AndroidActions.click(shipping.contintueToPaymentLocator);
        AndroidActions.click(paymentOptions.creditCardLocator);
        Thread.sleep(2000);
        AndroidActions.click(paymentOptions.continueToInhouse);
        inhouse.enterCardDetails(IdnCardDetailsProviders.completeCardDetails());
        AndroidActions.click(inhouse.continueToReviewLocator);
        AndroidActions.click(review.placeOrderLocator);
        idnThirdPartyCard.paymentSuccess();
    }




}

