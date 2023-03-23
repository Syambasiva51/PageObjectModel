package com.mareana.mi.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mareana.mi.base.TestBase;

public class LoginPage extends TestBase {
	
	//declaration
	@FindBy(xpath="//input[@placeholder='Enter username: admin or user']")
	WebElement username;
	
	@FindBy(xpath="//input[@Type='password']")
	WebElement password;
	
	@FindBy(xpath="//button[@class='ant-btn ant-btn-default login-btn']/span[text()='Log In']")
	WebElement loginBtn;
	
	
	//Initilization
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public DashBoardPage login(String un, String pwd) throws InterruptedException{
		
		username.sendKeys(un);
		
		password.sendKeys(pwd);
		
		loginBtn.click();
		
		return new DashBoardPage();
		
		
	}
}
