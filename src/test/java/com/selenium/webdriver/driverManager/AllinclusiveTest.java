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
public class AllinclusiveTest extends Driver {

    @BeforeClass

    public static void searchTest() throws InterruptedException {


        WebElement destinationlist;
        WebElement departure;



        get();
        aDriver.get("http://www.teletextholidays.co.uk/Holidays/All-Inclusive");

        aDriver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        destinationlist=aDriver.findElement(By.cssSelector("input[id='dest']"));
        destinationlist.click();

        List<WebElement> destinationList=null;
        destinationList=aDriver.findElements(By.cssSelector("span.tt-suggestions p"));
        destinationList.get(0).click();
        aDriver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
        Thread.sleep(9000);


        departure=aDriver.findElement(By.cssSelector("input[id='air']"));
        departure.sendKeys("Any London");
        departure.click();

        aDriver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        aDriver.findElement(By.cssSelector(".btn.btn-success")).click();
       // aDriver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
        Thread.sleep(9000);

    }


    @Test
    public void testContents(){

        assertTrue(aDriver.findElement(By.cssSelector("div[data-bind='text: $vm.searchBar.searchRequestLine1']")).getText().equals("Balearics"));
        assertTrue(aDriver.getCurrentUrl().contains("Balearics"));

    }

    @Test
    public void presenceOfImage() {

        List<WebElement> images;
        images=aDriver.findElements(By.cssSelector(".img-hotel"));
        assertTrue(images.get(0).isDisplayed());




    }

}
