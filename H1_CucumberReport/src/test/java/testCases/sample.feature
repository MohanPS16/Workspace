@amazon
Feature: Validate amazon app

  @validLogin @login @validscenario @somke
  Scenario: validate app with valid login
    Given login with valid data

  @invalidLogin @login @invalidscenario
  Scenario: validate app with invalid login
    Given login with invalid data

  @guestLogin @login
  Scenario: validate app with guest user login
    Given login with guest data

  @adminLogin @login
  Scenario: validate app with admin user login
    Given login with admin data

  @validPayment @payment @validscenario @somke
  Scenario: validate app with valid payment
    Given payment with valid data

  @invalidPayment @payment @invalidscenario
  Scenario: validate app with invalid payment
    Given payment with invalid data

  @guestPayment @payment
  Scenario: validate app with guest payment
    Given payment with guest data

  @searchMobile @search @validscenario @somke
  Scenario: search app with mobile
    Given search app with mobile

  @searchLaptop @search @somke
  Scenario: search app with laptop
    Given search app with laptop

  @searchHearPhone @search @somke
  Scenario: search app with hearphone
    Given search app with hearphone
