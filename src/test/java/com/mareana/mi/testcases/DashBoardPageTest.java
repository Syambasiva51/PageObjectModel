package com.mareana.mi.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mareana.mi.base.TestBase;
import com.mareana.mi.pages.DashBoardPage;
import com.mareana.mi.pages.LoginPage;

public class DashBoardPageTest extends TestBase {

	LoginPage loginPage;
	DashBoardPage dashboard;
	

	public DashBoardPageTest(){
		super();
	}
	

	@BeforeMethod
	public void setUp() throws InterruptedException{
		initialization();
	  driver.get(prop.getProperty("URL"));
	  loginPage = new LoginPage();	
	  dashboard=loginPage.login(prop.getProperty("username"), prop.getProperty("password")); 
	}
	
	
	@Test(priority=1)
	public void validateDashboardPageTitleTest() throws InterruptedException{
		String title = dashboard.validateDashboardPageTitle();
		Assert.assertEquals(title, "MI");
		
	}
	
	@Test(priority=2)
	public void GenelogypageTest() throws InterruptedException{
		dashboard.HoveronSidebar();
		Thread.sleep(3000);
		dashboard.clickonGeonology();
		Thread.sleep(5000);
		
	}
	
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
}
