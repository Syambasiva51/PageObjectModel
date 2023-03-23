package com.mareana.mi.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mareana.mi.base.TestBase;
import com.mareana.mi.pages.DashBoardPage;
import com.mareana.mi.pages.GenelogyPage;
import com.mareana.mi.pages.LoginPage;

public class GenelogyPageTest extends TestBase{
	
	LoginPage loginPage;
	DashBoardPage dashboard;
	GenelogyPage genelogy;
	
	public GenelogyPageTest(){
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
	public void GenelogyPageTest() throws InterruptedException{
		  //dashboard.HoveronSidebar();
		  //Thread.sleep(3000);
		  genelogy = dashboard.clickonGeonology();
		  //Thread.sleep(5000);
		  genelogy.SelectParameters(prop.getProperty("Plant_val"),prop.getProperty("Product_val"),prop.getProperty("Batch_val"));
		  Thread.sleep(2000);
		  
	}
	
	
	@AfterMethod
	public void tearDown(){
		
		
	}
	
	
}
