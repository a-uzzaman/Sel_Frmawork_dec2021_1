package PageObject;

import Base.retail_test_data;
import Base.setup;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;


public class retailLandingPage extends setup {

    public retailLandingPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        setup.driver = driver;
        Faker fkr = new Faker();

    }

    retail_test_data rtd = new retail_test_data();
    Random rnd = new Random();

    @FindBy(how = How.LINK_TEXT, using = "Sign in")
    public WebElement SignInLocator;

    @FindBy(how = How.NAME, using = "email_create")
    public WebElement emailLocator;

    @FindBy(how = How.NAME, using = "SubmitCreate")
    public WebElement createAnAccLocator;

    @FindBy(how = How.ID, using = "id_gender1")
    public WebElement MrLocator;

    @FindBy(how = How.ID, using = "id_gender2")
    public WebElement MrsLocator;

    @FindBy(how = How.NAME, using = "customer_firstname")
    public WebElement firstNameLocator;

    @FindBy(how = How.NAME, using = "customer_lastname")
    public WebElement lastNameLocator;

    @FindBy(how = How.NAME, using = "passwd")
    public WebElement pwLocator;

    @FindBy(how = How.XPATH, using = "//*[@id='days']")
    public WebElement dayLocator;

    @FindBy(how = How.XPATH, using = "//*[@id='months']")
    public WebElement monthLocator;

    @FindBy(how = How.XPATH, using = "//*[@id='years']")
    public WebElement yearLocator;

    @FindBy(how = How.NAME, using = "address1")
    public WebElement addressLocator;

    @FindBy(how = How.NAME, using = "city")
    public WebElement cityLocator;

    @FindBy(how = How.XPATH, using = "//*[@id='id_state']")
    public WebElement stateLocator;

    @FindBy(how = How.NAME, using = "postcode")
    public WebElement zipLocator;

    @FindBy(how = How.XPATH, using = "//*[@id='id_country']")
    public WebElement countryLocator;

    @FindBy(how = How.NAME, using = "phone_mobile")
    public WebElement numberLocator;

    @FindBy(how = How.NAME, using = "submitAccount")
    public WebElement registerLocator;


    public void enterSignIn() {
        SignInLocator.click();
    }

    public void enterEmail() {
        emailLocator.sendKeys(rtd.customer_email);
    }

    public void enterCreateAnAcc() {
        createAnAccLocator.click();
    }

    public void enterTitle() {
        int rTitle = rnd.nextInt(1);
        if (rTitle == 1) {
            MrLocator.click();
        } else {
            MrsLocator.click();
        }
    }

    public void enterFirstName() {
        firstNameLocator.sendKeys(retail_test_data.customer_firstname);
    }

    public void enterLastName() {
        lastNameLocator.sendKeys(retail_test_data.customer_lastname);
        }

    public void enterPassword() {
        pwLocator.sendKeys(retail_test_data.customer_password);
    }

    public void enterDoB() {
        Select day= new Select(dayLocator);
        day.selectByIndex(rnd.nextInt(29));

        Select month= new Select(monthLocator);
        month.selectByIndex(rnd.nextInt(11));

        Select year= new Select(yearLocator);
        year.selectByIndex(rnd.nextInt(113));

    }

    public void enterAddress(){
        addressLocator.sendKeys(retail_test_data.customer_address);
    }

    public void enterCity() {
        cityLocator.sendKeys(retail_test_data.customer_city);
    }

    public void enterState() {
        Select state= new Select(stateLocator);
        state.selectByIndex(rnd.nextInt(49));
    }

    public void enterZip() {
        zipLocator.sendKeys(retail_test_data.customer_zip);
    }

    public void enterCountry() {
        Select country= new Select(countryLocator);
        country.selectByValue("21");
    }

    public void enterPhoneNumber() {
        numberLocator.sendKeys(retail_test_data.customer_phoneNumber);
    }

    public void enterRegister() {
        registerLocator.click();
    }


    }
