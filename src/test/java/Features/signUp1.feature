Feature: Signup

  Scenario Outline: Validate error message
    Given I am on taltektc website
    When I click on Create new account
    And I enter "<firstName>" as firstname
    And I enter "<lastName>" as lastname
    And I enter "<email>" as email
    And I enter the correct password
    And I enter the correct confirm password
    And I enter the correct month"<Month>"
    And I enter the correct day"<Day>"
    And I enter the correct year"<Year>"
    And I click on the correct gender"<Gender>"
    And I click on the agree to terms
    And I click on the signup button
    Then I should see "<Error>" message
    Examples:
      |firstName|lastName|email|Month|Day|Year|Gender|Error|
      |         | abcd  |a1@b.com |Feb  |10 |2000|female|The First Name field is required.|
#    |Jane     |        |janedoe@gmail.com|female|Feb|10|2000|                                                          |
#    |Jane     |Doe     |                 |female|Feb|10|2000|
#

  Scenario: Create new user with fake data
    Given I am on taltektc website
    When I go to create an account
    And Fill out the form and submit
    Then My account should be created and I should be able to login

