/*
 * 
 * syamba Author
 */

package com.demo.qa.testcases;

import java.util.concurrent.TimeUnit;

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
	  driver.get(prop.getProperty("URL"));
	  loginPage = new LoginPage();	
	}
	
	@Test(priority=1)
	public void loginPageTitleTest(){
		String title = loginPage.validateLoginPageTitle();
		System.out.println(title);
		Assert.assertEquals(title, "DEMOQA");
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
