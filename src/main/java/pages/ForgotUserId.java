package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static common.CommonActions.*;

import java.util.List;

public class ForgotUserId {
	public WebDriver driver;
	public Select select;
	
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
	
	@FindBy(xpath = "//input[contains(@id, 'cms-forgotid-fi')]")
	WebElement firstName;
	
	@FindBy(xpath = "//input[@name='cms-forgotid-lastName']")
	WebElement lastName;
	
	@FindBy(xpath = "//select[@id='cms-forgotid-birthMonth']")
	WebElement birthMonth;
	
	@FindBy(xpath = "//select[@id='cms-forgotid-birthMonth']//option")
	List<WebElement> listOfBirthMonth;
	
	@FindBy(xpath = "//select[@name='cms-forgotid-birthDate']")
	WebElement birthDate;
	
	@FindBy(xpath = "//select[@id='cms-forgotid-birthYear']")
	WebElement birthYear;
	
	@FindBy(xpath = "//input[@id='cms-forgotid-forgotEmail']")
	WebElement email;
	
	@FindBy(xpath = "//input[@id='cms-forgotid-usZipCode']")
	WebElement zipCode;
	
	@FindBy(xpath = "//button[contains(text(), 'Su')]")
	WebElement submitButton;
	
	
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
	
	// drop down, by all 3 methods
	// drop down is a commonly asked important interview question
		
	// birth month
	// use method --> selectByValue()
	public void use_of_dropdown_with_selectByValue_method() {
		select = new Select(birthMonth);
		select.selectByValue("12"); // for choosing December, we took the value attribute of this month from option tag
		pause(3000);
	}
	
	// birth date
	// use method --> selectByIndex()
	// This method is not suggested, or not used much
	// Because, adding a new web element or deleting a new one can change the index number	
	public void use_of_dropdown_with_selectByIndex_method() {
		select = new Select(birthDate);
		select.selectByIndex(20); // for choosing 20, we took the index 20, here index 0 is [Select Birth date]
		pause(3000);
	}
	
	// birth year
	// drop down is a commonly asked interview question
	// Most commonly use method --> selectByVisibleText()
	public void use_of_dropdown_selectByVisibleText_method() {
		select = new Select(birthYear);
		select.selectByVisibleText("1975"); // inner text or html text
		pause(3000);
	}
	
	public void verify_forgot_userId() {
		inputText(firstName, "Mohammad");
		inputText(lastName, "Sharkar");
		pause(3000);
		selectElelementFromDropdownOnebyOne(birthMonth, listOfBirthMonth);
		pause(3000);
		selectDropdown(birthMonth, "December");
		pause(3000);
		selectDropdown(birthDate, "20");
		pause(3000);
		selectDropdown(birthYear, "1975");
		pause(3000);
		inputText(email, "tofael483@gmail.com");
		pause(3000);
		inputText(zipCode, "10019");
		pause(3000);
		elementEnabled(submitButton);
		verifyTextOfTheWebElement(submitButton, "Submit");
		clickElement(submitButton);
		pause(4000);
	}
	
	
	

}
