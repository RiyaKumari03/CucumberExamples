@SearchCars 
Feature: Search car feature 

Scenario: Validate car search page 
	Given Navigate to carsguide home page "https://www.carsguide.com.au/"
	When Move to buy + sell button 
	And Click on Search Cars button 
	And Select car "BMW" from dropdown 
	And Select model as "1 Series" from dropdown 
	And Select location as "ACT - All" from dropdown 
	And Select price as $"1000" 
	And Click on Find My Next Car button
	Then The page title should contain "Bmw 1 Series" 
	
	
	
