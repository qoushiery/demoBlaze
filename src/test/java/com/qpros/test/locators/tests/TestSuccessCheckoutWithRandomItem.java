package com.qpros.test.locators.tests;

import com.qpros.StaticStrings;
import com.qpros.test.locators.pages.CartDetailsPage;
import com.qpros.test.locators.pages.HomePage;
import com.qpros.test.locators.pages.ProductDetailsPage;
import com.qpros.utilities.ReadConfigPropertiesFile;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.Random;
@Test
public class TestSuccessCheckoutWithRandomItem extends BaseTest{
    public void executingSuccessCheckoutWithRandomItem(){
        HomePage homePage = new HomePage();
        ProductDetailsPage productDetailsPage = new ProductDetailsPage();
        CartDetailsPage cartDetailsPage = new CartDetailsPage();
        SoftAssert softAssert = new SoftAssert();

        Random random = new Random();
        String randNum = String.valueOf(random.nextInt(9) + 1);

        homePage.navigateToHomePage();

        String randomSelectedItemFromHomePage = homePage.getTitleOfRandomAddedItem(randNum);

        homePage.clickOnRandomItem(randNum);
        String addedItemName = productDetailsPage.getProductTitle();

        softAssert.assertEquals(addedItemName, randomSelectedItemFromHomePage, "this is not the selected item");

        productDetailsPage.clickOnAddToCartButton();
        softAssert.assertTrue(productDetailsPage.getTextOfAddToCartAlert().contains("Product added"),"Product is not added yet");
        productDetailsPage.dismissAddToCartAlert();

        homePage.clickOnCartFromNavBar();

        cartDetailsPage.clickOnPlaceOrderButton();
        softAssert.assertTrue(cartDetailsPage.checkPlaceOrderModalIsOpened(),"Place Order Modal Is not opened");

        cartDetailsPage.enterName(ReadConfigPropertiesFile.FULL_NAME);
        cartDetailsPage.enterCountry(ReadConfigPropertiesFile.COUNTRY_NAME);
        cartDetailsPage.enterCity(ReadConfigPropertiesFile.CITY_NAME);
        cartDetailsPage.enterCreditCardNumber(ReadConfigPropertiesFile.CREDIT_CARD_NUMBER);
        cartDetailsPage.enterMonth(ReadConfigPropertiesFile.MONTH_FIELD);
        cartDetailsPage.enterYear(ReadConfigPropertiesFile.YEAR_FIELD);

        cartDetailsPage.clickOnPurchaseButton();

        softAssert.assertTrue(cartDetailsPage.checkPurchaseIsSucceeded(),"Purchase is failed");

        cartDetailsPage.clickOnSuccessfulOkButton();

        softAssert.assertEquals(homePage.getPageTitle(), StaticStrings.PRODUCT_STORE_TITLE,"User is not redirected to the home screen");

        homePage.clickOnLogoutButton();

        softAssert.assertAll();



    }
}
