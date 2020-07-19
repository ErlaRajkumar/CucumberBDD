package runner;

import org.testng.annotations.Test;
import com.facebook.generic.FacebookRoot;
import com.facebook.generic.Facebook_DataReading;
import com.facebook.page.Account_Page;
import com.facebook.page.Home_Page;
import com.facebook.page.Login_Page;

import cucumber.api.CucumberOptions;
@Test
@CucumberOptions(features = "./src/test/java/feature", glue = { "stepDefinition"},dryRun = true,monochrome=true,
plugin= {"pretty","html:test-output"})
public class testRunner extends FacebookRoot{
	
	public void sendindTextMessage() throws InterruptedException {
		Login_Page login_Page = new Login_Page(driver);

		String enterUsername = Facebook_DataReading.getXLData(TEST_INPUT_DATA, "LoginCredentials", 1, 0);
		String enterPassword = Facebook_DataReading.getXLData(TEST_INPUT_DATA, "LoginCredentials", 1, 1);
		Thread.sleep(5000);
		login_Page.homeTagName();
		login_Page.credentials(enterUsername, enterPassword);
		login_Page.loginButton();
		Thread.sleep(5000);
		Home_Page home_Page = new Home_Page(driver);
		home_Page.selectingMessengerIcon();
		Thread.sleep(5000);
		home_Page.friend();
		Thread.sleep(3000);
		home_Page.sendingLikeSymbol();
		Thread.sleep(3000);
		home_Page.closingTab();
		Thread.sleep(5000);
		Account_Page account_Page = new Account_Page(driver);
		account_Page.accountOption();
		Thread.sleep(3000);
		account_Page.logout();
		
	}

	
}
