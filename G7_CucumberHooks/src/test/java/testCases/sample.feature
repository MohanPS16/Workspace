Feature: validate checkout page with all data set

Background: 
Given open browser as "chrome"

@validCheckout
Scenario: validate checkout page with valid data
When enter url as "sample url"
And enter user name as "user a"
And enter password as "password"
When click login button 
But dont click remember password
Then validate welcome page as "welcome vcentry"