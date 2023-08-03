package com.qpros.test.locators.locators;

import org.openqa.selenium.By;

public class LoginLocators {
    public final static By LOGIN_MODAL_LABEL = By.id("logInModalLabel");
    public final static By LOGIN_USERNAME = By.id("loginusername");
    public final static By LOGIN_PASSWORD = By.id("loginpassword");
    public final static By LOGIN_CLOSE_BTN = By.xpath("//div[@id='logInModal']//button[@type='button'][normalize-space()='Close']");
    public final static By LOGIN_BTN = By.xpath("//button[normalize-space()='Log in']");
    public final static By DISMISS_ICON = By.xpath("//div[@id='logInModal']//span[@aria-hidden='true'][normalize-space()='×']");

}
