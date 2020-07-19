package com.facebook.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.facebook.generic.FacebookRoot;


public class Login_Page extends FacebookRoot
{
	
		
		//CheckingTheLogo
		@FindBy(xpath = "//u[contains(text(),'Facebook')]")
		private WebElement homeLogo;
		
		//EmailOrPhoneNumber
		@FindBy(id = "email")
		private WebElement emailOrPhone;
		
		//Password
		@FindBy(id = "pass")
		private WebElement password;
		
		//LoginButton
		@FindBy(css = "input[type*='submit']")
		private WebElement loginBtn;
		
		//Initialization
		public Login_Page(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
	
		public void homeTagName() {
			Assert.assertTrue(homeLogo.isDisplayed());
		}
		
		public void credentials(String enterUsername,String enterPassword )
		{
			emailOrPhone.sendKeys(enterUsername);
			password.sendKeys(enterPassword);
		}
		
		
		public void loginButton()
		{
			loginBtn.click();
		}		
}
