package com.demo.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.demo.qa.base.TestBase;
import com.demo.qa.pages.LoginPage;
import com.demo.qa.pages.Webtable_Datadriven;
import com.demo.qa.util.TestUtil;

public class Webtable_DatadrivenTest extends TestBase{
	String sheetName = "contacts";
	Webtable_Datadriven Webtable;
	public Webtable_DatadrivenTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
	driver.get("https://demoqa.com/webtables");
	 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	 Webtable = new Webtable_Datadriven();	
	}
	
	@DataProvider
	public Object[][] getCRMTestData(){
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}
	
	@Test(priority=1,dataProvider="getCRMTestData")
	public void clickOnAddData(String firstname,String lastname,String Email,String age1,String Salary1,String department){	
		Webtable.clickOnAddData();
		Webtable.EnterFirstname(firstname);
		Webtable.EnterLastname(lastname);
		Webtable.EnterUserEmail(Email);
		Webtable.EnterAge(age1);
		Webtable.EnterSalary(Salary1);
		Webtable.EnterDepartment(department);
		Webtable.clickSubmit();		
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
