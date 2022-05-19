package StepDef;

import Base.setup;
import PageObject.Nick_ohrm_jobsemploymentstatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Nick_ohrm extends setup {
    Nick_ohrm_jobsemploymentstatus oes= new Nick_ohrm_jobsemploymentstatus(driver);
    @Given("I am on ohrm website")
    public void iAmOnOhrmWebsite() {
        System.out.println("Successfully on ohrm website");
    }

    @When("I log in")
    public void iLogIn() {
        oes.enterUsername();
        oes.enterPW();
        oes.enterLogin();
    }

    @And("I add a employment status name and click save")
    public void iAddAEmploymentStatusNameAndClickSave() {
        oes.enterEmploymentStatus();
        oes.enterAdd();
        oes.enterEmploymentStatusName();
        oes.enterSave();
    }

    @Then("the employment status name should be added")
    public void theEmploymentStatusNameShouldBeAdded() {
    }
}
