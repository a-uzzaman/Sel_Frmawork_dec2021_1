Feature: SignUp feature sign up

 Scenario Outline: Validate error messages
  Given I am on taltektc website
  When I click on create new account
  And I enter "<FirstName>" as first name
  And I enter "<LastName>" as last name
  And I enter "<Email>" as email
  And I enter Password
  And I enter correct confirm password
  And I enter "<Month>" as month
  And I enter "<Day>" as day
  And I enter "<Year>" as year
  And I click on the correct gender "<Gender>"
  And I click on agree to terms
  And I click on the sign up button
  Then I should see "<Error>" message


  Examples:
  |FirstName|LastName|Email|Month|Day|Year|Error|Gender|
  |         |Doe     |aa@bbb.com  |May     |27|2000|The First Name field is required.|male|



  Scenario: Create new user with fake data
   Given I am on taltektc website
   When I go to create an account
   And Fill out the form and submit
   Then My account should be created and i should be able to login