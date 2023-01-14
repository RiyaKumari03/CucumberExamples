@prod 
Feature: Login to facebook application feature 

Scenario: Login feature with valid credentials 
	Given user navigates to facebook wesite 
	When User validates the homepage title 
	Then User enters "valid" username 
	And User enters "valid" password 
	And User clicks on sign in button 
	
	
Scenario Outline: Login feature with invalid credentials 
	Given user navigates to facebook wesite 
	When User validates the homepage title 
	Then User enters "<username>" username 
	And User enters "<password>" password 
	And User clicks on sign in button 
	
	Examples: 
		|username|password|
		|valid   |valid   |
		|invalid |invalid |
		|valid   |invalid |
		|invalid |valid   |
