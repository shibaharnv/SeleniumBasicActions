package org.shibahar;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class SwitchTabs extends BaseTest{


    @Test
    public void  switchTabs() throws InterruptedException {
        driver.findElement(By.id("opentab")).click();

        Set<String> tabs =driver.getWindowHandles();

     Iterator itr= tabs.iterator();
        ArrayList al = new ArrayList();

        while (itr.hasNext())
        {
            Object s=itr.next();

            al.add(s);
        }

        System.out.println(al);
        String firstWindow= al.get(0).toString();
        String secondWindow= al.get(1).toString();

       // String window1=driver.switchTo().window(firstWindow).getTitle();
        String window2=driver.switchTo().window(secondWindow).getTitle();
        String window1=driver.switchTo().window(firstWindow).getTitle();
        System.out.println("window1 "+window1);
        System.out.println("window2 "+window2);

        Thread.sleep(7000);

    }

}
