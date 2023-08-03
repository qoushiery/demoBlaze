package com.qpros.test.locators.pages;

import com.qpros.actions.ElementActions;
import com.qpros.test.locators.locators.ProductDetailsPageLocators;

public class ProductDetailsPage {
    public String getProductTitle(){
        System.out.println("the Title of product from the details page is: "+ElementActions.getTextOfWebElement(ProductDetailsPageLocators.PRODUCT_NAME).trim());
        return ElementActions.getTextOfWebElement(ProductDetailsPageLocators.PRODUCT_NAME).trim();
    }
    public String getProductPrice(){
        System.out.println("the price of product from the details page is: "+ElementActions.getTextOfWebElement(ProductDetailsPageLocators.PRODUCT_PRICE).trim());
        return ElementActions.getTextOfWebElement(ProductDetailsPageLocators.PRODUCT_PRICE).trim();
    }

    public void clickOnAddToCartButton(){
        ElementActions.clickOnElement(ProductDetailsPageLocators.ADD_TO_CART_BTN);
    }
    public String getTextOfAddToCartAlert() {
        return ElementActions.getTextOfAlert();
    }
    public void dismissAddToCartAlert() {
        ElementActions.dismissAlert();
    }
}
