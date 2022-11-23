package com.demo.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demo.qa.base.TestBase;


public class BookStore extends TestBase{
	
	@FindBy(xpath="//div[text()='Author']")
	WebElement Authorbtn;
	
	@FindBy(xpath="//div[text()='Publisher']")
	WebElement Publisherbtn;
	
	public BookStore(){
		PageFactory.initElements(driver, this);
	}
	
	public String validateBookStorePageTitle(){
		return driver.getTitle();
	}
	
	public void clickOnAuthor(){
		Authorbtn.click();
	}
	
	public void clickOnPublisher(){
		Publisherbtn.click();
	}
	

	
	
	
	
	
	
	
}
