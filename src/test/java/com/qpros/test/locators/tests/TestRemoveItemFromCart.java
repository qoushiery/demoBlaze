package com.qpros.test.locators.tests;

import com.qpros.test.locators.pages.CartDetailsPage;
import com.qpros.test.locators.pages.HomePage;
import org.checkerframework.checker.units.qual.C;
import org.testng.annotations.Test;

public class TestRemoveItemFromCart extends BaseTest{
    @Test
    public void removingItemFromCart(){
        HomePage homePage = new HomePage();
        homePage.clickOnCartFromNavBar();
        CartDetailsPage cartDetailsPage = new CartDetailsPage();

        cartDetailsPage.deleteFirstItem();

    }
}
