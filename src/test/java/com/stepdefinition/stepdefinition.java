package com.stepdefinition;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import com.Nykaamini.base.BaseClass;
import com.Nykaamini.pom.PageobjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdefinition extends BaseClass {
	
	PageobjectManager pom = new PageobjectManager(driver);
	
	@Given("Launch the browser")
	public void launch_the_browser() {
	    launchurl("https://www.nykaa.com/");
	    throw new io.cucumber.java.PendingException();
	}
	@Given("User see the momandbaby tab")
	public void user_see_the_momandbaby_tab() {
	    System.out.println("mom and baby tab");
	    throw new io.cucumber.java.PendingException();
	}
	@When("User use the mouseoveraction to move to mom and baby tab.")
	public void user_use_the_mouseoveraction_to_move_to_mom_and_baby_tab() throws InterruptedException {
		Thread.sleep(2000);
	    Mouseactionmovetoelement(pom.getHp().getMombaby());
	    throw new io.cucumber.java.PendingException();
	}
	@When("User click on the baby powder")
	public void user_click_on_the_baby_powder() {
	    clickonelement(pom.getHp().getBabypowder());
	    throw new io.cucumber.java.PendingException();
	}
	@Then("User in the baby powder window.")
	public void user_in_the_baby_powder_window() {
	    System.out.println("User in the baby powder window");
	    throw new io.cucumber.java.PendingException();
	}
	
	@Given("User in the baby powder tab")
	public void user_in_the_baby_powder_tab() {
	    System.out.println("User in the baby powder window");
	    throw new io.cucumber.java.PendingException();
	}
	@When("User want to switch to another window")
	public void user_want_to_switch_to_another_window() {
	    Set <String> all_id = driver.getWindowHandles();
	    Iterator <String> itr = all_id.iterator();
	    itr.next();
	    String Nextwindow = itr.next();
	    windowshandle(Nextwindow);
	    throw new io.cucumber.java.PendingException();
	}
	@When("User want to scroll the page with JavaScriptExecutor")
	public void user_want_to_scroll_the_page_with_java_script_executor() {
	    executeJavaScript("window.scrollby(0,500);");
	    throw new io.cucumber.java.PendingException();
	}
	@When("User want to click the babypowder product")
	public void user_want_to_click_the_babypowder_product() {
	    clickonelement(pom.getBs().getBabypowderclick());
	    throw new io.cucumber.java.PendingException();
	}
	@When("User want to switch to another tab")
	public void user_want_to_switch_to_another_tab() {
	    Set <String> all_ids = driver.getWindowHandles();
	    Iterator<String> itr1 = all_ids.iterator();
	    itr1.next();
	    itr1.next();
	    String Nextwindow1 = itr1.next();
	    windowshandle(Nextwindow1);
	    throw new io.cucumber.java.PendingException();
	}
	@When("User click on the dropdown and change its quantity")
	public void user_click_on_the_dropdown_and_change_its_quantity() {
	    dropdown(pom.getAdd_to_cart().getDropdown(),"index","1");
	    throw new io.cucumber.java.PendingException();
	}
	@Then("User the quantity value must be changed")
	public void user_the_quantity_value_must_be_changed() {
	    System.out.println("User the quantity value is changed");
	    throw new io.cucumber.java.PendingException();
	}
	
	@Given("Now User need to click on the add to bag button")
	public void now_user_need_to_click_on_the_add_to_cart_button() {
		clickonelement(pom.getAdd_to_cart().getAddtobag());
	    throw new io.cucumber.java.PendingException();
	}
	@When("User click the cart button")
	public void user_click_the_cart_button() throws InterruptedException {
	    Thread.sleep(3000);
	    clickonelement(pom.getAdd_to_cart().getCart());
	    throw new io.cucumber.java.PendingException();
	}
	@When("User want to switch to another frame")
	public void user_want_to_switch_to_another_frame() {
	    elementss(pom.getAdd_to_cart().getFrame1());
	    throw new io.cucumber.java.PendingException();
	}
	@When("User want to click on the quantity")
	public void user_want_to_click_on_the_quantity() throws InterruptedException {
	    Thread.sleep(2000);
	    clickonelement(pom.getAdd_to_cart().getQuantity());
	    throw new io.cucumber.java.PendingException();
	}
	@When("User want to change the quantity")
	public void user_want_to_change_the_quantity() {
	    clickonelement(pom.getAdd_to_cart().getQuantityc());
	    throw new io.cucumber.java.PendingException();
	}
	@When("User want to click on the proceed button")
	public void user_want_to_click_on_the_proceed_button() {
	    clickonelement(pom.getAdd_to_cart().getProceed());
	    throw new io.cucumber.java.PendingException();
	}
	@Then("User want to reach the login page after clicking proceed button")
	public void user_want_to_reach_the_login_page_after_clicking_proceed_button() {
	    System.out.println("user reaches the login option page");
	    throw new io.cucumber.java.PendingException();
	}
	
	@Given("now User need to click on the login button")
	public void now_user_need_to_click_on_the_login_button() throws InterruptedException {
	    Thread.sleep(4000);
	    throw new io.cucumber.java.PendingException();
	}
	@When("User click on the login button")
	public void user_click_on_the_login_button() {
	    clickonelement(pom.getAdd_to_cart().getLogin());
	    throw new io.cucumber.java.PendingException();
	}
	@When("Google is clicked")
	public void google_is_clicked() {
	    clickonelement(pom.getAdd_to_cart().getGoogle());
	    throw new io.cucumber.java.PendingException();
	}
	@When("In email User enter the gmail mailid")
	public void in_email_user_enter_the_gmail_mailid() {
	    Sendkeys(pom.getAdd_to_cart().getGmail(), "naveenr28706@gmail.com");
	    throw new io.cucumber.java.PendingException();
	}
	@When("User click next")
	public void user_click_next() {
	    clickonelement(pom.getAdd_to_cart().getNextbutton());
	    throw new io.cucumber.java.PendingException();
	}
	@When("User enter password in password tab")
	public void user_enter_password_in_password_tab() throws InterruptedException {
	    Thread.sleep(2000);
	    Sendkeys(pom.getAdd_to_cart().getPassword(), "Naveen@1234567890");
	    throw new io.cucumber.java.PendingException();
	}
	@Then("the account is logged in")
	public void the_account_is_logged_in() throws AWTException {
	    Robott();
	    implicitwait();
	    throw new io.cucumber.java.PendingException();
	}
	
	@Given("now User want to click the deliver here button")
	public void now_user_want_to_click_the_deliver_here_button() {
	    System.out.println("User wants to click the delivery button");
	    throw new io.cucumber.java.PendingException();
	}
	@When("User click on the deliver here button")
	public void user_click_on_the_deliver_here_button() {
	    Mouseactionclick(pom.getAdd_to_cart().getDeliverb());
	    throw new io.cucumber.java.PendingException();
	}
	@When("User next click on the upi option")
	public void user_next_click_on_the_upi_option() throws InterruptedException {
		Thread.sleep(4000);
	    clickonelement(pom.getAdd_to_cart().getUpi());
	    throw new io.cucumber.java.PendingException();
	}
	@When("User click on other upi option")
	public void user_click_on_other_upi_option() {
	    clickonelement(pom.getAdd_to_cart().getOtherupi());
	    throw new io.cucumber.java.PendingException();
	}
	@When("User enter upi credentials")
	public void user_enter_upi_credentials() {
	    Sendkeys(pom.getAdd_to_cart().getUppiidenter(), "anything@payu");
	    throw new io.cucumber.java.PendingException();
	}
	@When("User click the pay amount button")
	public void user_click_the_pay_amount_button() {
	    clickonelement(pom.getAdd_to_cart().getButtonpay());
	    throw new io.cucumber.java.PendingException();
	}
	@When("User take the screenshot of the failed payment")
	public void user_take_the_screenshot_of_the_failed_payment() throws InterruptedException, IOException {
	    Thread.sleep(4000);
	    screenshot("errorpage");
	    throw new io.cucumber.java.PendingException();
	}
	@When("User want to click the close button of the payment failed popup")
	public void user_want_to_click_the_close_button_of_the_payment_failed_popup() throws InterruptedException {
	    Thread.sleep(9000);
	    clickonelement(pom.getAdd_to_cart().getCloseb());
	    throw new io.cucumber.java.PendingException();
	}
	@Then("the payment failed tab is closed")
	public void the_payment_failed_tab_is_closed() {
	    System.out.println("user payment failed window is closed");
	    throw new io.cucumber.java.PendingException();
	}
	
	@Given("To edit and delete the items from the cart")
	public void to_edit_and_delete_the_items_from_the_cart() {
	    System.out.println("To edit and delete items from the cart");
	    throw new io.cucumber.java.PendingException();
	}
	@When("To click on the Bag button on the right side in payments tab.")
	public void to_click_on_the_bag_button_on_the_right_side_in_payments_tab() {
	    clickonelement(pom.getAdd_to_cart().getBagc());
	    throw new io.cucumber.java.PendingException();
	}
	@When("To click on the edit button")
	public void to_click_on_the_edit_button() {
	    clickonelement(pom.getAdd_to_cart().getEditc());
	    throw new io.cucumber.java.PendingException();
	}
	@When("to click on the Delete garbage icon")
	public void to_click_on_the_delete_garbage_icon() {
	    clickonelement(pom.getAdd_to_cart().getDeletec());
	    throw new io.cucumber.java.PendingException();
	}
	@When("to click on the remove button")
	public void to_click_on_the_remove_button() throws InterruptedException {
	    Thread.sleep(2000);
	    clickonelement(pom.getAdd_to_cart().getRemove());
	    throw new io.cucumber.java.PendingException();
	}
	@Then("The browser will be closed")
	public void the_browser_will_be_closed() throws InterruptedException {
	    Thread.sleep(2000);
	    driver.quit();
	    throw new io.cucumber.java.PendingException();
	}



	

	
	
	
	


	
	

	
	
	
	
	

}
