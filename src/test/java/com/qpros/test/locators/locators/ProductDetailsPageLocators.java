package com.qpros.test.locators.locators;

import org.openqa.selenium.By;

public class ProductDetailsPageLocators {
    public final static By PRODUCT_NAME = By.xpath("//div[@id='tbodyid']/h2");
    public final static By PRODUCT_PRICE = By.xpath("//h3[@class='price-container']");

    public final static By ADD_TO_CART_BTN = By.xpath("//a[normalize-space()='Add to cart']");


}
