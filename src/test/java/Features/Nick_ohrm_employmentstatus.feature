Feature: Add Employment Status
  Scenario: Add Employment Status Name in ohrm
    Given I am on ohrm website
    When I log in
    And I add a employment status name and click save
    Then the employment status name should be added