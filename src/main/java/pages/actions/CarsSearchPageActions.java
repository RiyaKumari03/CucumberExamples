package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.CarSearchPageLocators;
import utils.SeleniumDriverBaseClass;

public class CarsSearchPageActions {

	CarSearchPageLocators carSearchPageLocators = null;
	public CarsSearchPageActions(){
		
		this.carSearchPageLocators = new CarSearchPageLocators();
		PageFactory.initElements(SeleniumDriverBaseClass.getDriver(), carSearchPageLocators);
	}
	
	public void selectCarMake(String carvalue){
		
		Select select = new Select(carSearchPageLocators.selectCar);
		select.selectByValue(carvalue);
	}
	
    public void selectCarModel(String models){
		
		Select select = new Select(carSearchPageLocators.selectModels);
		select.selectByValue(models);
	}
    
    public void selectLocations(String locations){
	
	    Select select = new Select(carSearchPageLocators.selectLocations);
	    select.selectByValue(locations);
    }
    
    public void selectCarPrice(String price){
		
		Select select = new Select(carSearchPageLocators.selectPrice);
		select.selectByValue(price);
	}
    
    public void clickOnFindMyCar(){
    	carSearchPageLocators.findMyCar.click();
    }
    
}
