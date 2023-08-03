package com.qpros.test.locators.locators;

import org.openqa.selenium.By;

public class CartLocators {
    public final static By PRODUCTS_LIST =By.id("tbodyid");
    public final static By PRODUCTS_TITLE = By.xpath("//h2[normalize-space()='Products']");
    public final static By PICTURE_COLUMN = By.xpath("//th[normalize-space()='Pic']");
    public final static By TITLE_COLUMN = By.xpath("//th[normalize-space()='Title']");
    public final static By PRICE_COLUMN = By.xpath("//th[normalize-space()='Price']");

    public final static By PLACE_ORDER_BTN = By.xpath("//button[normalize-space()='Place Order']");
    public final static By DELETE_FIRST_ITEM =By.xpath("//tbody[@id='tbodyid']//a[text()='Delete']");

}
