@example
Feature: Login feature Captcha validation
Scenario Outline: Login feature with invalid credentials
Given user navigates to facebook wesite
When User validates the homepage title
Then User enters "<username>" username
And User enters "<password>" password
And Validate Captcha images
And User clicks on sign in button

Examples:
|username|password|
|valid   |valid   |
|invalid |invalid |
|valid   |invalid |
|invalid |valid   |
