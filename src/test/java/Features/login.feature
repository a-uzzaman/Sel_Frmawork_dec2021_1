Feature: Login feature tests

  Scenario: Login with correct Username and password
    Given I am on taltektc website
    When I enter correct username
    And I enter correct password
    And I click on the login button
    Then I should be able to login