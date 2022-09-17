package org.shibahar;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.*;

public class RahulShettyPracticePage {

    public static void main(String[] args) throws InterruptedException {

       WebDriver driver= WebDriverManager.chromedriver().create();

       //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));

       driver.manage().window().maximize();

       driver.get("https://rahulshettyacademy.com/AutomationPractice/");


        //Text Box ,Radio button,Dropdown,checkbox

       driver.findElement(By.xpath("//input[@value='radio2']")).click();

        driver.findElement(By.id("autocomplete")).sendKeys("Testing");

        Select drpdown = new Select(driver.findElement(By.id("dropdown-class-example")));
        drpdown.selectByVisibleText("Option2");

       driver.findElement(By.id("checkBoxOption3")).click();

       driver.findElement(By.xpath("//button[@id='openwindow']")).click();


       Set<String> alWindows =driver.getWindowHandles();

       Iterator<String> winitr=alWindows.iterator();

       ArrayList<String> aList= new ArrayList<String>();

       while (winitr.hasNext())
       {
           aList.add(winitr.next());
       }

       String firstWindow=aList.get(0).toString();
        String secondWindow=aList.get(1).toString();

        System.out.println(driver.switchTo().window(firstWindow).getTitle());


        System.out.println(driver.switchTo().window(secondWindow).getTitle());

        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[contains(text(),'Courses')]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'JOIN NOW')]")));
        driver.close();

        System.out.println(driver.switchTo().window(firstWindow).getTitle());

        driver.findElement(By.id("opentab")).click();

        Set<String> windowSet=driver.getWindowHandles();

        Iterator<String> itr=windowSet.iterator();

        ArrayList<String> al= new ArrayList<String> ();

        while (itr.hasNext())
        {
            al.add(itr.next());
        }
        String newTab=al.get(1).toString();
        driver.switchTo().window(newTab);
        String newTabTitle=driver.switchTo().window(newTab).getTitle();
        System.out.println("New tab title "+newTabTitle);

        if(newTabTitle.contains("Rahul"))
        {
            driver.findElement(By.xpath("//a[contains(text(),'JOIN NOW')]")).click();
        }



        boolean result=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='submit']"))).isDisplayed();
        System.out.println("Result "+result);
        driver.close();

        driver.switchTo().window(firstWindow);

        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Rahul");

        driver.findElement(By.id("alertbtn")).click();
     //   driver.switchTo().alert().accept();

      //  driver.switchTo().alert().dismiss();

        String alertText=driver.switchTo().alert().getText();

        Assert.assertEquals(alertText,"Hello Rahul, share this practice page and share your knowledge");


        System.out.println("alert text "+alertText);

        Thread.sleep(3000);

        // Creating javascript Interface Object by Typecasting driver
        JavascriptExecutor js =(JavascriptExecutor) driver;
























//
//       Set<String> allWindows=driver.getWindowHandles();
//       Iterator<String> winItr=allWindows.iterator();
//
//       ArrayList<String> winList = new ArrayList<String>();
//
//
//       while (winItr.hasNext())
//       {
//           winList.add(winItr.next());
//       }
//
//       String firstWindow=winList.get(0).toString();
//       String secondWindow = winList.get(1).toString();
//
//
//        System.out.println(driver.switchTo().window(firstWindow).getTitle());
//        System.out.println(driver.switchTo().window(secondWindow).getTitle());
//























       //Opening new tab and new window
//
//        driver.switchTo().newWindow(WindowType.TAB);
//
//        driver.get("https://www.google.co.in/");
//
//        driver.switchTo().newWindow(WindowType.WINDOW);




    }
}
