package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class setup {
    public static WebDriver driver;

    public static WebDriver setupBrowser(String driverType){

        if(driverType.equalsIgnoreCase("ch")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }else if (driverType.equalsIgnoreCase("ff")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }else if(driverType.equalsIgnoreCase("edge")){
            WebDriverManager.edgedriver();
            driver = new EdgeDriver();
        }
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


        return driver;
    }

}
