Feature: Signup for taltektc

  @smoke
  Scenario Outline: Use scenario outline to signup to Taltektc
    Given I am on taltektc website
    When I click on the create new account
    And I enter the "<FirstName>", "<LastName>", "<Email>", "<Password>" and "<ConfirmPassword>"
    And I enter the DOB "<Month>", "<Day>" and "<Year>"
    And I select "<Gender>"
    And I "<Agree>" with the Terms and Condition
    And I click on the create my account
    Then I should see the following "<Error>" message



    Examples:
    |Month|Day|Year|FirstName|LastName|Email|Password|ConfirmPassword|Gender|Agree|Error|
    |Feb  |10 |  1965  |    | Beta | a@b.com | 123456 | 123456 | male |yes  | The First Name field is required.|
    |Mar| 3  |  1990  |    Alpha     |        | a@b.com | 123456 | 123456 | male |yes  | The Last Name field is required.|


    Scenario: Create new user with fake data
      Given I am on taltektc website
      When I go to create an account
      And Fill out the form and submit
      Then My account should be created and I should be able to login