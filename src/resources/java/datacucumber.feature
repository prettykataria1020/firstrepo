Feature: demo use of tags in cucumber
Scenario: search a product in the application

Given open the app and land up in search page
When type the below products & search for it
|products|
|headphones|
|mobile phones|
Then ensure product detail is displayed