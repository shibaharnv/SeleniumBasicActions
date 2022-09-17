package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {

    WebDriver driver;

    By login = By.xpath("xyz");
    @FindBy(xpath = "abc")
    WebElement elementname;

    public GooglePage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
}
