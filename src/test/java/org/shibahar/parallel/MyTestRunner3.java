package org.shibahar.parallel;


//import io.cucumber.junit.CucumberOptions;
//import org.testng.annotations.Test;
//
//import io.cucumber.testng.CucumberOptions;
//
//import org.testng.annotations.Test;
////import cucumber.api.CucumberOptions;
//import cucumber.api.testng.AbstractTestNGCucumberTests;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.Test;
import cucumber.api.CucumberOptions;
//import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/parallel2"},tags= "@Test",
        glue = {"stepdefinations", "AppHooks"}
       // plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        //plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

        ///Users/snagarajan/Desktop/ApiTestAutomation/NaveenCucumber/SeleniumCucumberUiFramework/src/test/resources/parallel/HomePage.feature
//publish = true,
        //tags="@Test",
        //tags="@Test",

)

//public class MyTestRunner {
//}
@Test
public class MyTestRunner3 extends AbstractTestNGCucumberTests {

}