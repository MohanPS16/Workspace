Feature: validate checkout page with all data set

@validCheckout
Scenario: validate checkout page with valid data
Given open browser
When enter url
And enter user name
And enter password
When click login button
But dont click remember password
Then validate welcome page