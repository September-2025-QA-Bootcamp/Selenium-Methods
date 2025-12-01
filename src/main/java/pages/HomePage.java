package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		// PageFactory class help to instantiate WebElements
		// Important interview question
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//em[@id='cms-homepage-header-logo-unauth' and @class='cms-icon cms-sprite-loggedout ms-3']")
	WebElement logo;
	
	// We didn't use it today, will do in next class
	@FindBy(xpath = "//input[@id='cms-login-userId']")
	WebElement userId;
	
	public void clickLogo() throws InterruptedException {
		logo.click();
		Thread.sleep(5000);
	}
	
	
	
	
	
	
	
	

}
