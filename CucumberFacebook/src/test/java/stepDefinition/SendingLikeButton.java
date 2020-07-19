package stepDefinition;

import com.facebook.generic.FacebookRoot;
import com.facebook.generic.Facebook_DataReading;
import com.facebook.page.Account_Page;
import com.facebook.page.Home_Page;
import com.facebook.page.Login_Page;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SendingLikeButton extends FacebookRoot {

	FacebookRoot root;
	Login_Page login;
	Home_Page home;
	Account_Page account;

	@Given("^the Browser Is Launched and user enters the URL$")
	public void the_Browser_Is_Launched_and_user_enters_the_URL() throws Throwable {
		root = new FacebookRoot();
		root.setPro();
		root.openApp();
	}

	@When("^the user enters the valid  credentials mailid and password$")
	public void the_user_enters_the_valid_credentials_mailid_and_password() throws Throwable {
		login = new Login_Page(driver);
		String enterUsername = Facebook_DataReading.getXLData(TEST_INPUT_DATA, "LoginCredentials", 1, 0);
		String enterPassword = Facebook_DataReading.getXLData(TEST_INPUT_DATA, "LoginCredentials",1, 1);
		login.credentials(enterUsername, enterPassword);
	}

	@Then("^click on the login button$")
	public void click_on_the_login_button() throws Throwable {

		login.loginButton();
	}

	@Then("^facebook Homepage displayed$")
	public void facebook_Homepage_displayed() throws Throwable {

	}

	@Then("^the user select the messenger icon$")
	public void the_user_select_the_messenger_icon() throws Throwable {
		home = new Home_Page(driver);
		home.selectingMessengerIcon();
	}

	@Then("^select the friend$")
	public void select_the_friend() throws Throwable {
		home = new Home_Page(driver);
		home.friend();
	}

	@Then("^click on the like button$")
	public void click_on_the_like_button() throws Throwable {
		home = new Home_Page(driver);
		home.sendingLikeSymbol();
	}

	@Then("^close the tab$")
	public void close_the_tab() throws Throwable {
		home = new Home_Page(driver);
		home.closingTab();
	}

	@Then("^user select account option$")
	public void user_select_account_option() throws Throwable {
		account = new Account_Page(driver);
		account.accountOption();
	}

	@Then("^select logout option$")
	public void select_logout_option() throws Throwable {
		account = new Account_Page(driver);
		account.logout();
		root = new FacebookRoot();
		root.excelReport();
	}
}
