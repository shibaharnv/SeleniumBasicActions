package org.shibahar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragandDrop extends BaseTest {

    @Test
    public  void rightClickTest() throws InterruptedException
    {

        driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");
        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(draggable,droppable);
        actions.build().perform();

    }
}
