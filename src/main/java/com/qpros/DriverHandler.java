package com.qpros;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverHandler {
    ThreadLocal<WebDriver> driver;
    private DriverHandler(){}
    private static DriverHandler instance = new DriverHandler();
    public static DriverHandler getInstance(){
        return instance;
    }
    public void setBrowserType(BrowserType type){
        switch (type){
            case CHROME:
                WebDriverManager.chromedriver().setup();
                driver = new ThreadLocal<WebDriver>(){
                    @Override protected  WebDriver initialValue()
                    { return new ChromeDriver(); }
                }

                ;
                break;
            case FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                driver = new ThreadLocal<WebDriver>(){
                    @Override protected WebDriver initialValue()
                    {return new FirefoxDriver();}
                };
                break;
            case EDGE:
                WebDriverManager.edgedriver().setup();
                driver = new ThreadLocal<WebDriver>(){
                    @Override protected WebDriver initialValue()
                    {return new EdgeDriver();}
                };
                break;
                }
        }
    public WebDriver getDriver(){
        return driver.get();
    }
}
