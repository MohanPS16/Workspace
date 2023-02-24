@Checkout
Feature: validate checkout page with all data set

@validCheckout
Scenario: validate checkout page with valid data
Given open browser as "chrome"
When enter url as "http://djangovinoth.pythonanywhere.com/login/"
And enter user name as "Raghul.ps"
And enter password as "shanthip02"
When click login button 
But dont click remember password
Then validate welcome page as "Raghul.ps"

@invalidCheckout
Scenario: validate checkout page with invalid data
Given open browser as "chrome"
When enter url as "http://djangovinoth.pythonanywhere.com/login/"
And enter user name as "Raghul.ps"
And enter password as "shanthip02"
When click login button 
But dont click remember password
Then validate welcome page as "Raghul.ps"

@emptyCheckout
Scenario: validate checkout page with empty data
Given open browser as "chrome"
When enter url as "http://djangovinoth.pythonanywhere.com/login/"
And enter user name as "Raghul.ps"
And enter password as "shanthip02"
When click login button 
But dont click remember password
Then validate welcome page as "Raghul.ps"