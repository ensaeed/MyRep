package com.selenium.webdriver.driverManager;

import com.selenium.webdriver.Driver;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

/**
 * Created by Ehsun on 06/06/14.
 */
public class CitiesTest extends Driver {

    @BeforeClass

    public static void citysearchTest() throws InterruptedException {


        WebElement destinationlist;
        WebElement departure;

        get();
        aDriver.get("http://www.teletextholidays.co.uk/Holidays/Cities");

        aDriver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        destinationlist=aDriver.findElement(By.cssSelector("input[id='dest']"));
        destinationlist.click();

        List<WebElement> destinationList=null;
        destinationList=aDriver.findElements(By.cssSelector("span.tt-suggestions p"));
        destinationList.get(1).click();
        aDriver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
       // Thread.sleep(5000);


        departure=aDriver.findElement(By.cssSelector("input[id='air']"));
        departure.sendKeys("Any London");
        departure.click();

        aDriver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        aDriver.findElement(By.cssSelector(".btn.btn-success")).click();
        Thread.sleep(9000);


    }


    @Test
    public void testContents(){

        assertTrue(aDriver.findElement(By.cssSelector("div[data-bind='text: $vm.searchBar.searchRequestLine1']")).getText().equals("Amsterdam"));
        assertTrue(aDriver.getCurrentUrl().contains("Amsterdam"));

    }

    @Test
    public void presenceOfImage() {

        List<WebElement> images;
        images=aDriver.findElements(By.cssSelector(".img-hotel"));
        assertTrue(images.get(0).isDisplayed());


}

    }
