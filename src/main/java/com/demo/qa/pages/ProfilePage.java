package com.demo.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demo.qa.base.TestBase;

public class ProfilePage extends TestBase{

	@FindBy(xpath="//label[text()='Testuser12345']")
	WebElement UserName;
	
	@FindBy(xpath="//div[@class='mt-2 buttonWrap row']/div/button[@id='gotoStore']")
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
		JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("arguments[0].click();", GotoStoreLink);
		return new BookStore();
	}
	
}
