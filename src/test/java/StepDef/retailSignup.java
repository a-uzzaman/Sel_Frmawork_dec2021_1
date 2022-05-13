package StepDef;

import Base.retail_test_data;
import Base.setup;
import PageObject.retailLandingPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class retailSignup extends setup {
    retailLandingPage rlp= new retailLandingPage (driver);
    retail_test_data rtd= new retail_test_data();

    @Given("I am on automation practice site")
    public void iAmOnAutomationPracticeSite() {

    }

    @When("I click on the sign in button")
    public void iClickOnTheSignInButton() {
        rlp.enterSignIn();
    }

    @And("I enter email")
    public void iEnterEmail() {
        rlp.enterEmail();
    }

    @And("I click on the create an account button")
    public void iClickOnTheCreateAnAccountButton() {
        rlp.enterCreateAnAcc();
    }

    @And("I fill out the information and submit")
    public void iFillOutTheInformationAndSubmit() {
        rlp.enterTitle();
        rlp.enterFirstName();
        rlp.enterLastName();
        rlp.enterPassword();
        rlp.enterDoB();
        rlp.enterAddress();
        rlp.enterCity();
        rlp.enterState();
        rlp.enterZip();
        rlp.enterCountry();
        rlp.enterPhoneNumber();
        rlp.enterRegister();
    }

    @Then("My account should successfully be created")
    public void myAccountShouldSuccessfullyBeCreated() {
    }
}
