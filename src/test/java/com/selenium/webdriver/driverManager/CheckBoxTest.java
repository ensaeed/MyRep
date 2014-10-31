package com.selenium.webdriver.driverManager;

import com.selenium.webdriver.Driver;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * Created by Ehsun on 03/07/14.
 */
public class CheckBoxTest extends Driver {
    @Test
    public  void hotelResortCheckbox() throws InterruptedException {

        get();
        aDriver.get("http://www.teletextholidays.co.uk/search#/overseas/Balearic_Bestsellers/2014-07-04/Any_London/boardtype=anyboard/nights=7/adults=2/minstars=3");
        Thread.sleep(9000);
        aDriver.findElement(By.cssSelector("input[value='1784']")).click();
        quit();
    }

}
