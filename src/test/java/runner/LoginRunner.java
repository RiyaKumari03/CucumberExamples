package runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/java/features",
                 glue={"stepDefinition"},
                 tags=" @Table or @Map or @example or @background or @prod or @Selenium",
                 plugin = {"html:target/cucumber/report.html"/*,
                		 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"*/})
public class LoginRunner extends AbstractTestNGCucumberTests{

}
