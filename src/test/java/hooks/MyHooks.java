package hooks;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.qa.util.ConfigReader;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MyHooks {
	WebDriver driver;

	@Before
	public void setup() {
		// ConfigReader configReader = new ConfigReader();
		Properties prop = new ConfigReader().initializeProperties();
//		System.out.println("browser Name: "+prop.getProperty("browser"));
		driver = DriverFactory.initializeBrowser(prop.getProperty("browser"));
		driver.get(prop.getProperty("url"));
		
//		WebDriverManager.chromedriver().setup();
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
//		driver = new ChromeDriver(options);
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.get("https://tutorialsninja.com/demo/");
	}

	@After
	public void tearDown() {
//	public void tearDown(Scenario scenario) {
//
//		String scenarioName = scenario.getName().replaceAll(" ", "_");
//
//		if (scenario.isFailed()) {
//
//			byte[] srcScreenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//			scenario.attach(srcScreenshot, "image/png", scenarioName);
//		}

		driver.quit();

	}
}