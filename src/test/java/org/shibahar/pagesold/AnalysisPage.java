package org.shibahar.pagesold;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Helper;


import java.util.ArrayList;
import java.util.List;

public class AnalysisPage {
    private WebDriver driver;
    Helper helper;
    public AnalysisPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
        helper = new Helper(driver);
    }

    //Tabs

    @FindBy(xpath = "//*[contains(text(),'Evra Analysis')]")
    private WebElement evraAnalysisText;
    @FindBy(xpath = "//*[contains(text(),'Neighborhood')]")
    private WebElement neighborhood;
    @FindBy(xpath = "//*[contains(text(),'Location')]")
    private WebElement location;
    @FindBy(xpath = "//*[contains(text(),'Benchmarks')]")
    private WebElement benchmarks;
    @FindBy(xpath = "//*[contains(text(),'Valuation')]")
    private WebElement valuation;


    //Sales Comps Tab
    @FindBy(xpath = "//div[contains(text(),'Sales Comps')]")
    private WebElement salesCompsTab;

    @FindBy(xpath = "//div[contains(text(),'Edit property details')]")
    private WebElement editPropertyDetailsLink;

    @FindBy(xpath = "//input[@id='number_of_units']")
    private WebElement noOfUnitsTextBox;

    @FindBy(xpath = "//input[@id='year_built']")
    private WebElement constructionYearTextBox;

    @FindBy(xpath = "//input[@id='noi']")
    private WebElement netOperatingIncomeTextBox;


    @FindBy(xpath = "//*[contains(text(),'Display Comps')]")
    private WebElement displayCombsButton;


    @FindBy(xpath = "//table[@class='table-auto text-xs']/thead/tr/th")
    private List<WebElement> compareTransactionTable;









    //OverviewSection
    @FindBy(xpath = "//*[contains(text(),'Property Details')]")
    WebElement propertyDetails;

    @FindBy(xpath = "//div[@class='box-title']//span[contains(text(),'Neighborhood')]")
    WebElement neighborhoodSection;

    @FindBy(xpath = "//div[@class='box-title']//span[contains(text(),'Location Benchmarks')]")
    WebElement locationBenchmarks;

    @FindBy(xpath = "//div[@class='box-title']//span[contains(text(),'Sales Comps')]")
    WebElement salesCompsSection;

    public void pageContentsValidation()  {

        helper.waitForElement(propertyDetails,20);
        propertyDetails.isDisplayed();
        neighborhoodSection.isDisplayed();
        locationBenchmarks.isDisplayed();
        salesCompsSection.isDisplayed();
    }

    public void navigateToSalesCompsTab()
    {
        helper.waitForElement(salesCompsTab,20);
        salesCompsTab.click();
    }

    public void addPropertyDetails(String units,String constructionYear,String income) throws InterruptedException {
       // helper.waitForElement(editPropertyDetailsLink,10);
       // editPropertyDetailsLink.click();
        helper.waitForElement(noOfUnitsTextBox,10);
        noOfUnitsTextBox.sendKeys(units);
        constructionYearTextBox.sendKeys(constructionYear);
        netOperatingIncomeTextBox.sendKeys(income);
        displayCombsButton.click();
    }


    public List<String> compareTableColumnValidation()
    {
        WebElement column;
        String columnName;

        List<String> actualColumnNames= new ArrayList<>();

            for(int i=0;i<compareTransactionTable.size();i++)
            {
                    column=compareTransactionTable.get(i);
                    columnName= column.getText();
                    columnName=columnName.trim();
                    actualColumnNames.add(columnName);
            }
        System.out.println("actualColumnNames "+actualColumnNames);

        return actualColumnNames;

    }

    public List<String> expectedColumnNames()
    {
        List<String> expectedColumnNames= new ArrayList<String>();
        expectedColumnNames.add("Address");
        expectedColumnNames.add("Transaction Price");
        expectedColumnNames.add("# Units");
        expectedColumnNames.add("Price/Unit");
        expectedColumnNames.add("Sale Date");
        expectedColumnNames.add("Distance");
        expectedColumnNames.add("Year Built");
        expectedColumnNames.add("Comp Score");
        return expectedColumnNames;
    }

    //First body
   // Address =//table[@class='table-auto text-xs']/tbody[1]/tr/td[1]
  //unit=  //table[@class='table-auto text-xs']/tbody[1]/tr/td[3]
  //yearbuil=//table[@class='table-auto text-xs']/tbody[1]/tr/td[7]

    public void verifyAddedPropertyDetails()
    {
       String actualAddress= driver.findElement(By.xpath("//table[@class='table-auto text-xs']/tbody[1]/tr/td[1]")).getText();

        String actualUnits= driver.findElement(By.xpath("//table[@class='table-auto text-xs']/tbody[1]/tr/td[3]")).getText();

        String yearBuilt= driver.findElement(By.xpath("//table[@class='table-auto text-xs']/tbody[1]/tr/td[7]")).getText();


    }






}
