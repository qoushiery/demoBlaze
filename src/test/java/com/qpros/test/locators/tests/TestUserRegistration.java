package com.qpros.test.locators.tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.qpros.test.locators.pages.HomePage;

public class TestUserRegistration extends BaseTest{
    @Test
    public void executingRegistrationFlow(){
        SoftAssert softAssert = new SoftAssert();
        HomePage homePage = new HomePage();

        String signupUserName = homePage.generateUniqueUserName();
        String userPassword="12345";

        homePage.navigateToHomePage();
        softAssert.assertEquals(homePage.getPageTitle().trim(),"PRODUCT STORE","Home Page is not opened");

        homePage.clickOnSignUpFromNavBar();

        softAssert.assertTrue(homePage.validateSignUpModalIsOpened(),"Sign Up Modal Is Not Opened");

        homePage.enterSigningUpUsername(signupUserName);
        homePage.enterSigningUpPassword(userPassword);
        homePage.clickOnSignupButton();

        softAssert.assertEquals(homePage.getSuccessRegistrationAlertText(),"Sign up successful.","signup failed");

        homePage.dismissSignupAlert();

        homePage.clickOnLoginFromNavBar();

        softAssert.assertTrue(homePage.validateLoginModalIsOpened(),"Login Modal Isn't Opened");

        homePage.enterUsername(signupUserName);
        homePage.enterPassword(userPassword);
        homePage.clickOnLoginButton();

        softAssert.assertTrue(homePage.getNameOfUserAfterLogin().contains(signupUserName),"Failed Login");



        softAssert.assertAll();

    }
}
