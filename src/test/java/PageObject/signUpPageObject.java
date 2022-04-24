package PageObject;

import Base.setup;
import Base.test_data;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.Random;

public class signUpPageObject extends setup {
    Faker fkr= new Faker();
    test_data td= new test_data();
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

    @FindBy (how=How.XPATH, using="//*[@id='error_message']/div/p[1]")
    public WebElement errorLocator;

    @FindBy (how=How.XPATH, using="//*[@id='success_message']/div/b")
    public WebElement studentIdLocator;

    @FindBy (how=How.PARTIAL_LINK_TEXT, using="Login")
    public WebElement loginPageLink;



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
    public void enterFakeData(){
        td.global_studentFirstName= fkr.name().firstName();
        td.global_studentLastName= fkr.name().lastName();
        td.global_studentEmail= fkr.internet().emailAddress();
        firstNameLocator.sendKeys(td.global_studentFirstName);
        lastNameLocator.sendKeys(td.global_studentLastName);
        emailLocator.sendKeys(td.global_studentEmail);
        passwordLocator.sendKeys(td.global_studentPassword);
        confirmPWLocator.sendKeys(td.global_studentPassword);

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


    public void verifyError(String expectedError) throws InterruptedException {

        System.out.println(errorLocator.getText());
        Assert.assertEquals(errorLocator.getText(),expectedError, "The error message does not match");
    }

    public void randomDOB(int Month, String Day, String Year){
//        Random rand= new Random();
//        int month = rand.nextInt(12);
//        int day = rand.nextInt(31);
//        int year = rand.ints(1935,2013);

        Select month = new Select(MonthLocator);
        month.selectByIndex(Month);

        Select day = new Select(DayLocator);
        day.selectByVisibleText(Day);

        Select year = new Select(YearLocator);
        year.selectByVisibleText(Year);
    }
    public void randomGender(int a){
        if(a==1){
            chooseGender("male");
        }else{
            chooseGender("female");
        }

    }



}
