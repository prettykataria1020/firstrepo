Feature: Test positive Login functionality

Scenario: Valid login by the user
Given User should be on the login page
When User logs in using the valid credentials 
Then User should be in home page