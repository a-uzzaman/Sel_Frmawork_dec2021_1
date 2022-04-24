package StepDef;

import Base.setup;
import Base.test_data;
import PageObject.loginPageObject;
import PageObject.signUpPageObject;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.Date;

public class signUp extends setup {
    signUpPageObject sp = new signUpPageObject(driver);
    Faker fkr= new Faker();
    test_data td= new test_data();
    loginPageObject lp = new loginPageObject(driver);

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
    public void iShouldSeeTheFollowingMessage(String expectedError) throws InterruptedException {
        sp.verifyError(expectedError);
    }

    @When("I go to create an account")
    public void iGoToCreateAnAccount() {
        lp.CreateAccountButton.click();
    }

    @And("Fill out the form and submit")
    public void fillOutTheFormAndSubmit() {


        sp.enterFakeData();
        int month= fkr.random().nextInt(0,11);
        String day = fkr.random().nextInt(0,29).toString();
        String year = fkr.random().nextInt(1935,2012).toString();
        sp.randomDOB(month,day,year);
        int rGender = fkr.random().nextInt(1);
        sp.randomGender(rGender);
        sp.agreeChekboxLocator.click();
        sp.signUpButtonLocator.click();
        System.out.println(sp.studentIdLocator.getText());
        Assert.assertEquals(sp.studentIdLocator.isDisplayed(),true, "Signup was unsuccessful");
        td.global_studentId= sp.studentIdLocator.getText();



    }

    @Then("My account should be created and I should be able to login")
    public void myAccountShouldBeCreatedAndIShouldBeAbleToLogin() {
        sp.loginPageLink.click();
        lp.usernameLocator.sendKeys(td.global_studentId);
        lp.passwordLocator.sendKeys(td.global_studentPassword);
        lp.loginLocator.click();
    }
}
