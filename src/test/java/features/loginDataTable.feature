@Table 
Feature: Login feature with Datatable 

Scenario: Login feature with datatable 
	Given user navigates to facebook wesite 
	When User validates the homepage title 
	Then User enters username and password 
		|abc|xyz|
		|def|ghi|
	And User clicks on sign in button 