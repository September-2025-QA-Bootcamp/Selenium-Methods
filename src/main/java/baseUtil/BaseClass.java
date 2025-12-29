package baseUtil;

import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.beust.jcommander.Parameter;

import common.CommonActions;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.ForgotUserId;
import pages.HomePage;
import utils.Configuration;
import static utils.IConstant.*;
import reports.ExtentReportManager;
import reports.TestManager;

public class BaseClass {
	public WebDriver driver;
	public HomePage homePage;
	Configuration configuration;
	public ForgotUserId forgotUserId;
	ExtentReports extentReports;
	ExtentTest extentTest;
	
	@BeforeSuite
	public void initialReporting() {
		extentReports = ExtentReportManager.initialReports();
	}
	
	@BeforeClass
	public void beforeClassSetUp() {
		configuration = new Configuration();
	}
	
	@BeforeMethod
	public void initialTest(Method method) {
		extentTest = TestManager.createTest(extentReports, method.getName());
		extentTest.assignCategory(method.getDeclaringClass().getName());
	} 
	

	@BeforeMethod	
	public void setUp() {		
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
	
	@AfterMethod
	public void afterEachTest(Method method, ITestResult result) {
		for(String group: result.getMethod().getGroups()) {
			extentTest.assignCategory(group);
		}		
		if(result.getStatus() == ITestResult.SUCCESS) {
			extentTest.log(Status.PASS, "Test PASSED");
		}else if(result.getStatus() == ITestResult.FAILURE) {
			extentTest.addScreenCaptureFromPath(CommonActions.getSreenShot(method.getName(), driver));
			extentTest.log(Status.FAIL, "Test FAILED");
		}else if(result.getStatus() == ITestResult.SKIP) {
			extentTest.log(Status.SKIP, "Test SKIPPED");
		}
	}
	
	@AfterSuite
	public void publishReport() {
		extentReports.flush();
	}
	
	
	
}