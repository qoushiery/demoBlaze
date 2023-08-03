package com.qpros.actions;

import com.qpros.DriverHandler;
import org.openqa.selenium.JavascriptExecutor;

public class BrowserActions {
    public static boolean isScreenMaximized =false;
    public static void restoreView(){
        if(!isScreenMaximized){
            DriverHandler.getInstance().getDriver().manage().window().maximize();
            ((JavascriptExecutor) DriverHandler.getInstance().getDriver()).executeScript("document.body.style.zoom='argument[0]'",1);
            DriverHandler.getInstance().getDriver().navigate().refresh();
            isScreenMaximized=true;
        }

    }
    public static void navigateToPage(String pageURL) {
        DriverHandler.getInstance().getDriver().navigate().to(pageURL);
    }

    public static void switchToFrame(String frameName) {
        DriverHandler.getInstance().getDriver().switchTo().frame(frameName);
    }

    public static void switchToAlert() {
        DriverHandler.getInstance().getDriver().switchTo().alert();
    }
}
