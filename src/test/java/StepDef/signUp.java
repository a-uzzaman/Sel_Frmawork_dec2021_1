package StepDef;

import Base.setup;
import Base.test_data;
import PageObject.loginPageObject;
import PageObject.signupPageObject;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class signUp extends setup {
    signupPageObject sp=new signupPageObject(driver);
    Faker fkr= new Faker();
    test_data td= new test_data();
    loginPageObject lp = new loginPageObject(driver);

    @When("I click on create new account")
    public void iClickOnCreateNewAccount() {
    sp.enterCreateNewAcc();
    }

    @And("I enter {string} as first name")
    public void iEnterAsFirstName(String FirstName) {
    sp.enterFirstname(FirstName);
    }

    @And("I enter {string} as last name")
    public void iEnterAsLastName(String LastName) {
    sp.enterLastname(LastName);
    }

    @And("I enter {string} as email")
    public void iEnterAsEmail(String Email) {
    sp.enterEmail(Email);
    }



    @And("I enter correct confirm password")
    public void iEnterCorrectConfirmPassword() {
    sp.enterConfPassword();
    }

    @And("I enter {string} as month")
    public void iEnterAsMonth(String Month) {
    sp.enterMonth(Month);
    }

    @And("I enter {string} as day")
    public void iEnterAsDay(String Day) {
    sp.enterDay(Day);
    }

    @And("I enter {string} as year")
    public void iEnterAsYear(String Year) {
    sp.enterYear(Year);
    }


    @And("I click on agree to terms")
    public void iClickOnAgreeToTerms() {
    sp.enterAgree();
    }

    @And("I click on the sign up button")
    public void iClickOnTheSignUpButton() {
    sp.enterCreateMyAcc();
    }

    @Then("I should see {string} message")
    public void iShouldSeeMessage(String expectedError) {
        sp.verifyError(expectedError);
    }

    @And("I enter Password")
    public void iEnterPassword() {
        sp.enterPassword();
    }



    @And("I click on the correct gender {string}")
    public void iClickOnTheCorrectGender(String Gender) {
    sp.enterGender(Gender);
    }

    @When("I go to create an account")
    public void iGoToCreateAnAccount() {
        sp.CreateNewAccLocator.click();
    }

    @And("Fill out the form and submit")
    public void fillOutTheFormAndSubmit() {
        td.global_studentFirstName= fkr.name().firstName();
        sp.enterFirstname(td.global_studentFirstName);
        td.global_studentLastName= fkr.name().lastName();
        sp.enterLastname(td.global_studentLastName);
        td.global_studentEmail= fkr.internet().emailAddress();
        sp.enterEmail(td.global_studentEmail);
        sp.PasswordLocator.sendKeys(td.global_studentPassword);
        sp.ConfirmPasswordLocator.sendKeys(td.global_studentConfirmPassword);
        int month= fkr.random().nextInt(0,11);
        String day = fkr.random().nextInt(0,29).toString();
        String year = fkr.random().nextInt(1935,2012).toString();
        sp.randomDOB(month,day,year);
        int rGender = fkr.random().nextInt(1);
        sp.randomGender(rGender);
        sp.agreeLocator.click();
        sp.CreateMyAccountLocator.click();
        System.out.println(sp.studentIdLocator.getText());
        Assert.assertEquals(sp.studentIdLocator.isDisplayed(),true, "Signup was unsuccessful");
        td.global_studentId= sp.studentIdLocator.getText();

    }

    @Then("My account should be created and i should be able to login")
    public void myAccountShouldBeCreatedAndIShouldBeAbleToLogin() {
        sp.loginPageLink.click();
        lp.usernameLocator.sendKeys(td.global_studentId);
        lp.passwordLocator.sendKeys(td.global_studentPassword);
        lp.loginLocator.click();
    }


}
