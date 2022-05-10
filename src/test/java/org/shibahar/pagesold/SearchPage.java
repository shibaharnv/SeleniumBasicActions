package org.shibahar.pagesold;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Helper;

import java.time.Duration;

public class SearchPage {

    private WebDriver driver;
    Helper helper;

    public SearchPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
        helper = new Helper(driver);

    }

    @FindBy(xpath = "//input[@id='address_input']")
    private WebElement searchBox;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement searchButton;

    @FindBy(xpath = "//*[@name='JSD widget']")
    private WebElement autoSuggestionFrame;

    @FindBy(xpath = "//div[@class='pac-item'][1]")
    private WebElement firstSuggestion;

    @FindBy(xpath = "//*[contains(text(),'Recent Searches')]")
    private WebElement recentSearchText;

    @FindBy(xpath = "//table[@id='tblValuationHistory']")
    private WebElement recentSearchTableData;

    @FindBy(xpath = "//a[contains(text(),'View Sample Property')]")
    private WebElement viewSamplePropertyLink;


    public void verifySearchPageContents()
    {

        helper.waitForElement(searchBox,15);
        searchBox.isDisplayed();
        recentSearchText.isDisplayed();
        recentSearchTableData.isDisplayed();
        viewSamplePropertyLink.isDisplayed();
    }

    public AnalysisPage searchWithAddress(String address) throws Exception {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
     //   Thread.sleep(3000);
        helper.waitForElement(searchBox,10);
        searchBox.sendKeys(address);
        while (!firstSuggestion.isDisplayed())
        {
            searchBox.clear();
            searchBox.sendKeys(address);
            searchBox.sendKeys(Keys.BACK_SPACE);
            searchBox.sendKeys(Keys.BACK_SPACE);
        }

        helper.waitForElement(firstSuggestion,10);
        //helper.WaitForElementClickable(firstSuggestion,10);
        searchBox.sendKeys(Keys.ARROW_DOWN);
        searchBox.sendKeys(Keys.ARROW_DOWN);
        searchBox.sendKeys(Keys.ENTER);
        return new AnalysisPage(driver);

    }





}
