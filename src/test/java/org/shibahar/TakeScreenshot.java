package org.shibahar;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class TakeScreenshot {


    @Test
    public void takeScreenshotMethod() throws IOException {
        WebDriver driver=WebDriverManager.chromedriver().create();

        driver.get("https://www.youtube.com/watch?v=ky0plZ8GRmU");

        TakesScreenshot ts= (TakesScreenshot) driver;

        File src=ts.getScreenshotAs(OutputType.FILE);

        File tar = new File("/Users/snagarajan/Documents/SeleniumBasics/src/test/java/Test/123.jpeg");

        FileUtils.copyFile(src,tar);

        driver.close();


    }
}
