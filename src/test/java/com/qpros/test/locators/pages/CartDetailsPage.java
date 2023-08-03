package com.qpros.test.locators.pages;

import com.qpros.StaticStrings;
import com.qpros.actions.ElementActions;
import com.qpros.test.locators.locators.CartLocators;
import com.qpros.test.locators.locators.HomePageLocators;
import com.qpros.test.locators.locators.PlaceOrderLocators;
import com.qpros.test.locators.locators.SuccessfulPurchaseLocators;
import org.openqa.selenium.By;

public class CartDetailsPage {
    public void deleteSpecificItem(String deleteItem){
        ElementActions.clickOnElement(By.xpath("//td[normalize-space()='"+deleteItem+"']//parent::tr//a"));
    }
    public void deleteFirstItem(){
        ElementActions.clickOnElement(CartLocators.DELETE_FIRST_ITEM);
    }
public void clickOnPlaceOrderButton(){
        ElementActions.clickOnElement(CartLocators.PLACE_ORDER_BTN);
}
public boolean checkPlaceOrderModalIsOpened(){
        return ElementActions.getTextOfWebElement(PlaceOrderLocators.PLACE_ORDER_MODAL).equalsIgnoreCase("Place order");
}
public void enterName(String fullName){
        ElementActions.typeInTextField(PlaceOrderLocators.Name_FIELD,fullName);
}
    public void enterCountry(String country){
        ElementActions.typeInTextField(PlaceOrderLocators.COUNTRY_FIELD,country);
    }
    public void enterCity(String city){
        ElementActions.typeInTextField(PlaceOrderLocators.CITY_FIELD,city);
    }
    public void enterCreditCardNumber(String credit){
        ElementActions.typeInTextField(PlaceOrderLocators.CREDIT_CARD_FIELD,credit);
    }
    public void enterMonth(String month){
        ElementActions.typeInTextField(PlaceOrderLocators.MONTH_FIELD,month);
    }
    public void enterYear(String year){
        ElementActions.typeInTextField(PlaceOrderLocators.YEAR_FIELD,year);
    }
    public void clickOnPurchaseButton(){
        ElementActions.clickOnElement(PlaceOrderLocators.PURCHASE_BTN);
    }
    public boolean checkPurchaseIsSucceeded(){
        return ElementActions.getTextOfWebElement(SuccessfulPurchaseLocators.THANKS_MESSAGE).equalsIgnoreCase(StaticStrings.THANKS_PURCHASE_MESSAGE);
    }
    public void clickOnSuccessfulOkButton(){
        ElementActions.clickOnElement(SuccessfulPurchaseLocators.OK_BTN);
    }
}
