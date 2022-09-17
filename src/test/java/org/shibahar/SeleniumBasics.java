package org.shibahar;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumBasics {

    public static void main(String[] args) throws InterruptedException {

        ChromeOptions co= new ChromeOptions();
        //co.setHeadless(true);
        co.addArguments("--incognito");


//        FirefoxOptions options = new FirefoxOptions();
//
//        options.addArguments("--incognito");

        WebDriver driver=WebDriverManager.chromedriver().capabilities(co).create();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//        WebDriver driver2=WebDriverManager.firefoxdriver().create();
//        driver2.get("https://www.google.co.in/");

        driver.get("https://www.google.co.in/");
        String title =driver.getTitle();
        System.out.println(title);

        driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[2]/input")).sendKeys("Global savings Group");

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));

        WebElement element=driver.findElement(By.xpath("//input[@name='btnK']"));

        element.click();
        driver.manage().window().maximize();
        JavascriptExecutor js =(JavascriptExecutor)driver;
       // Thread.sleep(3000);

        WebElement element1=driver.findElement(By.xpath("//*[contains(text(),'Related searches')]"));

      //  js.executeScript("arguments[0].click",element);
        Thread.sleep(3000);
      //  js.executeScript("window.scrollBy(0,1000)");
        js.executeScript("arguments[0].scrollIntoView(true);",element1);



        Thread.sleep(3000);
        driver.quit();


    }
}
