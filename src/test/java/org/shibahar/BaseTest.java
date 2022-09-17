package org.shibahar;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import java.time.Duration;

public class BaseTest {

    WebDriver driver;
    @BeforeClass
    public void driverConfiguration()
    {
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--incognito");


         driver= WebDriverManager.chromedriver().capabilities(options).create();

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }


    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
}
