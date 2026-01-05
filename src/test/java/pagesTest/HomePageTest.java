package pagesTest;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
	
	@Test
	public void use_of_explicitly_wait_01_test() {
		homePage.use_of_explicitly_wait_01();
	}
	
	@Test
	public void use_of_explicitly_wait_02a_test() {
		homePage.use_of_explicitly_wait_02a();
	}
	
	@Test
	public void use_of_explicitly_wait_02b_test() {
		homePage.use_of_explicitly_wait_02b();
	}
	
	@Test
	public void use_of_explicitly_wait_03_test() {
		homePage.use_of_explicitly_wait_03();
	}
	
	@Test
	public void use_of_explicitly_wait_04_test() {
		homePage.use_of_explicitly_wait_04();
	}
	
	@Test
	public void use_of_explicitly_wait_05_test() {
		homePage.use_of_explicitly_wait_05();
	}
	
	@Test
	public void use_of_explicitly_wait_from_common_waits_test(){
		homePage.use_of_explicitly_wait_from_common_waits();
	}
	
	@Test
	public void mouse_hover_action_on_about_us_test() {
		homePage.mouse_hover_action_on_about_us();
	}
	
	@Test
	public void set_a_specific_size_for_window_test() {
		homePage.set_a_specific_size_for_window();
	}
	
	@Test
	public void use_of_right_click_action_test () {
		homePage.use_of_right_click_action();
	}
	
	@Test
	public void use_of_double_click_action() {
		homePage.use_of_double_click_action();
	}
	
	@Test
	public void use_of_drag_and_drop_action_test () {
		homePage.use_of_drag_and_drop_action();
	}
	
	@Test
	public void read_table () {
		homePage.read_table();
	}
	
	@Test
	public void read_any_row_of_the_table () {
		homePage.read_any_row_of_the_table();
	}
	
	@Test
	public void read_any_cell_of_a_row_of_the_table () {
		homePage.read_any_cell_of_a_row_of_the_table();
	}
	
	@Test(enabled = true, priority = 3, groups = {"functionalTest", "sanityTest", "smokeTest", "regressionTest"})
	public void getMethods02Test() {
		homePage.getMethods02();
	}
	
	@Test (enabled = true, priority = 1, groups = {"regressionTest"})
	public void getMethods03Test() {
		homePage.getMethods03();
	}
	
	@Test(enabled = true, priority = 2, groups = {"functionalTest", "sanityTest"})
	public void getMethods04Test() {
		homePage.getMethods04();
	}
	
	@Test
	public void use_of_expectedExceptions01Test () {
		homePage.use_of_expectedExceptions01();
	}
	
	@Test
	public void use_of_expectedExceptions02Test () {
		homePage.use_of_expectedExceptions02();
	}
	
	@Test
	public void use_of_expectedExceptions03Test () throws ArithmeticException {
		homePage.use_of_expectedExceptions03();
	}
	
	@Test (expectedExceptions = ArithmeticException.class)
	public void use_of_expectedExceptions04Test () {
		homePage.use_of_expectedExceptions04();
	}
	
	@Test (expectedExceptions = org.openqa.selenium.NoSuchElementException.class)
	public void use_of_expectedExceptions05Test () {
		homePage.use_of_expectedExceptions05();
	}
	
	@Test
	public void new_user_registration_button_enabled_01_test(){
		homePage.new_user_registration_button_enabled_01();
	}
	
	@Test
	public void new_user_registration_button_enabled_02_test(){
		homePage.new_user_registration_button_enabled_02();
	}
	
	@Test
	public void new_user_registration_button_enabled_03_test(){
		homePage.new_user_registration_button_enabled_03();
	}
	
	@Test
	public void new_user_registration_button_enabled_04_test(){
		homePage.new_user_registration_button_enabled_04();
	}
	
	// Important interview question
	// use of dependsOnMethods
	// change the new_user_registration_button_enabled method to fail [see disable method below]
	// and see the below method skipped as it depends on new_user_registration_button_disabled
	
	@Test
	public void new_user_registration_button_enabled_test(){
		homePage.new_user_registration_button_enabled();
	}
	
	@Test
	public void new_user_registration_button_disabled_test(){
		homePage.new_user_registration_button_disabled();
	}	
	
	// the depends method is the test method, not from home page, I made mistake
	@Test(dependsOnMethods = "new_user_registration_button_enabled_test")
	public void new_user_registration_button_click_test() {
		homePage.new_user_registration_button_click();
	}
	
	
	@Test (dependsOnMethods = "new_user_registration_button_disabled_test")
	public void new_user_registration_button_click_01_test() {
		homePage.new_user_registration_button_click();
	}
	
	@Test
	public void skipHomePageTitle01Test() {
		homePage.skipHomePageTitle01();
	}
	
	@Test
	public void skipHomePageTitle02Test() {
		homePage.skipHomePageTitle02();
	}
	
	// When we use invocation count? if you know some test cases fail for no reason
	// and then you fix it, you can run more than one time time by invocation count	
	// invocationCount = The invocationCount attribute tells how many times TestNG should run a test method
	// timeOut = The maximum number of milliseconds a test case should take.
	@Test (invocationCount = 5, timeOut = 10000)
	public void new_user_registration_button_enabled_05_test(){
		homePage.new_user_registration_button_enabled_05();
	}
	
	// use of threadPoolSize
	// Is the threadPoolSize working? No, because we need multiple thread in multiple device/computer connected
	// may be working as multi threaded, can't see locally with one computer
	// The threadPoolSize attribute tells it to form a thread pool to run the test method through multiple threads.
	@Test(invocationCount = 6, threadPoolSize = 3, timeOut = 10000)
	public void new_user_registration_button_enabled_06_test(){
		homePage.new_user_registration_button_enabled_06();
	}
	
	// Below we wrote the code directly in test cases, you will not find any code in HomePage
	// interview question: what are the alternative of click() method 
	// but they are not expecting first 2 answer, they are looking for javascriptExecutor
	// alternate of click()
	@Test
	public void alternate_of_click_method_in_loginButtonTest01() throws InterruptedException {
		driver.findElement(By.id("cms-login-submit")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	}
	

	// alternate of click()
	@Test
	public void alternate_of_click_method_in_loginButtonTest02() throws InterruptedException {
		driver.findElement(By.id("cms-login-submit")).sendKeys(Keys.RETURN);
		Thread.sleep(3000);
	}
	
	// Important interview question + they ask you to write the code in MS word
	// so, practice it by paper pen, then in ms word
	// alternate of click()
	@Test
	public void alternate_of_click_method_in_loginButtonTest03() throws InterruptedException {
		WebElement loginButton = driver.findElement(By.id("cms-login-submit"));
		JavascriptExecutor js = (JavascriptExecutor) driver; // We don't need it here
		// Because JavascriptExecutor Interface is instantiated in base class, js object came form there
		js.executeScript("arguments[0].click()", loginButton);
		// arguments[0] means, find the web element of index 0, first occurrence
		Thread.sleep(4000);
	}
	
	// alternate of click()
	// "arguments[0].click()" ---> above is easy to memorize, memorize it, if you want
	// follow the above one, because you can use any kind of locator 
	// (specially xpath is difficult to create by below one)
	// don't follow this one, but if you ever see it, i hope you can recognize it
	@Test
	public void alternate_of_click_method_in_loginButtonTest04() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('cms-login-submit').click();");
		Thread.sleep(4000);
	}
	
	// below is high level, so just see, don't take them seriously
	// alternative to click an web element in many ways (never memorize, a collection of code)
	
	// Not important
	
	// alternate of click()
	@Test
	public void homepageLoginButtonTest06() {
		WebElement homepageLoginButton = driver.findElement(By.xpath("//button[@id='cms-login-submit']"));
		Actions actions = new Actions(driver);
		actions.click(homepageLoginButton).perform();
	}
	
	// Not important
	// alternate of click()
	@Test
	public void homepageLoginButtonTest07() {
		WebElement homepageLoginButton = driver.findElement(By.xpath("//button[@id='cms-login-submit']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(homepageLoginButton).click().perform();
	}
	
	// Not important
	// alternate of click()
	@Test
	public void homepageLoginButtonTest08() {
		WebElement homepageLoginButton = driver.findElement(By.xpath("//button[@id='cms-login-submit']"));
		Actions actions = new Actions(driver);
		actions.clickAndHold(homepageLoginButton).release().perform();
	}
	
	// Not important
	// alternate of click()
	@Test
	public void homepageLoginButtonTest09() {
		WebElement homepageLoginButton = driver.findElement(By.xpath("//button[@id='cms-login-submit']"));
		Actions actions = new Actions(driver);
		actions.sendKeys(homepageLoginButton, Keys.RETURN).perform();
	}
	
	// Sets the amount of time to wait for an asynchronous script to finish execution before throwing an error. 
	// not important at all
	@Test(enabled = true)
	public void use_of_set_script_timeout_for_window() {
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(15));
		// scriptTimeout () method deprecated, so giving you warning, this method is going to be out from selenium
        // you use @SuppressWarnings("deprecation")
		driver.get("https://www.ebay.com");	
	}

}