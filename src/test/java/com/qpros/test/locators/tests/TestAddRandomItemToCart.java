package com.qpros.test.locators.tests;

import com.qpros.StaticStrings;
import com.qpros.test.locators.pages.HomePage;
import com.qpros.test.locators.pages.ProductDetailsPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.Random;

public class TestAddRandomItemToCart extends BaseTest {
    @Test
    public void addingRandomItemToCart() {
        HomePage homePage = new HomePage();
        ProductDetailsPage productDetailsPage = new ProductDetailsPage();
        SoftAssert softAssert = new SoftAssert();

        Random random = new Random();
        String randNum = String.valueOf(random.nextInt(9) + 1);

        homePage.navigateToHomePage();

        String randomSelectedItemFromHomePage = homePage.getTitleOfRandomAddedItem(randNum);

        homePage.clickOnRandomItem(randNum);
        String addedItemName = productDetailsPage.getProductTitle();

        softAssert.assertEquals(addedItemName, randomSelectedItemFromHomePage, "this is not the selected item");

        productDetailsPage.clickOnAddToCartButton();
        softAssert.assertEquals(productDetailsPage.getTextOfAddToCartAlert(), StaticStrings.PRODUCT_ADDED_MESSAGE,"Product is not added yet");
        productDetailsPage.dismissAddToCartAlert();

        softAssert.assertAll();
    }
}
