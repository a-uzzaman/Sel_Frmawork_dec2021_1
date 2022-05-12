Feature: Retail Register
Scenario: Register new account
  Given I am on Automation practice homepage
  When I go to Sign In
  And I enter my email
  And I fill out the form and submit
  Then My account should be created