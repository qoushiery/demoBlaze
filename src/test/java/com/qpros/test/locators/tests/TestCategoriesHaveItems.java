package com.qpros.test.locators.tests;

import com.qpros.test.locators.pages.HomePage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCategoriesHaveItems extends BaseTest{
    @Test
    public void checkIfCategoriesHaveItems() throws InterruptedException {
        HomePage homePage = new HomePage();
        SoftAssert softAssert = new SoftAssert();

        homePage.navigateToHomePage();
        homePage.selectSpecificCategory("Laptops");
        Thread.sleep(3000);
        softAssert.assertTrue(homePage.checkIfCategoryHasItems("Laptops"));

        homePage.selectSpecificCategory("Phones");
        Thread.sleep(3000);
        softAssert.assertTrue(homePage.checkIfCategoryHasItems("Phones"));

        homePage.selectSpecificCategory("Monitors");
        Thread.sleep(3000);
        softAssert.assertTrue(homePage.checkIfCategoryHasItems("Monitors"));

    }
}
