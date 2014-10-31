package com.selenium.webdriver.driverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Ehsun on 12/03/14.
 */

public class FindaProperty {
    public static void main(String[] args) throws InterruptedException {


        WebElement destination;
        WebElement destinationlist;
        WebElement departure;
        WebElement boardBasis;
        WebElement next;

        WebDriver driver=new FirefoxDriver();

        driver.get("http://www.teletextholidays.co.uk");

        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        //Populate destination field
        destination= driver.findElement(By.name("bodycontent_0$searchcontent_0$ctl00$_suWhereAlternative$_txtDestinationAltView"));
        destination.click();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        destinationlist =driver.findElement(By.id("ui-id-3"));
        destinationlist.click();
        //Populate departure field
        departure=driver.findElement(By.name("bodycontent_0$searchcontent_0$ctl00$_suWhereAlternative$_txtAirportAltView"));
        departure.click();

        departure.sendKeys("Any London");
        Thread.sleep(5000);

        //Select boardbasis
        boardBasis=driver.findElement(By.name("bodycontent_0$searchcontent_0$ctl00$ddlBoardTypesAlternative"));
        boardBasis.findElement(By.cssSelector("option[value='5']")).click();
        //Find and click on the search button
        driver.findElement(By.name("bodycontent_0$searchcontent_0$ctl00$btnAlternativeSearch")).click();
        // new WebDriverWait(driver,10).until(ExpectedConditions.titleIs())
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        boolean next_page=true;

        while(next_page){
            List<WebElement> listings = driver.findElements(By.className("main_info"));
           // driver.findElements(By.ByClassName)
            for (WebElement a : listings){
            System.out.println(a.getText());
            }
                if(driver.findElements(By.linkText("Next")).size()==0);{


                next_page=false;
                }


                {
                    driver.findElement(By.linkText("Next")).click();
                }




                }
            }

        }





      /*  @Test
        public void testTitle()
        {

        assertTrue(driver.getTitle().startsWith("ABC"));
        }

*/




