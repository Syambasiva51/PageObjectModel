package com.demo.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.demo.qa.base.TestBase;
import com.demo.qa.pages.LoginPage;
import com.demo.qa.pages.Webtable_Datadriven;
import com.demo.qa.util.TestUtil;

public class Webtable_DatadrivenTest extends TestBase{
	
	Webtable_Datadriven Webtable;
	public Webtable_DatadrivenTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
	driver.get("https://demoqa.com/webtables");
	//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	 Webtable = new Webtable_Datadriven();	
	}
	
	@Test(priority=1)
	public void clickOnAddData(){	
		Webtable.clickOnAddData();
		
	}
	

	


}
