package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static common.CommonActions.*;

public class ForgotUserId {
	WebDriver driver;
	
	public ForgotUserId(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "User ID")
	WebElement forgotUserId;
	
	@FindBy(xpath = "//h1[text()='Forgot User ID']")
	WebElement forgotUserIdHeader;
	
	@FindBy(xpath = "//p[contains(text(), 'retrieve your User ID.')]")
	WebElement forgotUserIdSubHeader;
	
	@FindBy(xpath = "//p[@id='cms-allfields-req']")
	WebElement forgotUserIdOtherHeader;
	
	
	
	
	
	
	public void navigateToForgotUserIdPage() {
		pause(3000);
		clickElement(forgotUserId);
		pause(3000);
		validationOfHeader(forgotUserIdHeader, "Forgot User ID");
		validationOfSubHeader(forgotUserIdSubHeader, "Please enter the following information to retrieve your User ID.");
		validationOfOtherHeader(forgotUserIdOtherHeader, "All fields are required.");
		verifyTitle(driver, "CMS Enterprise Portal - Forgot User ID");
		verifyCurrentUrl(driver, "https://portal.cms.gov/portal/forgotuserid");
		pause(3000);		
	}

}
