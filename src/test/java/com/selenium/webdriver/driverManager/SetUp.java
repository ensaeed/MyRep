package com.selenium.webdriver.driverManager;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;





public class SetUp {
public static WebDriver driver;

    @BeforeClass
public static void setUpTest() throws InterruptedException
{
	driver=new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);


}

@AfterClass
    public static void driverClose()
    {
        driver.close();
    }

}
