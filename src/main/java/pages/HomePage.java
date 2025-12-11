package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

// new, you have to manually write it to get access of common actions
// this is possible when they are static in nature, * means all
// This is called static import
import static common.CommonActions.*;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		// If there is no PageFactory class, WebElement will show NullPointerException
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//em[@id='cms-homepage-header-logo-unauth' and @class='cms-icon cms-sprite-loggedout ms-3']")
	WebElement logo;
	
	// 1st way: Most common way to write the WebElement (@FindBy),
	// you must know how to do that, 98% cases, this is used
	// Use of unique 'Id' attribute as locator
	@FindBy(id = "cms-forgot-userid")
	WebElement forgotUserId;
	
	// Use of unique 'name' attribute as locator
	@FindBy(name = "user-d")
	WebElement userId;
	
	// 2nd way to create a WebElement: not common, here I used for the 'password'
	// Just to make you guys familiar, if you see in your job
	@FindBy(how = How.NAME, using = "pass-d")
	WebElement password;
	
	// Use of unique  'class' attribute as locator
	// FYI: Never take a class value as unique if they have white space between words. 
	// Example: class value of logo, this is unique, but a compound class --> "cms-icon cms-sprite-loggedout ms-3"
	@FindBy(className = "cms-newuser-reg")
	WebElement newUserRegistration;
	
	// If this below webelement is open, next test caases failed
	//@FindBy(className = "cms-icon cms-sprite-loggedout ms-3")
	//WebElement wrongLogo;
	
	// 3rd way to create a WebElement with "By" Class: 
	// Not common, here I used "unlock" web element from the home page
	// instead of xpath, we can use id, name, class etc as locator.
	// By unlock = By.id("cms-unlock-account");
	By unlock = By.xpath("//a[@id='cms-unlock-account']");
	
	@FindBy(className = "aaaacms-newuser-reg")
	WebElement incorrectNewUserRegistration;
	
	// The text which is linked to an external source is LinkText
	// Use of 'linkText' attribute as locator
	@FindBy(linkText = "User ID")
	WebElement forgotUserIdElement;
	
	// Use of 'partialLinkText' attribute as locator 
	@FindBy(partialLinkText = "Pass")
	WebElement forgotPassword;
	
	@FindBy(xpath = "//label[@id='cms-label-tc']")
	WebElement termsAndCondition;
	
	@FindBy(id = "cms-login-submit")
	WebElement login;
	
	// We used throws InterruptedException to handle the exception
	public void clickLogo() throws InterruptedException {
		// common method 'clickElement()' is not used here
		// common method 'pause()' is not used here
		logo.click();
		Thread.sleep(5000);
	}
	
	public void clickForgotUserId() {
		clickElement(forgotUserId);
	}
	
	// We used try-catch block to handle exception [Thread.sleep()] in this method
	public void clickUserId() {
		// common method 'pause()' is not used here
		try {
			Thread.sleep(4000);
			// common method 'clickElement()' is used here
			clickElement(userId);
			System.out.println("Second");
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
	}
	
	public void clickPassword() {
		// common method 'clickElement()' is used here
		clickElement(password);
		// common method 'pause()' is used here
		pause(4000);
	}
	
	public void clickNewUserRegistration() {
		clickElement(newUserRegistration);
		pause(4000);
	}
	
	public void clickWrongLogo() {
		//wrongLogo.click();
	}
	
	// Not common, just for your reference
	public void clickUnlock() throws InterruptedException {
		driver.findElement(unlock).click();
		Thread.sleep(4000);
	}
	
	// We are using sendKeys() method to input the text in userId field
	public void inputTextInUserIdField() {
		try {
			Thread.sleep(5000);
			// common method 'inputText()' is not used here
			userId.sendKeys("September 2025 Batch");
			Thread.sleep(5000);
			password.sendKeys("Hakuna Mata");
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	// How to test implicitlyWait()? or
	// How to show the exception: NoSuchElementException
	
	public void clickIncorrectNewUserRegistration() {
		clickElement(incorrectNewUserRegistration);
	}
	
	// Important: Use of linkText as unique locator
	// Web Element: forgot userId
	public void use_of_linkText_as_locator_in_forgot_userId_hyperlink() {
		try {
			Thread.sleep(5000);
			clickElement(forgotUserIdElement);
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	// Important: Use of partial linkText as locator
	// Web Element: forgot password
	public void use_of_partialLinkText_as_locator_in_forgot_passowrd_hyperlink() {
		try {
			Thread.sleep(5000);
			clickElement(forgotPassword);
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void getMethods() {
		// getTitle() provide us the title of the page
		String actual = driver.getTitle();
		System.out.println("Title of the Page: " + actual);
		
		// getCurrentUrl() provide us the current URL of the page
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL: " + currentUrl);
		
		// getText() provide us the text of the WebElement
		 String nur = newUserRegistration.getText();
		 System.out.println("The text present in the web element is: " + nur);
	}
	
	// We are using 3 common actions here -- click(), pause(), inputText()
	public void inputTextInUserIdAndPasswordFieldThenClickIAgreeAndFinallyClickToTheLoginButton() {
		pause(3000);
		// common method 'inputText()' is used here
		inputText(userId, "enthrall_12");
		pause(3000);
		inputText(password, "Nabeeha19@12345678");
		pause(3000);
		clickElement(termsAndCondition);
		pause(3000);
		clickElement(login);
		pause(3000);
	}
	
	// Alternate of above method {Raw Code, some people like to use this way}
	// We can use a web element directly in the method, that is also common
	// we don't need to create "webElement" and "common method"
	public void useOfByClassInLoginProcess() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.name("user-d")).sendKeys("enthrall_12");
		driver.findElement(By.name("pass-d")).sendKeys("Nabeeha19@12345678");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//label[@id='cms-label-tc']")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("cms-login-submit")).click();
		Thread.sleep(4000);
	}
	
	
	
	
	
	

}