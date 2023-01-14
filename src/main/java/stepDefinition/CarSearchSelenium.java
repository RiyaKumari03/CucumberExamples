package stepDefinition;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CarSearchSelenium {

	ChromeDriver driver;
	
	@Before("@Selenium")
	public void getDriver(){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	@After("@Selenium")
	public void quitDriver(Scenario scenario){
		
		/*if (scenario.isFailed()) {
		      // Take a screenshot...
		      final byte[] screenshot = driver.getScreenshotAs(OutputType.BYTES);
		   // embed it in the report.
		      scenario.attach(screenshot, "image/png",scenario.getName()); 
		}*/
		driver.close();
		driver.quit();
		
	}
	@Given("Navigate to carsguide page")
	public void i_am_on_the_home_page_of_https_www_carsguide_com_au_website() throws IOException {
		
		
	    driver.get("https://www.carsguide.com.au/");
	    driver.manage().window().maximize();
	    
	    
	}
	@When("Click on buy+sale button")
	public void i_move_to_car_for_sale_menu() {
		driver.findElement(By.xpath("//a[text()='buy + sell']")).click();
	    
	}
	@Then("Search for {string} cars")
	public void i_click_on_search_cars(String car) {
	//driver.switchTo().frame("LOCSTORAGE");	
	   driver.findElement(By.xpath("//div[@class='cgsearch-wrapper']/input[@id='cgsearch']")).sendKeys(car);
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   List<WebElement> list = driver.findElements(By.xpath("//div[contains(@class,'search-input')]/ul/li"));
	   list.get(1).click();
	}
	@Then("Verify the title of page contains {string}")
	public void i_select_make_as_bmw(String value) {
	    System.out.println("Title of the page "+driver.getTitle());
	    Assert.assertTrue(driver.getTitle().contains(value));
	}
	@Then("I select model as {string}")
	public void i_select_model_as_1series(String value) {
	    
	}
	@Then("I select location as {string}")
	public void i_select_location_as_australia(String value) {
	    
	}
	@Then("I select price as ${int}")
	public void i_select_price_as_$(Integer int1) {
	    
	}
	@Then("I click on Find My Next Car Button")
	public void i_click_on_find_my_next_car_button() {
	    	}
	@Then("I should see list of search cars")
	public void i_should_see_list_of_search_cars() {
	   
	}
	@Then("the page title should contains {string}")
	public void the_page_title_should_contains_bmw() {
	    
	}
}
