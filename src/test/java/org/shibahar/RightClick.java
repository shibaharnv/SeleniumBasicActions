package org.shibahar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RightClick extends BaseTest {

    @Test
    public  void rightClickTest() throws InterruptedException
    {
        WebElement ele = driver.findElement(By.id("alertbtn"));
        Actions actions= new Actions(driver);
        actions.contextClick();
        actions.build().perform();
        Thread.sleep(10000);

    }
}
