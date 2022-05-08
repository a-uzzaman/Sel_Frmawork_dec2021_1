package PageObject;

import Base.setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class retailLandingPage extends setup {

    public retailLandingPage (WebDriver driver){
        PageFactory.initElements(driver, this);
        setup.driver = driver;
    }
    @FindBy(how= How.LINK_TEXT, using = "Sign in")
    public WebElement SignInLocator;

    @FindBy(how= How.ID, using = "email_create")
    public WebElement emaillocator;

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

    @FindBy(how= How.NAME, using = "city")
    public WebElement cityLocator;








}
