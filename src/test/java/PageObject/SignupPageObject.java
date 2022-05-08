package PageObject;

import Base.setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.Random;

public class SignupPageObject extends setup{

    public SignupPageObject (WebDriver driver){
        PageFactory.initElements(driver, this);
        setup.driver = driver;
    }

    @FindBy(how= How.LINK_TEXT, using = "Create New Account")
    public WebElement CreateNewAccLocator;

    @FindBy(how= How.NAME, using = "firstName")
    public WebElement FirstnameLocator;

    @FindBy(how= How.NAME, using = "lastName")
    public WebElement LastnameLocator;

    @FindBy(how= How.NAME, using = "email")
    public WebElement EmailLocator;

    @FindBy(how= How.NAME, using = "password")
    public WebElement PasswordLocator;

    @FindBy(how= How.NAME, using = "confirmPassword")
    public WebElement ConfPasswordLocator;

    @FindBy(how= How.XPATH, using = "//form[@id='signup-form']/div[4]/div[1]/select")
    public WebElement MonthLocator;

    @FindBy(how= How.XPATH, using = "//form[@id='signup-form']/div[4]/div[2]/select")
    public WebElement DayLocator;

    @FindBy(how= How.XPATH, using = "//form[@id='signup-form']/div[4]/div[3]/select")
    public WebElement YearLocator;

    @FindBy(how= How.ID, using = "female")
    public WebElement FemaleGenLocator;

    @FindBy(how= How.ID, using = "male")
    public WebElement MaleGenLocator;

    @FindBy(how= How.NAME, using = "agree")
    public WebElement AgreeLocator;

    @FindBy(how = How.XPATH, using = "//form[@id='signup-form']/button")
    public WebElement CreateMyAccLocator;

    @FindBy(how=How.XPATH, using = "//div[@id='error_message']/div/p[1]")
    public WebElement errorMessage;

    @FindBy(how=How.XPATH, using = "//*[@id='success_message']/div/b")
    public WebElement studentIdLocator;

    @FindBy(how=How.PARTIAL_LINK_TEXT, using="Login")
            public WebElement loginPageLink;



    public void enterCreateNewAcc(){CreateNewAccLocator.click();}
    public void enterFirstName(String firstName){FirstnameLocator.sendKeys(firstName); }

    public void enterLastName(String lastName){
        LastnameLocator.sendKeys(lastName);
    }
    public void enterEmail(String email){
       EmailLocator.sendKeys(email);
    }
    public void enterPassword(){
        PasswordLocator.sendKeys("123456");
    }
    public void enterConfPassword(){
        ConfPasswordLocator.sendKeys("123456");
    }
    public void enterMonth(String Month){
        Select month=new Select(MonthLocator);
        month.selectByVisibleText(Month);
    }
    public void enterDay(String Day){
        Select day=new Select(DayLocator);
        day.selectByVisibleText(Day);
    }
    public void enterYear(String Year){
        Select year=new Select(YearLocator);
        year.selectByVisibleText(Year);
    }
    public void enterGender(String Gender) {
        if (Gender.equalsIgnoreCase("male")) {
            MaleGenLocator.click();
        } else if (Gender.equalsIgnoreCase( "female")) {
            FemaleGenLocator.click();
        } else {
            System.out.println("Gender option either not provided or not available");
        }
    }
    public void enterAgree(){
        AgreeLocator.click();
    }
    public void enterCreateMyAcc(){
        CreateMyAccLocator.click();
    }

    public void verifyError(String expectedError){
        Assert.assertEquals(errorMessage.getText(),expectedError, "The expected message does not match");
    }
//    Assert.assertEquals(errorMessage,lp.errorMessage.getText());
    public void randomDOB(int Month,String Day, String Year) {
//        Random rand=new Random();
//        int month=rand.nextInt(12);
//        int day=rand.nextInt(31);
//        int year=rand.ints(1935,2013);
            Select month = new Select(MonthLocator);
            month.selectByIndex(Month);

            Select day = new Select(DayLocator);
            day.selectByVisibleText(Day);

            Select year = new Select(YearLocator);
            year.selectByVisibleText(Year);
        }
        public void randomGender(int a){
        if(a==1){MaleGenLocator.click();
        } else
            FemaleGenLocator.click();

        }

}
