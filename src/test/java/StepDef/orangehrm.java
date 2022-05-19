package StepDef;

import Base.setup;
import PageObject.orangehrmPageObject;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class orangehrm extends setup {
    orangehrmPageObject opg=new orangehrmPageObject(driver);
    @Given("I am on Orange hrm website")
    public void iAmOnOrangeHrmWebsite() {
        System.out.println("Successfully on Orange hrm");
    }

    @When("I log in")
    public void iLogIn() {
       opg.enterUsername();
       opg.enterPw();
       opg.enterLogin();

    }

    @And("I add a pay grade")
    public void iAddAPayGrade() {
        opg.enterPayGrade();
        opg.enterAdd();
        opg.enterPayGradeName();
        opg.enterSave();

    }

    @And("I assign a currency to it")
    public void iAssignACurrencyToIt() {
        opg.enterAddCurrency();
        opg.enterCurrency();
        opg.enterSalary();
        opg.enterSaveCurrency();
    }

    @Then("The pay grade should be created and the currency should be assigned to it")
    public void thePayGradeShouldBeCreatedAndTheCurrencyShouldBeAssignedToIt() {
        System.out.println("Pay Grade created with currency assigned to it successfully");
    }

    @And("I select the pay grade")
    public void iSelectThePayGrade() {
        opg.enterPayGrade();
        opg.enterCheckPG();
    }

    @And("I click delete")
    public void iClickDelete() {
        opg.enterDelete();
    }

    @Then("the pay grade should be delete")
    public void thePayGradeShouldBeDelete() {
        System.out.println("The pay grade was deleted successfully");
    }
}
