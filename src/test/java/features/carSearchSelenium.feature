@Selenium
Feature: Car search feature

Scenario: Validation of car search feature
Given Navigate to carsguide page
When Click on buy+sale button
Then Search for "BMW" cars
Then Verify the title of page contains "BMW"