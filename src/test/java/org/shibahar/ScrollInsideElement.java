package org.shibahar;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ScrollInsideElement {

    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();

        options.addArguments("--incognito");


        WebDriver driver=WebDriverManager.chromedriver().capabilities(options).create();

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));

        WebElement tableElement=driver.findElement(By.xpath("//div[@class='tableFixHead']"));

        wait.until(ExpectedConditions.visibilityOf(tableElement));
        wait.until(ExpectedConditions.elementToBeClickable(tableElement));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementById('product').scrollDown += 100");
       // tableElement.sendKeys(Keys.PAGE_DOWN);
        Thread.sleep(4000);

//        Actions move = new Actions(driver);
//        move.moveToElement(tableElement).clickAndHold();
//        move.moveByOffset(125,0);
//        move.release();
//        move.perform();
//
        //First click on the scroll-able pane of your page:

        Actions clickAction = new Actions(driver);
        WebElement scrollablePane = driver.findElement(By
                .className("tableFixHead"));
        clickAction.moveToElement(scrollablePane).click().build().perform();

        // scroll action

        Actions scrollAction = new Actions(driver);
        scrollAction.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
        Thread.currentThread().sleep(5000);


        // Check if City is present in the webtable

       int headCount= driver.findElements(By.xpath("//div[@class='tableFixHead']/table[@id='product']/thead/tr/th")).size();
        System.out.println("Head count "+headCount);
       String headingText="";

       for(int i=1;i<headCount;i++)
       {
           headingText=driver.findElement(By.xpath("//*[@id=\"product\"]/thead/tr/th["+i+"]")).getText();

           if(headingText.equalsIgnoreCase("city"))
           {
               System.out.println("City is present test case passed"+i);
           }
       }


       int rowCount=driver.findElements(By.xpath("//div[@class='tableFixHead']/table[@id='product']/tbody/tr")).size();
       int columnCount=driver.findElements(By.xpath("//div[@class='tableFixHead']/table/thead/tr/th")).size();
       //int columnCount=4;
        String value="";

        for(int j=1;j<rowCount;j++)
        {
            for(int k=1;k<columnCount;k++)
            {
               value= driver.findElement(By.xpath("//div[@class='tableFixHead']/table[@id=\"product\"]/tbody/tr["+j+"]/td["+k+"]")).getText();
                System.out.println(value);

               if(value.equalsIgnoreCase("Chennai"))
               {
                   System.out.println("Position of chennai is  "+j+ "th row"+k+" Column");

                   Assert.assertEquals(value,"Chennai");
               }
            }
        }




    }
}
