package com.selenium.webdriver.driverManager;

import com.selenium.webdriver.Driver;
import org.junit.Test;
import org.openqa.selenium.By;

import static junit.framework.Assert.assertTrue;

/**
 * Created by Ehsun on 04/06/14.
 */
public class AlertBox extends Driver {

            @Test
            public void alertTest()
    {
        get();
        aDriver.get("http://www.compendiumdev.co.uk/selenium/alerts.html");
        aDriver.findElement(By.cssSelector("#alertexamples")).click();
        aDriver.switchTo().alert().accept();

    }
        @Test
        public void cofirmboxTest()
        {
            aDriver.findElement(By.cssSelector("#confirmexample")).click();
            aDriver.switchTo().alert().dismiss();

        }
        @Test
        public void promptBoxtest()
        {
            aDriver.findElement(By.cssSelector("#promptexample")).click();
            aDriver.switchTo().alert().sendKeys("Sending Keys");
            aDriver.switchTo().alert().accept();
            assertTrue(aDriver.findElement(By.cssSelector("#promptreturn")).equals("Sending Keys"));


        }

}




