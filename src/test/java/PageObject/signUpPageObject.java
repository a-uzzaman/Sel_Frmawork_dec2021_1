package PageObject;

import Base.setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class signUpPageObject extends setup {

    public signUpPageObject (WebDriver driver){
        PageFactory.initElements(driver, this);
        setup.driver = driver;
    }

    @FindBy (how= How.CSS, using = "#signup-form > div:nth-child(10) > div:nth-child(1) > select")
    public WebElement MonthLocator;

    @FindBy (how= How.NAME, using = "day")
    public WebElement DayLocator;

    @FindBy (how= How.NAME, using = "year")
    public WebElement YearLocator;

    @FindBy (how=How.NAME, using="firstName")
    public WebElement firstNameLocator;

    @FindBy (how=How.NAME, using="lastName")
    public WebElement lastNameLocator;

    @FindBy (how=How.NAME, using="email")
    public WebElement emailLocator;

    @FindBy (how=How.NAME, using="password")
    public WebElement passwordLocator;

    @FindBy (how=How.NAME, using="confirmPassword")
    public WebElement confirmPWLocator;

    @FindBy (how=How.ID, using="male")
    public WebElement genderMLocator;

    @FindBy (how=How.CSS, using="#female")
    public WebElement genderFLocator;

    @FindBy (how=How.NAME, using="agree")
    public WebElement agreeChekboxLocator;

    @FindBy (how=How.CSS, using=".signup-btn")
    public WebElement signUpButtonLocator;

    @FindBy (how=How.CSS, using="#error_message > div > p:nth-child(2)")
    public WebElement errorLocator;



    public void chooseDOB(String Month, String Day, String Year){
        Select month = new Select(MonthLocator);
        month.selectByVisibleText(Month);

        Select day = new Select(DayLocator);
        day.selectByVisibleText(Day);

        Select year = new Select(YearLocator);
        year.selectByVisibleText(Year);
    }

    public void enterNameEmailPassword(String FirstName, String LastName, String Email, String Password, String ConfirmPassword){

        firstNameLocator.sendKeys(FirstName);
        lastNameLocator.sendKeys(LastName);
        emailLocator.sendKeys(Email);
        passwordLocator.sendKeys(Password);
        confirmPWLocator.sendKeys(ConfirmPassword);

    }

    public void chooseGender(String Gender){
        if(Gender.equalsIgnoreCase("male")){
            genderMLocator.click();
        }else if (Gender.equalsIgnoreCase("female")){
            genderFLocator.click();
        } else{
            System.out.println("Gender Option either not provided or not available");
        }
    }


    public void verifyError(String expectedError){
        System.out.println(errorLocator.getText());
        Assert.assertEquals(errorLocator.getText(),expectedError, "The error message does not match");
    }





}
