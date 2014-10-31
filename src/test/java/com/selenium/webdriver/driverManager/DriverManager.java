package com.selenium.webdriver.driverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Created by Ehsun on 05/03/14.
 */

public class DriverManager {

    public static final String SELENIUM = "selenium";

    public static WebDriver get() {

        String browserToUse="";

        if(System.getProperties().containsKey(SELENIUM)){
            browserToUse = System.getProperty(SELENIUM);
        }

        switch(browserToUse){

            case "firefox":
                return new FirefoxDriver();

            case "chrome":
                System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
                return new ChromeDriver();
            case "ie":
                System.setProperty("webdriver.ie.driver", "C:\\webdriver\\IEDriverServer.exe");
                return new InternetExplorerDriver();

            default:
                return new HtmlUnitDriver();
        }

    }
}



