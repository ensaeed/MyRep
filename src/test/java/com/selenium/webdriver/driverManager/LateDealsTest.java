package com.selenium.webdriver.driverManager;

import com.selenium.webdriver.Driver;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


/**
 * Created by Ehsun on 13/01/14.
 */

   public class LateDealsTest extends Driver {
    @Test
    public  void latedealspageTest() throws InterruptedException {

        get();

        aDriver.get("http://www.teletextholidays.co.uk/Holidays/Late-Deals");
        Thread.sleep(3000);

         assertTrue(aDriver.getTitle().startsWith("Last Minute Holidays."));


    }

}
