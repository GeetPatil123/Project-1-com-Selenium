package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;

    public void openBrowser(String baseUrl) {
        driver = new ChromeDriver();
        //launch the URL
        driver.get(baseUrl);
        //maximise the browser window
        driver.manage().window().maximize();
        //we give implicit wait to the driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    public void closeBrowser(){
        //closing all the instance of the browser
        driver.quit();
    }
}
