package steps;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.CarsGuideHomePageActions;
import pages.actions.CarsSearchPageActions;
import utils.SeleniumDriverBaseClass;

public class SearchCarSteps {
	CarsGuideHomePageActions carsGuideHomePageActions = new CarsGuideHomePageActions();
	CarsSearchPageActions carsSearchPageActions = new CarsSearchPageActions();

	@Given("Navigate to carsguide home page {string}")
	public void navigate_to_carsguide_home_page(String url) {
		
		SeleniumDriverBaseClass.launchURL(url);	   
	}
	@When("Move to buy + sell button")
	public void move_to_button() {
		
	    carsGuideHomePageActions.moveToBuySellCars();
	}
	@When("Click on Search Cars button")
	public void click_on_button() {
	    
		carsGuideHomePageActions.clickOnSearchCars();
	}
	@When("Select car {string} from dropdown")
	public void select_car_from_dropdown(String carvalue) {
		
	    carsSearchPageActions.selectCarMake(carvalue);
	}
	@When("Select model as {string} from dropdown")
	public void select_model_as_from_dropdown(String model) {
	   
		carsSearchPageActions.selectCarModel(model);
	}
	@When("Select location as {string} from dropdown")
	public void select_location_as_from_dropdown(String locations) {
	    
		carsSearchPageActions.selectLocations(locations);
	}
	@When("Select price as ${string}")
	public void select_price_as(String price) {
	 
		carsSearchPageActions.selectCarPrice(price);
	}
	@When("Click on Find My Next Car button")
	public void findMyNextCarButton(){
		
		carsSearchPageActions.clickOnFindMyCar();
	}
	
	@When("Click on Used Cars button")
	public void usedCarsButton(){
		
		carsGuideHomePageActions.clickOnUsedCars();
	}
	
	@Then("The page title should contain {string}")
	public void the_page_title_should_contain(String title) {
	    
		System.out.println("Page title "+SeleniumDriverBaseClass.getDriver().getTitle());
		Assert.assertTrue(SeleniumDriverBaseClass.getDriver().getTitle().contains(title));
	}
	
}
