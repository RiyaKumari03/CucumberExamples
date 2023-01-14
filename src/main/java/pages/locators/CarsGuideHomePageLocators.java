package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarsGuideHomePageLocators {

	@FindBy(how = How.XPATH, using="//a[text()='buy + sell']")
	public WebElement buySellCars;
	
	@FindBy(how = How.XPATH, using="//a[text()='Search Cars']")
	public WebElement searchCars;
	
	@FindBy(how = How.XPATH,using="//a[text()='Used']")
	public WebElement usedCars;
	
}
