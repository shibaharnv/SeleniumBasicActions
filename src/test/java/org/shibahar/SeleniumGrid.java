package org.shibahar;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumGrid {
    public WebDriver driver;
//
//    public DesiredCapabilities cap = new DesiredCapabilities();
//
//
//    public ChromeOptions options = new ChromeOptions();

    @BeforeTest
    public void Browser_Launch() throws MalformedURLException {
//         driver= WebDriverManager.chromedriver().create();
//        String browser="chrome";
//        if(browser.equalsIgnoreCase("chrome"))
//        {
//            cap.setPlatform(Platform.ANY);
//            cap.setBrowserName("chrome");
//            driver = new RemoteWebDriver(new URL("http://192.168.227.179:4444"),cap);
//        }

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setCapability("browserVersion", "105.0.5195.102");
        chromeOptions.setCapability("platformName", "MAC");
        driver = new RemoteWebDriver(new URL("http://192.168.227.179:4444"), chromeOptions);
        //driver = new RemoteWebDriver(new URL("http://localhost:4444/"), chromeOptions);
    }


   @Test
   public void seleniumTest() throws MalformedURLException {

       driver.get("https://www.google.co.in/");

  }
}
