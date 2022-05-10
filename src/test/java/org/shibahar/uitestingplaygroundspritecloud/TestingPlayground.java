package org.shibahar.uitestingplaygroundspritecloud;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class TestingPlayground {

    public static void main(String[] args) throws InterruptedException {


        //Testcases -
        //
        //1.Dynamic Link Validation
        // Open the page
        //Click on the Dynamic ID link
        //Validate the button in the next page without using id

        //2.Mouse Hover click
        // Open the page
        //Click on the Mouse over  link and validate the clicked 1 timesText






        WebDriver driver=WebDriverManager.chromedriver().create();
        driver.get("http://uitestingplayground.com/home");
        driver.manage().window().maximize();

        //Testcase 1:Dynamic Link Validation

//        driver.findElement(By.xpath("//*[contains(text(),'Dynamic ID')]")).click();
//        Thread.sleep(4000);
//
//        WebElement dynamicIdButton=driver.findElement(By.xpath("//*[contains(text(),'Button with Dynamic ID')]"));
//
//        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
//
//        wait.until(ExpectedConditions.visibilityOf(dynamicIdButton));
//
//        //   //2.Mouse Hover click
//
//        driver.navigate().back();
//
//        driver.findElement(By.xpath("//*[contains(text(),'Mouse Over')]")).click();
//
//        WebElement clickElement=driver.findElement(By.xpath("//a[@title='Click me']"));
//        JavascriptExecutor js= (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].scrollIntoView(true);",clickElement);
//
//        Actions actions = new Actions(driver);
//        actions.moveToElement(clickElement).click();
//        actions.build().perform();
//        WebElement clickElement2=driver.findElement(By.xpath("//a[@title='Click me']"));
//        Actions actions2 = new Actions(driver);
//        actions2.moveToElement(clickElement2).click();
//        actions2.build().perform();
//
//
//
//
//        Thread.sleep(5000);
//
//        WebElement timesElement=driver.findElement(By.xpath("//*[@id='clickCount']"));
//        System.out.println(timesElement.getText());
//
//        //Dynamic web Table:
//
//
//        driver.navigate().back();
//        driver.findElement(By.xpath("//*[contains(text(),'Dynamic Table')]")).click();
//        String tableText=driver.findElement(By.xpath("//div[@role='table']")).getText();
//        System.out.println(tableText);
//        List<WebElement> col = driver.findElements(By.xpath("//div[@role='table']/div/div"));
//
//        System.out.println(col.size());
//
//        for(WebElement ele:col)
//        {
//            String chromeFullValue=ele.getText();
//            System.out.println(chromeFullValue);
//            String[] chromeValue= chromeFullValue.split(" ");
//
//            if(chromeValue[0].equalsIgnoreCase("Chrome"))
//            {
//                System.out.println(chromeValue[1]);
//            }
//
//
//        }

      //4 .Overlapped Element :


        driver.findElement(By.xpath("//*[contains(text(),'Overlapped Element')]")).click();


        //First click on the scroll-able pane of your page:

        Actions clickAction = new Actions(driver);
        WebElement scrollablePane = driver.findElement(By
                .xpath("//div[@style='position: relative;']"));
        clickAction.moveToElement(scrollablePane).click().build().perform();


        // scroll action

        Actions scrollAction = new Actions(driver);
        scrollAction.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
        Thread.currentThread().sleep(5000);

        //entering value
        //WebElement nameElement =driver.findElement(By.xpath("//div[@style='position: relative;']//input[@id='name']"));


        JavascriptExecutor jse = ((JavascriptExecutor)driver);
        WebElement nameElement =driver.findElement(By.xpath("//div[@style='position: relative;']//input[@id='name']"));
        jse.executeScript("arguments[0].value='SHIBAHAR';", nameElement);


//
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        WebElement element = driver.findElement(By.xpath("//div[@style='position: relative;']//input[@id='name']"));
//        js.executeScript("arguments[0].setAttribute('attr', '10')",element);


//        jse.executeScript("arguments[0].value='-----your input----';", email);
//        Actions a = new Actions(driver);
//        a.sendKeys(nameElement, "Your text to input").build().perform();

//        driver.findElement(By.xpath("//div[@style='position: relative;']//input[@id='name']")).sendKeys("shibahar");
        String value=driver.findElement(By.xpath("//div[@style='position: relative;']//input[@id='name']")).getAttribute("value");
        System.out.println(value);
        Thread.currentThread().sleep(5000);



    }
}
