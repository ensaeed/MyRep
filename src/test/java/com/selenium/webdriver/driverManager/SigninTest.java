package com.selenium.webdriver.driverManager;

import com.selenium.webdriver.Driver;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static junit.framework.Assert.assertTrue;


/**
 * Created by Ehsun on 06/06/14.
 */

public class SigninTest extends Driver{
    @BeforeClass

    public static void signin() throws InterruptedException {
        get();
        aDriver.get("http://www.teletextholidays.co.uk");

       WebElement sigin= aDriver.findElement(By.cssSelector(".dropdown-toggle>.sign-in"));
        sigin.click();
        aDriver.findElement(By.cssSelector(".username>.input.input-sm")).sendKeys("ehsun.saeed@artirix.com");
        aDriver.findElement(By.cssSelector(".password>.input.input-sm")).sendKeys("S0tudm:stEgVTF");
        aDriver.findElement(By.cssSelector(".btn.btn-primary")).click();
      Thread.sleep(3000);



    }
    @Test
    public void testSininfunctionality(){

      assertTrue(aDriver.findElement(By.cssSelector("#btnLogOut")).getText().equals("Sign out"));

        quit();


}
}