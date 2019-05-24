package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BrowserDriver {
    public static WebDriver driver = null;

    @BeforeMethod
    public void setUp(){
System.setProperty("webdriver.chrome.driver", "/Users/Saif/Desktop/automationFramework/AutomationFramework1901/Generic/driver/chromedriver");

driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
 driver.manage().window().fullscreen();
driver.get("http://automationpractice.com/index.php");
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();

    }
}
