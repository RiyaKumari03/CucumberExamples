package pages.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pages.locators.CarsGuideHomePageLocators;
import utils.SeleniumDriverBaseClass;

public class CarsGuideHomePageActions {
	
	CarsGuideHomePageLocators carsGuideHomePageLocators=null;
	
	public CarsGuideHomePageActions() {
		
		this.carsGuideHomePageLocators = new CarsGuideHomePageLocators();
		PageFactory.initElements(SeleniumDriverBaseClass.getDriver(), carsGuideHomePageLocators);
		
	}
	
	public void moveToBuySellCars(){
		
		Actions action = new Actions(SeleniumDriverBaseClass.getDriver());
		action.moveToElement(carsGuideHomePageLocators.buySellCars).perform();
	}
	
	public void clickOnSearchCars(){
		
		carsGuideHomePageLocators.searchCars.click();
	}
	
	public void clickOnUsedCars(){
		
		carsGuideHomePageLocators.usedCars.click();
	}
	

}
