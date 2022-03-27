package StepDef;

import Base.setup;
import PageObject.loginPageObject;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

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

    @When("I enter {string} as username")
    public void iEnterAsUsername(String username) {
        lp.usernameLocator.sendKeys(username);
    }

    @And("I enter {string} as password")
    public void iEnterAsPassword(String password) {
        lp.passwordLocator.sendKeys(password);
    }

    @When("I enter username")
    public void iEnterUsername(DataTable t) {
        lp.usernameLocator.sendKeys(t.cell(1,1));

    }

    @And("I enter password")
    public void iEnterPassword(DataTable t) {
        lp.passwordLocator.sendKeys(t.cell(1,2));
    }

    @Then("I should see {string}")
    public void iShouldSee(String errorMessage) {
        Assert.assertEquals(errorMessage,lp.errorMessage.getText());
    }
}
