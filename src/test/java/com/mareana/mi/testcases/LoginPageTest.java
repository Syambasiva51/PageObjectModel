/*
 * 
 * syamba Author
 */

package com.mareana.mi.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mareana.mi.base.TestBase;
import com.mareana.mi.pages.LoginPage;
import com.mareana.mi.pages.DashBoardPage;
import com.mareana.mi.util.TestUtil;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	DashBoardPage dashboard;
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
	public void loginPageTitleTest() throws InterruptedException{
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "MI");
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
