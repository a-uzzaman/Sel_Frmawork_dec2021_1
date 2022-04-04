package StepDef;

import Base.setup;
import PageObject.signUpPageObject;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class signUp extends setup {
    signUpPageObject sp = new signUpPageObject(driver);

    @When("I enter the {string}, {string}, {string}, {string} and {string}")
    public void iEnterTheAnd(String FirstName, String LastName, String Email, String Password, String ConfirmPassword) {
        sp.enterNameEmailPassword(FirstName,LastName,Email,Password,ConfirmPassword);
    }

    @And("I enter the DOB {string}, {string} and {string}")
    public void iEnterTheDOBAnd(String Month, String Day, String Year) {
        sp.chooseDOB(Month,Day,Year);
    }

    @And("I {string} with the Terms and Condition")
    public void iWithTheTermsAndCondition(String arg0) {
        sp.agreeChekboxLocator.click();
    }

    @And("I select {string}")
    public void iSelect(String Gender) {
        sp.chooseGender(Gender);
    }


    @And("I click on the create my account")
    public void iClickOnTheCreateMyAccount() {
        sp.signUpButtonLocator.click();
    }

    @Then("I should see the following {string} message")
    public void iShouldSeeTheFollowingMessage(String expectedError) {
        sp.verifyError(expectedError);
    }
}
