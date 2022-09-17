package org.shibahar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class IFrameTest extends BaseTest {

    @Test
    public  void iframeTestMethod() throws InterruptedException
    {
        WebElement ele =driver.findElement(By.xpath("//button[@id='mousehover']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].scrollIntoView(true)",ele);


        WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='courses-iframe']"));
        driver.switchTo().frame(frameElement);
        driver.findElement(By.xpath("//a[contains(text(),'Learning paths')]")).click();
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//input[@value='radio2']")).click();
    }
}
