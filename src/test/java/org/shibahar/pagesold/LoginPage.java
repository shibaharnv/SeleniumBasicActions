package org.shibahar.pagesold;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Helper;

public class LoginPage {

    private WebDriver driver;
    JavascriptExecutor jse ;

    Helper helper;

    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
        helper = new Helper(driver);
    }

    @FindBy(xpath = "//input[@id='signInFormUsername']")
    private WebElement emailField;

    @FindBy(xpath = "//input[@id='signInFormPassword']")
    private WebElement passwordField;


    @FindBy(xpath = "//input[@name='signInSubmitButton']")
    private WebElement signInButton;

    @FindBy(css="input[id='address_input']")
    private WebElement addressSearchField;



    public void enterUserNameAndPassword(String userName,String password) throws Exception {

        jse = (JavascriptExecutor)driver;
        jse.executeScript("document.getElementById('signInFormUsername').setAttribute('type','text');");
        jse.executeScript
                ("document.getElementById('signInFormUsername').value='"+userName+"'");
        String s = (String) jse.executeScript("return document.getElementById('signInFormUsername').value");
        System.out.println("Value entered in hidden field: " +s);

        jse.executeScript("document.getElementById('signInFormPassword').setAttribute('type','text');");
        jse.executeScript
                ("document.getElementById('signInFormPassword').value='"+password+"'");
        String s2 = (String) jse.executeScript("return document.getElementById('signInFormPassword').value");
        System.out.println("Value entered in hidden field: " +s2);

    }

    public void signInButtonClick()
    {
        jse.executeScript("arguments[0].click();", signInButton);
    }

    public void propertyAddressSearchFieldCheck()
    {
        helper.waitForElement(addressSearchField,15);
        addressSearchField.isDisplayed();
    }





}

