package org.shibahar.pagesold;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Helper;

public class HomePage {


    private  WebDriver driver;

    Helper helper;

    public HomePage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
        helper = new Helper(driver);
    }


    @FindBy(id ="report-navigation")
    private WebElement evraHeader;

    @FindBy(xpath = "//button[@class='button']")
    private WebElement loginButton;

    @FindBy(xpath = "//*[@alt='Evra overview']")
    private WebElement mapView;


    public void evraHeaderValidation() {
        evraHeader.isDisplayed();

    }

    public void loginButtonCheck() {
        loginButton.isDisplayed();
    }

    public LoginPage loginButtonClick() {
        helper.waitForElement(loginButton,15);
        loginButton.click();
        return new LoginPage(driver);
    }


    public void mapViewDisplayed() {
        mapView.isDisplayed();
    }


}
