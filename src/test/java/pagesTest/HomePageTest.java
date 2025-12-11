package pagesTest;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass{
	// The test executed based on alphabetical order, if no priority given for couple of tests
	// (enabled = true) means The test case is not disable, it can run
	// (enabled = false) means The test case is disable, it is not running
	// priority = 1 means, this test case will run first, 2 means second .... ... so on
	
	@Test (enabled = false, priority = 5)
	public void clickLogoTest() throws InterruptedException {
		homePage.clickLogo();
	}
	
	@Test (enabled = true, priority = 1)
	public void clickForgotUserIdTest() {
		homePage.clickForgotUserId();
	}
	
	@Test (enabled = false, priority = 2)
	public void clickUserIdTest() {
		homePage.clickUserId();
	}
	
	@Test (enabled = false, priority = 4)
	public void clickPasswordTest() {
		homePage.clickPassword();
	}
	
	@Test (enabled = true, priority = 3)
	public void clickNewUserRegistrationTest() {
		homePage.clickNewUserRegistration();
	}
	
	// This one will fail
	@Test
	public void clickFailedLogoTest() {
		homePage.clickWrongLogo();
	}
	// selector and locator same thing
	// org.openqa.selenium.InvalidSelectorException: Compound class names not permitted
	
	
	@Test
	public void clickUnlockTest() throws InterruptedException {
		homePage.clickUnlock();
	}
	
	@Test
	public void inputTextInUserIdFieldTest() {
		homePage.inputTextInUserIdField();
	}
	
	@Test
	public void clickIncorrectNewUserRegistrationTest() {
		homePage.clickIncorrectNewUserRegistration();
	}
	
	@Test
	public void use_of_linkText_as_locator_in_forgot_userId_hyperlink_test() {
		homePage.use_of_linkText_as_locator_in_forgot_userId_hyperlink();
	}
	
	@Test
	public void use_of_partialLinkText_as_locator_in_forgot_passowrd_hyperlink() {
		homePage.use_of_partialLinkText_as_locator_in_forgot_passowrd_hyperlink();
	}
	
	@Test
	public void getMethodsTest() {
		homePage.getMethods();
	}
	
	@Test
	public void inputTextInUserIdAndPasswordFieldThenClickIAgreeAndFinallyClickToTheLoginButtonTest() {
		homePage.inputTextInUserIdAndPasswordFieldThenClickIAgreeAndFinallyClickToTheLoginButton();
	}	
		
	@Test
	public void useOfByClassInLoginProcessTest() throws InterruptedException {
		homePage.useOfByClassInLoginProcess();
	}	
		
	
	
	
	
	

}