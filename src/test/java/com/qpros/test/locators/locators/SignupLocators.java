package com.qpros.test.locators.locators;

import org.openqa.selenium.By;

public class SignupLocators {
    public final static By SIGNUP_MODAL_LABEL = By.id("signInModalLabel");
    public final static By SIGNUP_USERNAME = By.id("sign-username");
    public final static By SIGNUP_PASSWORD = By.id("sign-password");
    public final static By SIGNUP_BTN = By.xpath("//button[normalize-space()='Sign up']");
    public final static By SIGNUP_CLOSE_BTN = By.xpath("//div[@id='signInModal']//button[@type='button'][normalize-space()='Close']");
}
