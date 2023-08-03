package com.qpros.test.locators.locators;

import org.openqa.selenium.By;

public class HomePageLocators {
    public final static By HOME_LOGIN_BTN = By.id("login2");
    public final static By HOME_SIGNUP_BTN = By.id("signin2");
    public final static By CART_BTN = By.id("cartur");
    public final static By HOME_BTN = By.xpath("//li[@class='nav-item active']//a[@class='nav-link']");

    public final static By LOGOUT_BTN = By.id("logout2");
    public final static By WECLOME_USERNAME =By.id("nameofuser");
    public final static By PRODUCT_STORE_LOGO = By.id("nava");

    public final static By PRODUCTS_LIST = By.xpath("//div[@id='tbodyid']/div");
    public final static By CARD_TITLE =By.xpath("//h4[@class='card-title']/a");
    public final static By CAROUSEL_ARROW_LEFT = By.xpath("//span[@class='carousel-control-prev-icon']");




}
