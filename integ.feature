Feature: functional testing on testme
Scenario: valid login

Given user has launched test me
When user enters "lalitha" & "Password123" 
And click on login button
Then user must be login successfully