package pagesTest;

import java.awt.AWTException;

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
	public void use_of_partialLinkText_as_locator_in_forgot_passowrd_hyperlink_test() {
		homePage.use_of_partialLinkText_as_locator_in_forgot_passowrd_hyperlink();
	}
	
	@Test
	public void inputTextInUserIdAndPasswordFieldThenClickIAgreeAndFinallyClickToTheLoginButtonTest() {
		homePage.inputTextInUserIdAndPasswordFieldThenClickIAgreeAndFinallyClickToTheLoginButton();
	}	
		
	@Test
	public void useOfByClassInLoginProcessTest() throws InterruptedException {
		homePage.useOfByClassInLoginProcess();
	}	
		
	@Test
	public void why_we_use_cssSelector_as_locator_in_logo_test () {
		homePage.why_we_use_cssSelector_as_locator_in_logo();
	}
	
	@Test
	public void rule1a_use_of_cssSelector_by_class_name_value_test () {
		homePage.rule1a_use_of_cssSelector_by_class_name_value();
	}
	
	@Test
	public void rule1b_use_of_cssSelector_by_class_name_value_test () {
		homePage.rule1b_use_of_cssSelector_by_class_name_value();
	}
	
	@Test
	public void rule2a_use_of_cssSelector_by_id_value_test() {
		homePage.rule2a_use_of_cssSelector_by_id_value();
	}
	
	@Test
	public void rule2b_use_of_cssSelector_by_id_value_test() {
		homePage.rule2b_use_of_cssSelector_by_id_value();
	}
	
	@Test
	public void rule3_use_of_cssSelector_by_compund_class_name_value_test () {
		homePage.rule3_use_of_cssSelector_by_compund_class_name_value();
	}
	
	@Test
	public void rule4_use_of_cssSelector_by_attribute_and_its_value_test () {
		homePage.rule4_use_of_cssSelector_by_attribute_and_its_value();
	}	
	
	@Test
	public void rule5_use_of_cssSelector_by_class_name_value_and_attribute_and_its_value_test() {
		homePage.rule5_use_of_cssSelector_by_class_name_value_and_attribute_and_its_value();
	}
	
	@Test
	public void rule6_use_of_cssSelector_by_id_value_and_attribute_and_its_value_test() {
		homePage.rule6_use_of_cssSelector_by_id_value_and_attribute_and_its_value();
	}	
	
	@Test
	public void rule7_use_of_cssSelector_by_compund_class_name_value_and_attribute_and_its_value_test() {
		homePage.rule7_use_of_cssSelector_by_compund_class_name_value_and_attribute_and_its_value();
	}
	
	@Test
	public void use_of_tagName_as_locator_test() {
		homePage.use_of_tagName_as_locator();
	}
	
	@Test
	public void use_of_isDisplayed_01_test() {
		homePage.use_of_isDisplayed_01();
	}
	
	@Test
	public void use_of_isDisplayed_02_test() {
		homePage.use_of_isDisplayed_02();
	}
	
	@Test
	public void use_of_isDisplayed_in_login_test () {
		homePage.use_of_isDisplayed_in_login();
	}
	
	@Test
	public void use_of_isSelected_in_login_test() {
		homePage.use_of_isSelected_in_login();
	}
	
	@Test
	public void use_of_isEnabled_in_login_test() {
		homePage.use_of_isEnabled_in_login();
	}
	
	@Test
	public void getMethodsTest() {
		homePage.getMethods();
	}
	
	@Test
	public void newUserRegistrationPageValidationTest() {
		homePage.newUserRegistrationPageValidation();
	}
	
	@Test
	public void use_of_getAttribute_method_test () {
		homePage.use_of_getAttribute_method();
	}
	
	@Test
	public void use_of_clear_in_login_test() {
		homePage.use_of_clear_in_login();
	}
	
	@Test
	public void use_of_navigate_method_test () {
		homePage.use_of_navigate_method();
	}
	
	@Test
	public void use_of_mouse_hoverAction_on_ourLocations_test () {
		homePage.use_of_mouse_hoverAction_on_ourLocations();
	}
	
	@Test
	public void switch_between_window_test() {
		homePage.switch_between_window();
	}
	
	@Test
	public void use_of_sendKeys_method_then_click_by_enter_key_of_the_laptop_01_test () {
		homePage.use_of_sendKeys_method_then_click_by_enter_key_of_the_laptop_01();
	}
	
	@Test
	public void use_of_sendKeys_method_then_click_by_enter_key_of_the_laptop_02_test () {
		homePage.use_of_sendKeys_method_then_click_by_enter_key_of_the_laptop_02();
	}
	
	@Test
	public void use_of_sendKeys_method_then_click_by_return_key_of_the_laptop_test () {
		homePage.use_of_sendKeys_method_then_click_by_return_key_of_the_laptop();
	}
	
	@Test
	public void use_of_sendKeys_method_then_click_by_tab_key_of_the_laptop () {
		homePage.use_of_sendKeys_method_then_click_by_tab_key_of_the_laptop();
	}
	
	@Test
	public void alternate_of_click_method_test() {
		homePage.alternate_of_click_method();
	}
	
	@Test
	public void alternate_of_send_keys_method_test() {
		homePage.alternate_of_send_keys_method();
	}
	
	@Test
	public void login_process_by_JavascriptExecutor_common_method_test (){
		homePage.login_process_by_JavascriptExecutor_common_method();
	}
	
	@Test
	public void how_to_handle_hidden_element_by_regular_selenium_method_test () {
		homePage.how_to_handle_hidden_element_by_regular_selenium_method();
	}
	
	@Test
	public void how_to_handle_hidden_element_by_javascriptExecutor_test() {
		homePage.how_to_handle_hidden_element_by_javascriptExecutor();
	}
	
	@Test
	public void use_of_scroll_down_and_up_by_actions_class_test () {
		homePage.use_of_scroll_down_and_up_by_actions_class();
	}
	
	@Test
	public void use_of_scroll_down_and_scroll_up_by_robot_class_test () throws InterruptedException, AWTException {
		homePage.use_of_scroll_down_and_scroll_up_by_robot_class();
	}
	
	@Test
	public void use_of_scroll_down_and_up_In_A_Certain_Pixel_by_javascriptExecutor_test () {
		homePage.use_of_scroll_down_and_up_In_A_Certain_Pixel_by_javascriptExecutor();
	}
	
	@Test
	public void scroll_into_view_the_element_test() {
		homePage.scroll_into_view_the_element();		
	}
	
	@Test
	public void scroll_into_view_the_element_by_commonActions_test() {
		homePage.scroll_into_view_the_element_by_commonActions();
	}
	
	@Test
	public void photoOrImageUpload() {
		homePage.photoOrImageUpload();
	}
	
	@Test
	public void photoIdUpload_common_action_test() {
		homePage.photoIdUpload_common_action();
	}
		
	@Test
	public void web_based_alert_accept_test () {
		homePage.web_based_alert_accept();
	}
	
	@Test
	public void web_based_alert_dismiss_test () {
		homePage.web_based_alert_dismiss();
	}
	
	@Test
	public void authentication_pop_up (){
		homePage.authentication_pop_up();
	}
	
	@Test
	public void use_of_getAttribute_method_02_test () {
		homePage.use_of_getAttribute_method_02();
	}
	
	@Test
	public void first_name_validation_test() {
		homePage.first_name_validation();
	}
	
	
	
	

}