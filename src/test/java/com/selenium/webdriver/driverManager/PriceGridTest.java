package com.selenium.webdriver.driverManager;

import com.selenium.webdriver.Driver;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;

/**
 * Created by Ehsun on 03/03/14.
 */
//public class PriceGrid extends DriverManagerTT {
public class PriceGridTest extends Driver {


@BeforeClass
      public static void checkPriceGridPageTest() throws InterruptedException {

          get();
          aDriver.get("http://www.teletextholidays.co.uk");
            WebElement PriceGridLink;
            Thread.sleep(3000);

           PriceGridLink= aDriver.findElement(By.className("megaWrap"));
            PriceGridLink.click();
            PriceGridLink=aDriver.findElement(By.id("bodycontent_0_popularholidayssearchesbar_0_rptMainNav_ctl11_ucMoreNav_rptMorePrimaryItemsNav_ctl04_rptPrimaryItems_ctl02_hplLinkPrimary"));
            PriceGridLink.click();



        }
@Test
    public void validatepricegridpage(){
    assertTrue(aDriver.getTitle().startsWith("Holidays from the North East"));
    assertTrue(aDriver.getCurrentUrl().contentEquals("http://www.teletextholidays.co.uk/Holidays/Grid-Pages/RegionalNorthEast"));
}
    }

