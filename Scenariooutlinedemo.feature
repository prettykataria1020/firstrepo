Feature: demo on scenario outline examples
Scenario Outline: login for testmeapp 

Given user must be in the login page
When user enters "<username>" and "<password>"
And performs login
Then user must be in home page

Examples: 
|username||password|
|abc||abc|
|xyz||xyz|