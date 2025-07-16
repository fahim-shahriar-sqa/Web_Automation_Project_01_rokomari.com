package utilites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import java.time.Duration;

public class DriverSetup {
    private static String browser_name = System.getProperty("browser", "chrome");

    private static final ThreadLocal<WebDriver> DRIVER_THREAD_LOCAL = new ThreadLocal<>();

    public static void setDriver(WebDriver driver){
        DriverSetup.DRIVER_THREAD_LOCAL.set(driver);
    }
    public static WebDriver getDriver(){
        return DRIVER_THREAD_LOCAL.get();
    }
}
