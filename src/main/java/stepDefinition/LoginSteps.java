package stepDefinition;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("user navigates to facebook wesite")
	public void user_navigates_to_facebook_wesite() {
	   System.out.println("user 1");
	}

	@When("User validates the homepage title")
	public void user_validates_the_homepage_title() {
		System.out.println("user 2");
	}

	@Then("User enters {string} username")
	public void user_enters_username(String username) {
		System.out.println("user 3 "+username); 
	}

	@Then("User enters {string} password")
	public void user_enters_password(String password) {
		System.out.println("user 4 "+password);
	}

	@Then("User clicks on sign in button")
	public void user_clicks_on_sign_in_button() {
	    
		System.out.println("user 5");
	}
	
	@Then("Validate Captcha images")
	public void verifyCaptcha(){
		System.out.println("Captcha step ");
	}
    
	@Then("User enters username and password")
	public void enterUserAndPass(DataTable data){
		
		List<List<String>> table = data.asLists();
		System.out.println("size for table "+table.size());
		System.out.println("Username and password details "+table.get(0).get(0)+"  "+table.get(0).get(1));
		System.out.println("Username and password details "+table.get(1).get(0)+"  "+table.get(1).get(1));
		
	}
	@Then("User enters username and password using Map")
	public void enterUserAndPassMap(DataTable data){
		List<Map<String,String>> map = data.asMaps();
		System.out.println("Username and password map "+map.get(0).get("username")+" "+map.get(0).get("password"));
		System.out.println("Username and password map "+map.get(1).get("username")+" "+map.get(1).get("password"));
		
		for(Map<String,String> m : data.asMaps(String.class, String.class))
			System.out.println("First name and Last name  "+m.get("username")+"  "+m.get("password"));
	}
}
