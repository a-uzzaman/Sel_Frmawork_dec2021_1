package StepDef;

import Base.setup;
import Base.test_data;
import PageObject.SignupPageObject;
import PageObject.loginPageObject;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class signUp extends setup {
    SignupPageObject sp=new SignupPageObject(driver);
    Faker fkr=new Faker();
    test_data td=new test_data();
    loginPageObject lp=new loginPageObject(driver);


    @When("I click on Create new account")
    public void iClickOnCreateNewAccount() {sp.enterCreateNewAcc();
    }


    @And("I enter {string} as firstname")
    public void iEnterAsFirstname(String firstName) {
        sp.enterFirstName(firstName);
    }

    @And("I enter {string} as lastname")
    public void iEnterAsLastname(String lastName) {
        sp.enterLastName(lastName);
    }

    @And("I enter {string} as email")
    public void iEnterAsEmail(String email) {
        sp.enterEmail(email);
    }



    @And("I enter the correct confirm password")
    public void iEnterTheCorrectConfirmPassword() {
        sp.enterConfPassword();
    }


    @And("I enter the correct month{string}")
    public void iEnterTheCorrectMonth(String Month) {
        sp.enterMonth(Month);
    }

    @And("I enter the correct day{string}")
    public void iEnterTheCorrectDay(String Day) {
        sp.enterDay(Day);
    }

    @And("I enter the correct year{string}")
    public void iEnterTheCorrectYear(String Year) {
        sp.enterYear(Year);
    }

    @And("I click on the correct gender{string}")
    public void iClickOnTheCorrectGender(String Gender) {
        sp.enterGender(Gender);
    }

    @And("I click on the agree to terms")
    public void iClickOnTheAgreeToTerms() {
        sp.enterAgree();
    }

    @And("I click on the signup button")
    public void iClickOnTheSignupButton() {
        sp.enterCreateMyAcc();
    }

    @And("I enter the correct password")
    public void iEnterTheCorrectPassword() {
        sp.enterPassword();
    }


    @Then("I should see {string} message")
    public void iShouldSeeMessage(String expectedError) {
        sp.verifyError(expectedError);
    }

    @When("I go to create an account")
    public void iGoToCreateAnAccount() {sp.enterCreateNewAcc();
    }

    @And("Fill out the form and submit")
    public void fillOutTheFormAndSubmit() {
        td.global_studentFirstName= fkr.name().firstName();
        sp.enterFirstName(td.global_studentFirstName);
        td.global_studentLastName= fkr.name().lastName();
        sp.enterLastName(td.global_studentLastName);
        td.global_studentEmail= fkr.internet().emailAddress();
        sp.enterEmail(td.global_studentEmail);
        sp.PasswordLocator.sendKeys(td.global_studentPassword);
        sp.ConfPasswordLocator.sendKeys(td.global_studentConfirmPassword);
        int month=fkr.random().nextInt(0,11);
        String day=fkr.random().nextInt(0,29).toString();
        String year=fkr.random().nextInt(1935,2013).toString();
        sp.randomDOB(month,day,year);
        int rGender = fkr.random().nextInt(1);
        sp.randomGender(rGender);
        sp.enterAgree();
        sp.enterCreateMyAcc();
        System.out.println(sp.studentIdLocator.getText());
        Assert.assertEquals(sp.studentIdLocator.isDisplayed(), true, "Signup was unsuccessful"); ;
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
