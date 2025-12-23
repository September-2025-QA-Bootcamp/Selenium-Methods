package pagesTest;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class ForgotUserIdTest extends BaseClass{
	
	@Test
	public void navigateToForgotUserIdPageTest() {
		forgotUserId.navigateToForgotUserIdPage();
	}
	
	@Test
	public void use_of_dropdown_with_selectByValue_method_test() {
		forgotUserId.navigateToForgotUserIdPage();
		forgotUserId.use_of_dropdown_with_selectByValue_method();
	}
	
	@Test
	public void use_of_dropdown_with_selectByIndex_method_test() {
		forgotUserId.navigateToForgotUserIdPage();
		forgotUserId.use_of_dropdown_with_selectByIndex_method();
	}
	
	@Test
	public void use_of_dropdown_selectByVisibleText_method_test() {
		forgotUserId.navigateToForgotUserIdPage();
		forgotUserId.use_of_dropdown_selectByVisibleText_method();
	}
	
	@Test
	public void verify_forgot_userId_test() {
		forgotUserId.navigateToForgotUserIdPage();
		forgotUserId.verify_forgot_userId();
	}
	
	
	
	
	

}
