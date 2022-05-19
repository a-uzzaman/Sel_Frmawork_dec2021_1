package PageObject;

import Base.Nick_ohrm_test_data;
import Base.setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Nick_ohrm_jobsemploymentstatus extends setup {

    public Nick_ohrm_jobsemploymentstatus (WebDriver driver) {
        PageFactory.initElements(driver,this);
        setup.driver = driver;
    }

    @FindBy(how = How.NAME, using = "txtUsername")
    public WebElement usernameLocator;

    @FindBy(how = How.NAME, using = "txtPassword")
    public WebElement passwordLocator;

    @FindBy(how = How.NAME, using = "Submit")
    public WebElement loginLocator;

    @FindBy(how = How.LINK_TEXT, using = "Admin")
    public WebElement adminLocator;

    @FindBy(how = How.ID,using = "menu_admin_Job")
    public WebElement jobtabLocator;

    @FindBy(how = How.ID, using = "menu_admin_employmentStatus")
    public WebElement employmentstatusLocator;

    @FindBy(how = How.NAME,using = "btnAdd")
    public WebElement addLocator;

    @FindBy(how = How.NAME,using = "empStatus[name]")
    public WebElement ESnameLocator;

    @FindBy(how = How.NAME,using = "btnSave")
    public WebElement saveLocator;

Nick_ohrm_test_data otd= new Nick_ohrm_test_data();

    public void enterUsername(){
        usernameLocator.sendKeys(otd.username);
    }

    public void enterPW(){
        passwordLocator.sendKeys(otd.password);
    }

    public void enterLogin(){
        loginLocator.click();
    }

    public void enterEmploymentStatus(){
        adminLocator.click();
        jobtabLocator.click();
        employmentstatusLocator.click();
    }

    public void enterAdd(){
        addLocator.click();
    }

    public void enterEmploymentStatusName(){
        ESnameLocator.sendKeys(otd.EmploymentStatusName);
    }

    public void enterSave(){
        saveLocator.click();
    }






}
