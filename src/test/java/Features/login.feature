Feature: Login feature tests

#  Scenario: Login with correct Username and password
#    Given I am on taltektc website
#    When I enter correct username
#    And I enter correct password
#    And I click on the login button
#    Then I should be able to login
#
#    Scenario: Login with data from Feature file using Parameters
#      Given I am on taltektc website
#      When I enter "TTCztFiu" as username
#      And I enter "123456" as password
#      And I click on the login button
#      Then I should be able to login
#
#    Scenario: Login with data from Feature file using Datatable
#      Given I am on taltektc website
#      When I enter username
#        |Row|Username|Password|
#        |1|TTCztFiu|123456|
#      And I enter password
#        |Row|Username|Password|
#        |1|TTCztFiu|123456|
#      And I click on the login button
#      Then I should be able to login
#
#    Scenario Outline:  Login with data from Feature file using Scenario
#      Given I am on taltektc website
#      When I enter "<username>" as username
#      And I enter "<password>" as password
#      And I click on the login button
#      Then I should see "<Error_message>"
#      Examples:
#      |username|password|Error_message|
#      |TTCztFiu|123456||
#      |   asdfdsf     |  asdfsdaf    |You have entered an incorrect email or student Id.|
#
#  Scenario Outline: Validate error messages
#    Given I am on taltektc website
#    When I click on the create new account
#    And I enter the "<Month>"
#    Examples:
#      |Month|
#      |Feb|
