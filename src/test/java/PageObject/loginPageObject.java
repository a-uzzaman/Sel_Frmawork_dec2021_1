package PageObject;

import Base.setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class loginPageObject extends setup {

    public loginPageObject (WebDriver driver){
        PageFactory.initElements(driver, this);
        setup.driver = driver;
    }

    @FindBy(how= How.XPATH, using = "//input[@type ='text']")
    public WebElement usernameLocator;

    @FindBy(how= How.NAME, using = "password")
    public WebElement passwordLocator;

    @FindBy(how= How.XPATH, using = "//input[@type ='submit']")
    public WebElement loginLocator;

    @FindBy(how= How.CSS, using="#error_message > div > h5")
    public WebElement errorMessage;

    @FindBy(how= How.CSS, using="#wrap > div > div > div > a")
    public WebElement CreateAccountButton;

    public void enterUsername(){
        usernameLocator.sendKeys("TTCztFiu");

    }

    public void enterPassword(){
        passwordLocator.sendKeys("123456");

    }

    public void clickSubmit(){
        loginLocator.click();
    }
}
