package com.selenium.webdriver.driverManager;

import com.selenium.webdriver.Driver;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static junit.framework.Assert.assertNotSame;
import static junit.framework.Assert.assertTrue;

/**
 * Created by Ehsun on 08/09/14.
 */
public class HotelTest extends Driver {
   // int size;
   public static List<WebElement> listofhotels=null;
@BeforeClass
    public   static void hotelpages()
    {
      get();
        aDriver.get("http://teletextholidays.co.uk/Destinations/Spain");
        aDriver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        aDriver.findElement(By.linkText("See our hotels in Spain")).click();
        listofhotels=aDriver.findElements(By.className("hotel_description"));
        for(WebElement i:listofhotels)
        {
        System.out.println(i.getText());
        }
    }

    @Test
    public void hotelpagevalidation()
    {
       assertTrue(aDriver.getTitle().contains("Hotel Deals in Spain - Spain Holidays"));
        assertNotSame(0,listofhotels.size());

    }
}
