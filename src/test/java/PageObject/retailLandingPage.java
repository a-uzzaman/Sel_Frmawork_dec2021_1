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
import java.util.stream.IntStream;

public class retailLandingPage extends setup {

    public retailLandingPage (WebDriver driver){
        PageFactory.initElements(driver, this);
        setup.driver = driver;
        Faker fkr=new Faker();
        retail_test_data rtd=new retail_test_data();


    }
    @FindBy(how= How.LINK_TEXT, using = "Sign in")
    public WebElement SignInLocator;

    @FindBy(how= How.ID, using = "email_create")
    public WebElement EmailLocator;

    @FindBy(how= How.NAME, using= "SubmitCreate")
    public WebElement CreateAnAcLocator;

    @FindBy(how= How.ID, using= "id_gender1")
    public WebElement MrLocator;

    @FindBy(how= How.ID, using= "id_gender2")
    public WebElement MrsLocator;

    @FindBy(how= How.NAME, using= "customer_firstname")
    public WebElement FNLocator;

    @FindBy(how= How.NAME, using= "customer_lastname")
    public WebElement LNLocator;

    @FindBy(how= How.NAME, using= "passwd")
    public WebElement pwLocator;

    @FindBy(how= How.XPATH, using = "//*[@id='days']")
    public WebElement dayLocator;

    @FindBy(how= How.XPATH, using = "//*[@id='months']")
    public WebElement monthLocator;

    @FindBy(how= How.XPATH, using = "//*[@id='years']")
    public WebElement yearLocator;

    @FindBy(how= How.NAME, using = "address1")
    public WebElement adLocator;

    @FindBy(how= How.NAME, using = "city")
    public WebElement cityLocator;

    @FindBy(how= How.XPATH, using = "//*[@id='id_state']")
    public WebElement stateLocator;

    @FindBy(how= How.NAME, using = "postcode")
    public WebElement zipLocator;

    @FindBy(how= How.XPATH, using = "//*[@id='id_country']")
    public WebElement countryLocator;

    @FindBy(how= How.NAME, using = "phone_mobile")
    public WebElement numberLocator;

    @FindBy(how= How.NAME, using= "submitAccount")
    public WebElement RegisterAccLocator;

    @FindBy(how= How.NAME, using= "alias")
    public WebElement AdAliasLocator;

    public void enterSignInButton(){
        SignInLocator.click();
    }

    public void enterEmail(){
        EmailLocator.sendKeys(retail_test_data.customer_email);
    }

    public void enterCreateAnAc(){
        CreateAnAcLocator.click();
    }

    public void enterTitle(){
        Random rand=new Random();
        int rTitle = rand.nextInt(1);
        if (rTitle==1){MrLocator.click();}
        else {MrsLocator.click();}

    }

    public void enterCFN(){
        FNLocator.sendKeys(retail_test_data.customer_firstname);
    }

    public void enterCLN(){
        LNLocator.sendKeys(retail_test_data.customer_lastname);
    }

    public void enterPasswd(){
        pwLocator.sendKeys(retail_test_data.customer_password);
    }

    public void enterDoB(){
        Random rand=new Random();
        int month=rand.nextInt(11);
        int day=rand.nextInt(30);
        int year=rand.nextInt(113);
        Select Month = new Select(monthLocator);
        Month.selectByIndex(month);

        Select Day = new Select(dayLocator);
        Day.selectByIndex(day);

        Select Year = new Select(yearLocator);
        Year.selectByIndex(year);
    }

    public void enterAd(){
        adLocator.sendKeys(retail_test_data.customer_address);
    }

    public void enterCity(){
        cityLocator.sendKeys(retail_test_data.customer_city);
    }

    public void enterState(){
        Random rand=new Random();
        int State=rand.nextInt(49);
        Select state=new Select(stateLocator);
       state.selectByIndex(State);
    }

    public void enterZip(){
        zipLocator.sendKeys(retail_test_data.customer_zip);
    }
    public void enterCountry(){
        Select country=new Select(countryLocator);
        country.selectByValue("21");
    }
    public void enterPhone(){
        numberLocator.sendKeys(retail_test_data.customer_phone);
    }
    public void enterRegister(){
        RegisterAccLocator.click();
    }

    public void enterAdAlias() {
        AdAliasLocator.sendKeys("Test");
    }










}
