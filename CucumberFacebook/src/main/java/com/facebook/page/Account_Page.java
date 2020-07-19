package com.facebook.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.facebook.generic.FacebookRoot;

public class Account_Page  extends FacebookRoot{
	//SelectingAnAccountOption
			@FindBy(xpath = "//div[@class='j83agx80 l9j0dhe7']//div[@class='oajrlxb2 tdjehn4e qu0x051f esr5mh6w e9989ue4 r7d6kgcz rq0escxv nhd2j8a9 j83agx80 p7hjln8o kvgmc6g5 cxmmr5t8 oygrvhab hcukyx3x jb3vyjys rz4wbd8a qt6c0cv9 a8nywdso i1ao9s8h esuyzwwr f1sip0of lzcic4wl l9j0dhe7 abiwlrkh p8dawk7l bp9cbjyn s45kfl79 emlxlaya bkmhp75w spb7xbtv rt8b4zig n8ej3o3l agehan2d sk4xxmp2 taijpn5t qypqp5cg q676j6op']")
			private WebElement accountOption;
			
			//SelectLogoutOption
			@FindBy(xpath = "//span[contains(text(),'Log Out')]\r\n" )
			private WebElement logout;
			
			public Account_Page(WebDriver driver) 
			{
				PageFactory.initElements(driver, this);
			}
			public void accountOption() 
			{
				accountOption.click();	
			}
			public void logout() 
			{
				logout.click();	 
			}
}
