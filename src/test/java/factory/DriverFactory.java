package factory;

import org.openqa.selenium.WebDriver;
//import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {
static WebDriver driver = null;
	
	public static WebDriver initializeBrowser(String browser) {
		System.out.println("******"+browser);
		if(browser.equals("chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
			
		}else if(browser.equals("firefox")) { 
			driver = new FirefoxDriver();
		}else if(browser.equals("safari")) { 
			driver = new SafariDriver();
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(CommonUtils.PAGE_LOAD_TIME));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(CommonUtils.IMPLICIT_WAIT_TIME));
		
		return getDriver();
		
	}
	
	public static WebDriver getDriver() {
		return driver;
		
	}

}