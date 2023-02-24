@Checkout
Feature: validate checkout page with all data set

Background: 
Given open browser as "chrome"
When enter url as "http://djangovinoth.pythonanywhere.com/login/"

Scenario: validate checkout page with valid data
And enter user name as "Raghul.ps"
And enter password as "shanthip02"
When click login button 
But dont click remember password
Then validate welcome page as "Raghul.ps"
When click logout

Scenario: validate checkout page with valid data
And enter user name as "Raghul.ps"
And enter password as "shanthip02"
When click login button
But dont click remember password
Then validate welcome page as "Raghul.ps"
When click logout

Scenario: validate checkout page with valid data
And enter user name as "Raghul.ps"
And enter password as "shanthip02"
When click login button
But dont click remember password
Then validate welcome page as "Raghul.ps"
When click logout

Scenario: validate checkout page with valid data
And enter user name as "Raghul.ps"
And enter password as "shanthip02"
When click login button
But dont click remember password
Then validate welcome page as "Raghul.ps"
When click logout