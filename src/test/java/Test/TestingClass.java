package Test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TestingClass {

    @Test
    public void sampleTest()
    {

        WebDriver driver = new ChromeDriver();

        JavascriptExecutor js=(JavascriptExecutor) driver;

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));



    }

}
