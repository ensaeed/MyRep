package com.selenium.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Created by Ehsun on 14/04/14.
 */

public class Driver extends Thread{

        public static WebDriver aDriver=null;

      public static  final String BROWSER_PROPERTY_NAME="selenium2.webdriver";

     public enum BrowserName{FIREFOX,CHROME,IE}

    public static BrowserName currentDriver;

    private static BrowserName useThisDriver=null;

   //   private static BrowserName useThisDriver=BrowserName.CHROME;

        public static void set(BrowserName aBrowser){

            aBrowser=useThisDriver;
            if(aDriver !=null){
                aDriver.quit();
                aDriver=null;
            }
        }

      public static WebDriver get() {
            if(useThisDriver==null){
                String defaultBrowser = System.getProperty(BROWSER_PROPERTY_NAME,"FIREFOX");

                switch(defaultBrowser){
                    case"FIREFOX":
                        useThisDriver=BrowserName.FIREFOX;
                        break;
                    case "CHROME":
                        useThisDriver=BrowserName.CHROME;
                        break;
                    case "IE":
                        useThisDriver=BrowserName.IE;
                        break;
                    default:
                        throw new RuntimeException("Unknown Browser in"+BROWSER_PROPERTY_NAME+":"+defaultBrowser);
                }
      }
    if(aDriver==null){

        switch(useThisDriver){
            case FIREFOX:
                FirefoxProfile profile=new FirefoxProfile();
                profile.setEnableNativeEvents(true);
                aDriver=new FirefoxDriver();
                currentDriver=BrowserName.FIREFOX;

                break;

            case CHROME:

                System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
                aDriver= new ChromeDriver();
                currentDriver=BrowserName.CHROME;
                break;

            case IE:
                System.setProperty("webdriver.ie.driver", "C:\\webdriver\\IEDriverServer.exe");
                aDriver=new InternetExplorerDriver();
                currentDriver=BrowserName.IE;
                break;
        }
       // aDriver.quit();
       return get();
       }

          return aDriver;

}
    public static WebDriver get(String aURL){

        return get(aURL);
    }

    public static void quit(){
        aDriver.quit();
    }
    }


