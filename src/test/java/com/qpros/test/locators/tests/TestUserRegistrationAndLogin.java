package com.qpros.test.locators.tests;

import com.qpros.StaticStrings;
import com.qpros.utilities.ReadConfigPropertiesFile;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.qpros.test.locators.pages.HomePage;

public class TestUserRegistrationAndLogin extends BaseTest{
    @Test
    public void executingRegistrationFlow(){
        SoftAssert softAssert = new SoftAssert();
        HomePage homePage = new HomePage();

        String signupUserName = homePage.generateUniqueUserName();

        homePage.navigateToHomePage();
        softAssert.assertEquals(homePage.getPageTitle().trim(), StaticStrings.PRODUCT_STORE_TITLE,"Home Page is not opened");

        homePage.clickOnSignUpFromNavBar();

        softAssert.assertTrue(homePage.validateSignUpModalIsOpened(),"Sign Up Modal Is Not Opened");

        homePage.enterSigningUpUsername(signupUserName);
        homePage.enterSigningUpPassword(ReadConfigPropertiesFile.USER_PASSWORD);
        homePage.clickOnSignupButton();

        softAssert.assertEquals(homePage.getSuccessRegistrationAlertText(),StaticStrings.SIGNUP_SUCCESSFUL,"signup failed");

        homePage.dismissSignupAlert();

        homePage.clickOnLoginFromNavBar();

        softAssert.assertTrue(homePage.validateLoginModalIsOpened(),"Login Modal Isn't Opened");

        homePage.enterUsername(signupUserName);
        homePage.enterPassword(ReadConfigPropertiesFile.USER_PASSWORD);
        homePage.clickOnLoginButton();

        softAssert.assertTrue(homePage.getNameOfUserAfterLogin().contains(signupUserName),"Failed Login");



        softAssert.assertAll();

    }
}
