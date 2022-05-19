package PageObject;

import Base.orangeTest_data;
import Base.setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class orangehrmPageObject extends setup {
    orangeTest_data otd = new orangeTest_data();
    public orangehrmPageObject(WebDriver driver){
        PageFactory.initElements(driver, this);
        setup.driver=driver;
    }

    @FindBy (how= How.NAME, using="txtUsername")
    public WebElement UsernameLocator;

    @FindBy (how=How.NAME, using="txtPassword")
    public WebElement PwLocator;

    @FindBy (how=How.NAME, using="Submit")
    public WebElement loginLocator;

    @FindBy (how=How.ID, using="menu_admin_viewAdminModule")
    public WebElement adminLocator;

    @FindBy (how=How.ID, using="menu_admin_Job")
    public WebElement jobLocator;

    @FindBy (how=How.LINK_TEXT, using="Pay Grades")
    public WebElement PayGradesLocator;

    @FindBy (how=How.NAME, using="btnAdd")
    public WebElement AddLocator;

    @FindBy (how=How.ID, using="payGrade_name")
    public WebElement pgNameLocator;

    @FindBy (how=How.ID, using="btnSave")
    public WebElement saveLocator;

    @FindBy (how=How.ID, using="btnAddCurrency")
    public WebElement AddCurrencyLocator;

    @FindBy (how=How.ID, using="payGradeCurrency_currencyName")
    public WebElement CurrencyLocator;

    @FindBy (how=How.XPATH, using="//div[@class='ac_results']")
    public WebElement CurrencyNameLocator;

    @FindBy (how=How.ID, using="payGradeCurrency_minSalary")
    public WebElement MinSalaryLocator;

    @FindBy (how=How.ID, using="payGradeCurrency_maxSalary")
    public WebElement MaxSalaryLocator;

    @FindBy (how=How.ID, using="btnSaveCurrency")
    public WebElement SaveCurrencyLocator;

    @FindBy (how=How.ID, using="ohrmList_chkSelectRecord_19")
    public WebElement SavedPGLocator;

    @FindBy (how=How.ID, using="btnDelete")
    public WebElement deleteLocator;

    @FindBy (how=How.ID, using="dialogDeleteBtn")
    public WebElement ConfirmDeleteLocator;

    public void enterUsername(){
        UsernameLocator.sendKeys(otd.Username);
    }

    public void enterPw()  {
        PwLocator.sendKeys(otd.Password);
    }


    public void enterLogin(){
        loginLocator.click();
    }

    public void enterPayGrade(){
        adminLocator.click();
        jobLocator.click();
        PayGradesLocator.click();
    }

    public void enterAdd(){
        AddLocator.click();
    }

    public void enterPayGradeName(){
        pgNameLocator.sendKeys(otd.PayGradeName);
    }

    public void enterSave(){
        saveLocator.click();
    }

    public void enterAddCurrency(){
        AddCurrencyLocator.click();
    }

    public void enterCurrency(){
        CurrencyLocator.sendKeys(otd.CurrencyName);
//        CurrencyNameLocator.click();
    }

    public void enterSalary(){
        MinSalaryLocator.sendKeys(otd.MinSalary);
        MaxSalaryLocator.sendKeys(otd.MaxSalary);
    }

    public void enterSaveCurrency(){
        SaveCurrencyLocator.click();
    }

    public void enterCheckPG(){
        SavedPGLocator.click();
    }

    public void enterDelete(){
        deleteLocator.click();
        ConfirmDeleteLocator.click();
    }


}
