package com.qpros.test.locators.locators;

import org.openqa.selenium.By;

public class PlaceOrderLocators {
    public static final By PLACE_ORDER_MODAL = By.id("orderModalLabel");
    public static final By Name_FIELD = By.id("name");
    public static final By TOTAL_ORDER = By.id("totalm");
    public static final By COUNTRY_FIELD = By.id("country");
    public static final By CITY_FIELD = By.id("city");
    public static final By CREDIT_CARD_FIELD = By.id("card");
    public static final By MONTH_FIELD = By.id("month");
    public static final By YEAR_FIELD = By.id("year");
    public static final By PURCHASE_BTN = By.xpath("//button[normalize-space()='Purchase']");
    public static final By CLOSE_BTN = By.xpath("//div[@id='orderModal']//button[@type='button'][normalize-space()='Close']");
}
