package com.qpros.test.locators.tests;

import com.qpros.BrowserType;
import com.qpros.DriverHandler;
import com.qpros.actions.BrowserActions;
import org.testng.annotations.*;
import com.qpros.utilities.ReadConfigPropertiesFile;

public class BaseTest {

    @BeforeSuite
    public void setConfigurations() {
        ReadConfigPropertiesFile.loadingTestsConfigurations();
    }

    @BeforeTest
    public void setupDriver() {
        switch (ReadConfigPropertiesFile.BROWSER_TYPE.toLowerCase()) {
            case "chrome":
                DriverHandler.getInstance().setBrowserType(BrowserType.CHROME);
                break;
            case "firefox":
                DriverHandler.getInstance().setBrowserType(BrowserType.FIREFOX);
                break;
            case "edge":
                DriverHandler.getInstance().setBrowserType(BrowserType.EDGE);
                break;
        }

    }

    @BeforeClass
    public void restoreWindowSize() {
        BrowserActions.restoreView();
    }

    @AfterTest
    public void tearDown() {
        DriverHandler.getInstance().getDriver().quit();
    }


}
