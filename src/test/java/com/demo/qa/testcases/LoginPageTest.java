package com.demo.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.demo.qa.base.TestBase;
import com.demo.qa.pages.LoginPage;
import com.demo.qa.pages.ProfilePage;
import com.demo.qa.util.TestUtil;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	ProfilePage profile;
	TestUtil testUtil;
	
	public LoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		testUtil = new TestUtil();
	  loginPage = new LoginPage();	
	}
	
	@Test(priority=1)
	public void loginPageTitleTest(){
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "ToolsQA");
	}
	
	@Test(priority=2)
	public void loginTest(){
		profile = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	

	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
