package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/pomfeatures",
                 glue={"steps"},
                 tags="@SearchCars or @UsedCars",
                 plugin = {"html:target/cucumber/report.html",
                 /*"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"*/})
public class pomRunner extends AbstractTestNGCucumberTests{

}
