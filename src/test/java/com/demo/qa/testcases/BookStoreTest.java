package com.demo.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.demo.qa.base.TestBase;
import com.demo.qa.pages.BookStore;
import com.demo.qa.pages.LoginPage;
import com.demo.qa.pages.ProfilePage;
import com.demo.qa.util.TestUtil;

public class BookStoreTest extends TestBase{
	
	LoginPage loginPage;
	ProfilePage profile;
	BookStore clickOnBookStore;
	
	public BookStoreTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
	driver.get("https://demoqa.com/login");
	  loginPage = new LoginPage();	
	  profile = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	  clickOnBookStore = profile.clickOnBookStore();
	}
	
	@Test(priority=1)
	public void validateBookStorePageTitle(){
		String BookStorePageTitle = clickOnBookStore.validateBookStorePageTitle();
		Assert.assertEquals(BookStorePageTitle, "ToolsQA","Home page title not matched");
	}
	
	@Test(priority=2)
	public void clickonAuthor(){	
		clickOnBookStore.clickOnAuthor();	
	}
	
	@Test(priority=3)
	public void clickonPublisher(){	
		clickOnBookStore.clickOnPublisher();
		
	}
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
