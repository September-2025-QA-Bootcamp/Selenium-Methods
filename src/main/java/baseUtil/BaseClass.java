package baseUtil;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.HomePage;

public class BaseClass {
	public WebDriver driver;
	public HomePage homePage;
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		// 1st way, to show the location of chrome driver
		// This is an absolute path
		// System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tofael\\eclipse-workspace\\gov.cms.portal.sep2025\\driver\\chromedriver.exe");
		
		// 2nd way, to show the location of the chrome driver
		// This is a dynamic way (relative path)
		// user.dir means --> System set the property to User Directory, here - it is till the project
		// System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/driver/chromedriver.exe");
		
		// 3rd and final way, to show the location of chrome driver
		// This is a dynamic path (relative path)
		// I will use this one, till end of the course
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		driver = new ChromeDriver();
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