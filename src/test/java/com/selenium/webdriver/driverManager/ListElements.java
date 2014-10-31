package com.selenium.webdriver.driverManager;

import com.selenium.webdriver.Driver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;



/**
 * Created by Ehsun on 04/06/14.
 */
public class ListElements extends Driver {

    WebElement destinationlist;

    @Test
    public void autocompleteCountTest(){
         get();
        aDriver.get("http://www.teletextholidays.co.uk");
        destinationlist=aDriver.findElement(By.cssSelector("label[for='dest']"));
        destinationlist.click();

        List<WebElement> destinationList=null;
        destinationList=aDriver.findElements(By.cssSelector("span.tt-suggestions p"));

        System.out.println(destinationList.size());
        quit();
    }



}
