package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;

public class Hooks {

	 WebDriver driver;
	
	@BeforeAll
	public static void beforeAllFeature(){
		System.out.println("Before All");
	}
	@Before(order = 0)
	public void beforeHook(){
		System.out.println("Before");
	}
	@Before("@prod")
	public void beforeHook1(){
		System.out.println("Before scenario 1");
	}
	@BeforeStep("@prod")
	public void beforeEvery(){
		System.out.println("Before every ");
	}
	
	@After("@example")
	public void afterHook1(){
		System.out.println("After scenario 1");
	}
	@After(order =0)
	public void afterHook(){
		System.out.println("Before");
	}
	
	
	@AfterStep("@prod")
	public void afterEvery(){
		System.out.println("After every step");
	}
	@AfterAll
	public static void afterAllFeature(){
		System.out.println("After all feature ");
	}
}
