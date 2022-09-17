package org.shibahar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHover extends BaseTest {

    @Test
    public  void mouseHoverTest() throws InterruptedException
    {
        WebElement ele =driver.findElement(By.xpath("//button[@id='mousehover']"));

        JavascriptExecutor js= (JavascriptExecutor) driver;

        js.executeScript("arguments[0].scrollIntoView(true);",ele);

        Actions actions = new Actions(driver);


        actions.moveToElement(ele);
        actions.build().perform();

        Thread.sleep(5000);
    }
}
