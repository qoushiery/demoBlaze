package com.qpros.actions;

import com.qpros.DriverHandler;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ElementActions {

    public static WebDriverWait wait = new WebDriverWait(DriverHandler.getInstance().getDriver(), Duration.ofSeconds(10));
    //checking the visibility of web element
    static boolean checkVisibilityOfElement(By locator){
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        }
        catch (Exception e){
            System.out.println("Element"+locator.toString()+"is not visible");
            return false;
        }
        return true;
    }
    //Retrieve web element by locator
    public static WebElement retrieveWebElement(By locator){
        checkVisibilityOfElement(locator);
        return DriverHandler.getInstance().getDriver().findElement(locator);
    }

    //Retrieve Web Elements
    public static List<WebElement> retrieveElements(By locator){
        checkVisibilityOfElement(locator);
        return DriverHandler.getInstance().getDriver().findElements(locator);
    }

    //Check if the Web Element is clickable
    public static WebElement checkIfWebElementIsClickable(By locator){
        WebElement element = retrieveWebElement(locator);
        try {
            wait.until(ExpectedConditions.elementToBeClickable(locator));
        }
        catch (Exception e){
            System.out.println("Element"+locator.toString()+"is not Clickable");
        }
        return element;
    }

    //Click on a web element by locator
    public static void clickOnElement(By locator){
        try {
            WebElement element = checkIfWebElementIsClickable(locator);
            element.click();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    //Type in a text field
    public static void typeInTextField(By locator,String text){
        try {
            WebElement element = checkIfWebElementIsClickable(locator);
            element.sendKeys(text);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    //Get text of web element by its locator
    public static String getTextOfWebElement(By locator){
        return retrieveWebElement(locator).getText();
    }
    public static String getTextOfAlert(){
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = DriverHandler.getInstance().getDriver().switchTo().alert();
        //System.out.println("Alert Text is: "+alert.getText());
        return alert.getText();
    }
    public static void dismissAlert(){
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = DriverHandler.getInstance().getDriver().switchTo().alert();
        alert.accept();
    }
public static void checkThePresenceOfElement(By locator){
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
}

public static void forceClick(By locator){
        checkIfWebElementIsClickable(locator);
        WebElement element = DriverHandler.getInstance().getDriver().findElement(locator);
    ((JavascriptExecutor) DriverHandler.getInstance().getDriver()).executeScript("arguments[0].click()",element);
}
}
