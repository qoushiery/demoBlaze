package com.qpros.test.locators.pages;

import com.qpros.actions.BrowserActions;
import com.qpros.actions.ElementActions;
import com.qpros.utilities.ReadConfigPropertiesFile;
import com.qpros.test.locators.locators.HomePageLocators;
import com.qpros.test.locators.locators.LoginLocators;
import com.qpros.test.locators.locators.SignupLocators;
import org.openqa.selenium.By;

import java.text.SimpleDateFormat;
import java.util.Date;


public class HomePage {
    public void navigateToHomePage() {
        BrowserActions.navigateToPage(ReadConfigPropertiesFile.BASE_URL);
    }

    public String getPageTitle() {
        return ElementActions.getTextOfWebElement(HomePageLocators.PRODUCT_STORE_LOGO);
    }

    public void clickOnSignUpFromNavBar() {
        ElementActions.clickOnElement(HomePageLocators.HOME_SIGNUP_BTN);
    }

    public boolean validateSignUpModalIsOpened() {
        return ElementActions.getTextOfWebElement(SignupLocators.SIGNUP_MODAL_LABEL).equalsIgnoreCase("Sign up");
    }

    public void enterSigningUpUsername(String signupUsername) {
        ElementActions.typeInTextField(SignupLocators.SIGNUP_USERNAME, signupUsername);
    }

    public void enterSigningUpPassword(String signupPassword) {
        ElementActions.typeInTextField(SignupLocators.SIGNUP_PASSWORD, signupPassword);
    }

    public void clickOnSignupButton() {
        ElementActions.clickOnElement(SignupLocators.SIGNUP_BTN);
    }

    public boolean validateLoginModalIsOpened() {
        return ElementActions.getTextOfWebElement(LoginLocators.LOGIN_MODAL_LABEL).equalsIgnoreCase("log in");
    }

    public void clickOnLoginFromNavBar() {
        ElementActions.clickOnElement(HomePageLocators.HOME_LOGIN_BTN);
    }

    public void enterUsername(String username) {
        ElementActions.typeInTextField(LoginLocators.LOGIN_USERNAME, username);
    }

    public void enterPassword(String password) {
        ElementActions.typeInTextField(LoginLocators.LOGIN_PASSWORD, password);
    }

    public void clickOnLoginButton() {
        ElementActions.clickOnElement(LoginLocators.LOGIN_BTN);
    }

    /*Generating a unique username for Registration
     * in case of running the registration script multiple times
     */
    public String generateUniqueUserName() {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyMMddhhmmssMs");
        String newDate = dateFormat.format(date);
        return "user" + newDate;
    }

    public String getSuccessRegistrationAlertText() {
        return ElementActions.getTextOfAlert();
    }

    public void dismissSignupAlert() {
        ElementActions.dismissAlert();
    }

    public String getNameOfUserAfterLogin() {
        return ElementActions.getTextOfWebElement(HomePageLocators.WECLOME_USERNAME);
    }

    public void selectSpecificCategory(String category) {
        ElementActions.clickOnElement(By.xpath("//a[@id='itemc'][text()='" + category + "']"));
    }

    public boolean checkIfCategoryHasItems(String category) {
        ElementActions.checkThePresenceOfElement(HomePageLocators.PRODUCTS_LIST);
        System.out.println("the number of "+category+" Items is: "+ElementActions.retrieveElements(HomePageLocators.PRODUCTS_LIST).size());
        return ElementActions.retrieveElements(HomePageLocators.PRODUCTS_LIST).size() > 0;
    }

    public void clickOnArrowLeft(){
        ElementActions.clickOnElement(HomePageLocators.CAROUSEL_ARROW_LEFT);
        ElementActions.clickOnElement(HomePageLocators.CAROUSEL_ARROW_LEFT);
        ElementActions.clickOnElement(HomePageLocators.CAROUSEL_ARROW_LEFT);

    }

    public void clickOnRandomItem(String randItem){

        ElementActions.clickOnElement(HomePageLocators.HOME_BTN);
        ElementActions.clickOnElement(By.xpath("//div[@id='tbodyid']/div['"+randItem+"']//a"));
    }
    public String getTitleOfRandomAddedItem(String randItem){
        return ElementActions.getTextOfWebElement(By.xpath("//div[@id='tbodyid']/div['"+randItem+"']//a[@class='hrefch']"));
    }

    public void clickOnCartFromNavBar(){
        ElementActions.clickOnElement(HomePageLocators.CART_BTN);
    }

    public void clickOnLogoutButton(){
        ElementActions.forceClick(HomePageLocators.LOGOUT_BTN);
    }
}
