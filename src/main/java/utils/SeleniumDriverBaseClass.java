package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDriverBaseClass {
	
	private static SeleniumDriverBaseClass seleniumDriver;
	private static WebDriver driver;
	public final static int TIMEOUT = 30;
	public static final int PAGE_TIME_OUT = 30;
	private WebDriverWait wait;
	
	
	private SeleniumDriverBaseClass(){
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver,Duration.ofSeconds(TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
		
	}
	
	public static void launchURL(String url){
		driver.get(url);
	}
	
	public static WebDriver getDriver(){
		return driver;
		
	}
    
	public static void setUpDriver(){
		
		if(seleniumDriver == null){
			seleniumDriver = new SeleniumDriverBaseClass();
		}
			
	}
	
	public static void tearDown(){
		
		if(driver!=null){
			
		driver.close();
		driver.quit();
		}
		seleniumDriver = null;
	}
}
