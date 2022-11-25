package com.demo.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.demo.qa.base.TestBase;
import com.demo.qa.pages.BookStore;
import com.demo.qa.pages.LoginPage;
import com.demo.qa.pages.ProfilePage;
import com.demo.qa.util.TestUtil;

public class ProfilePageTest extends TestBase{
	
	LoginPage loginPage;
	ProfilePage profilepage;
	BookStore clickOnBookStore;
	TestUtil testUtil;
	
	public ProfilePageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
	 driver.get("https://demoqa.com/login");
	 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	 loginPage = new LoginPage();
	 profilepage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void verifyprofileTitleTest(){
		String profilePageTitle = profilepage.verifyProfilePageTitle();
		Assert.assertEquals(profilePageTitle, "ToolsQA","Home page title not matched");
	}
	
	@Test(priority=2)
	public void verifyUserNameTest(){	
		Assert.assertTrue(profilepage.verifyCorrectUserName());
	}
	
	@Test(priority=3)
	public void verifyBookStoreLinkTest(){
		clickOnBookStore = profilepage.clickOnBookStore();
		
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
