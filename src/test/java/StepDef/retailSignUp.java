package StepDef;

import Base.retail_test_data;
import Base.setup;
import PageObject.retailLandingPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class retailSignUp extends setup {
    retailLandingPage rlp=new retailLandingPage(driver);
    retail_test_data rtd=new retail_test_data();
    @Given("I am on Automation practice homepage")
    public void iAmOnAutomationPracticeHomepage() {
        
    }

    @When("I go to Sign In")
    public void iGoToSignIn() {
        rlp.enterSignInButton();
    }

    @And("I enter my email")
    public void iEnterMyEmail() {
        rlp.enterEmail();
        rlp.enterCreateAnAc();
    }

    @And("I fill out the form and submit")
    public void iFillOutTheFormAndSubmit() {
        rlp.enterTitle();
        rlp.enterCFN();
        rlp.enterCLN();
        rlp.enterPasswd();
        rlp.enterDoB();
        rlp.enterAd();
        rlp.enterCity();
        rlp.enterState();
        rlp.enterZip();
        rlp.enterCountry();
        rlp.enterPhone();
        rlp.enterAdAlias();
        rlp.enterRegister();
    }

    @Then("My account should be created")
    public void myAccountShouldBeCreated() {
    }
}
