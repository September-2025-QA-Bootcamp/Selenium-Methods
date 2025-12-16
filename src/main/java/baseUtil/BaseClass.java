package baseUtil;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.ForgotUserId;
import pages.HomePage;
import utils.Configuration;
import static utils.IConstant.*;

public class BaseClass {
	public WebDriver driver;
	public HomePage homePage;
	Configuration configuration;
	public ForgotUserId forgotUserId;
	
	@BeforeMethod
	public void setUp() {
		configuration = new Configuration();
		initDriver();				
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();		
		driver.get(configuration.getProperties(URL));		
		// How can we convert a String to Long type: Long.parseLong(String)
		long pageLoadTimeout = Long.parseLong(configuration.getProperties(PAGELOAD_WAIT));
		long implictlyWait = Long.parseLong(configuration.getProperties(IMPLICITLY_WAIT));		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pageLoadTimeout));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implictlyWait));
		initClass();
	}
	
	public void initDriver() {
		String browserName = configuration.getProperties(BROWSER);
		
		switch (browserName) {
		
		case CHROME:
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");		
			driver = new ChromeDriver();
			break;
			
		case FIREFOX:
			System.getProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
			driver = new FirefoxDriver();
			break;
			
		case EDGE:
			System.getProperty("webdriver.edge.driver","./driver/msedgedriver.exe");
			driver = new EdgeDriver();
			break;
			
		default:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		}
	}
	
	public void initClass() {
		homePage = new HomePage(driver);
		forgotUserId = new ForgotUserId(driver);
	}
	
	@AfterMethod
	public void tearUp() {
		driver.quit();
	}
	
	// 1. create config.properties file in src/main/resources
	// 2. create utils package
	// 3. Inside utils package, create enum Constant, Interface IConstant, Configuration class
	// 4. Bring changes in Base class
	// 5. static import is necessary ---> import static utils.IConstant.*	
	
	
	
}