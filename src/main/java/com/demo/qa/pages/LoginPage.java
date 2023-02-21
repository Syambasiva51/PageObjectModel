package com.demo.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demo.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	//declaration
	@FindBy(id="userName")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath="//button[@id='login']")
	WebElement loginBtn;
	
	
	//Initilization
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public ProfilePage login(String un, String pwd){
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		return new ProfilePage();
	}
}
