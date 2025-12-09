package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
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
	
	
	public void clickLogo() throws InterruptedException {
		logo.click();
		Thread.sleep(5000);
	}
	
	public void clickForgotUserId() {
		forgotUserId.click();
		System.out.println("First");
	}
	
	public void clickUserId() {
		try {
			Thread.sleep(4000);
			userId.click();
			System.out.println("Second");
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
	}
	
	public void clickPassword() {
		password.click();
	}
	
	public void clickNewUserRegistration() {
		newUserRegistration.click();
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
		try {
			Thread.sleep(5000);
			incorrectNewUserRegistration.click();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	// Important: Use of linkText as unique locator
	// Web Element: forgot userId
	public void use_of_linkText_as_locator_in_forgot_userId_hyperlink() {
		try {
			Thread.sleep(5000);
			forgotUserIdElement.click();
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
			forgotPassword.click();
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
	
	
	
	
	
	

}
