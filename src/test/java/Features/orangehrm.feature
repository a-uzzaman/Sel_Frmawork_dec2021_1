Feature: Add Pay Grade
Scenario: Add Pay Grade in Orange hrm
Given I am on Orange hrm website
When I log in
And I add a pay grade
And I assign a currency to it
Then The pay grade should be created and the currency should be assigned to it

  Scenario: Delete the PayGrade that was added
    Given I am on Orange hrm website
    When I log in
    And I select the pay grade
    And I click delete
    Then the pay grade should be delete