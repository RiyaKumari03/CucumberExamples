@UsedCars 
Feature: Used car feature 

Scenario: Validate car search page 
	Given Navigate to carsguide home page "https://www.carsguide.com.au/"
	When Move to buy + sell button 
	And Click on Used Cars button 
	And Select car "Audi" from dropdown 
	And Select model as "A1" from dropdown 
	And Select location as "ACT - All" from dropdown 
	And Select price as $"2000" 
	And Click on Find My Next Car button
	Then The page title should contain "Audi" 
	
	
	
