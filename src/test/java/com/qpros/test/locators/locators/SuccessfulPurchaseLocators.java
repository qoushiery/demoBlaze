package com.qpros.test.locators.locators;


import org.openqa.selenium.By;

public class SuccessfulPurchaseLocators {
    public final static By THANKS_MESSAGE = By.xpath("//h2[normalize-space()='Thank you for your purchase!']");
    public final static By PURCHASE_DETAILS_PARAGRAPH = By.xpath("//p[@class='lead text-muted ']");
    public final static By OK_BTN = By.xpath("//button[normalize-space()='OK']");
}
