package org.shibahar.parallel;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(publish = true,
        features = {"src/test/resources/parallel2"},tags= "@Test",
        glue = {"stepdefinations", "AppHooks"},
        plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        //plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

//publish = true,
        //tags="@Test",
        //tags="@Test",
)

public class MyTestRunner2 {
}
