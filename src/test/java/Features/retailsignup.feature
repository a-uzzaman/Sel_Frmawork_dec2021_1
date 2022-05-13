Feature: Sign up

  Scenario: Create new account on automation practice site
    Given I am on automation practice site
    When I click on the sign in button
    And I enter email
    And I click on the create an account button
    And I fill out the information and submit
    Then My account should successfully be created