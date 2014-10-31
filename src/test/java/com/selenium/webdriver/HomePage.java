package com.selenium.webdriver;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Ehsun on 24/02/14.
 */
public class HomePage extends Driver {

    @Test
    public void titleTest() throws InterruptedException

    {
        aDriver.get("http://www.teletextholidays.co.uk");
        assertTrue(aDriver.getTitle().startsWith("Cheap Holidays"));
        Thread.sleep(3);
        aDriver.navigate().to("http://www.teletextholidays.co.uk/Holidays/Grid-Pages/Holidays-from-North-East");
        aDriver.navigate().to("http://www.teletextholidays.co.uk/Holidays/Late-Deals");
        aDriver.quit();
    }
}
