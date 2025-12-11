package baseUtil;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;

public class BaseClass {
	public WebDriver driver;
	public HomePage homePage;
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		// For Chrome Driver
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");		
		driver = new ChromeDriver();
		
		/*
		// For Firefox Driver
		// I download version 0.35.0
		System.getProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		driver = new FirefoxDriver();
		*/
		
		/*
		// For Edge Driver
		// check your version of edge and download accordingly
		// I download version 143.0.3650.66
		System.getProperty("webdriver.edge.driver","./driver/msedgedriver.exe");
		driver = new EdgeDriver();
		*/
		
		// We need to add the WebDriverManager dependency in the pom.xml file
		// When physical driver absent, or driver is not  working, because of version issue, then you can use WebDriverManager
		// WebDriverManager doesn't need any physical driver
		// From below line, the most updated version of browser will be initialized, when no version is mentioned	
		
		// WebDriverManager.chromedriver().setup();
		// driver = new ChromeDriver();
		
		// WebDriverManager.firefoxdriver().setup();
		// driver = new FirefoxDriver();
		
		// WebDriverManager.edgedriver().setup();
		// driver = new EdgeDriver();
		
		// Stable Version: 143.0.7499.42
		// older version sometimes used for stability of browser, sometime the request from the Authority
		// if you choose version, then it will use that specific version of driver
		// WebDriverManager.chromedriver().driverVersion("143.0.7499.42").setup();
		// driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://portal.cms.gov/portal/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		homePage = new HomePage(driver);
	}
	
	@AfterMethod
	public void tearUp() {
		driver.quit();
	}
	
	
	
}