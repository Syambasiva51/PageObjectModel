package com.demo.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demo.qa.base.TestBase;

public class ProfilePage extends TestBase{

	@FindBy(xpath="//label[text()='Syambasiva']")
	WebElement UserName;
	
	@FindBy(xpath="//button[text()='Go To Book Store']")
	WebElement GotoStoreLink;
	
	
	public ProfilePage(){
		PageFactory.initElements(driver, this);
	}
	
	
	public String verifyProfilePageTitle(){
		return driver.getTitle();
	}
	
	public boolean verifyCorrectUserName(){
		return UserName.isDisplayed();
	}
	
	public BookStore clickOnBookStore(){
		GotoStoreLink.click();
		return new BookStore();
	}
	
}
