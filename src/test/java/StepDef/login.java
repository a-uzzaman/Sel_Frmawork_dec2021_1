package StepDef;

import Base.setup;
import PageObject.loginPageObject;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login extends setup {

    loginPageObject lp= new loginPageObject(driver);

    @Given("I am on taltektc website")
    public void iAmOnTaltektcWebsite() {
        System.out.println("This is the given step");
    }

    @When("I enter correct username")
    public void iEnterCorrectUsername() {
        System.out.println("This is the When step");
        lp.enterUsername();

    }

    @And("I enter correct password")
    public void iEnterCorrectPassword() {
        System.out.println("This is the And step");
        lp.enterPassword();
    }

    @And("I click on the login button")
    public void iClickOnTheLoginButton() {
        System.out.println("This is the And step");
        lp.clickSubmit();
    }

    @Then("I should be able to login")
    public void iShouldBeAbleToLogin() {
        System.out.println("This is the Then step");
    }
}
