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
    public WebElement signInLocator;


}
