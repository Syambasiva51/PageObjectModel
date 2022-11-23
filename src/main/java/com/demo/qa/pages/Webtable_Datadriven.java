package com.demo.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demo.qa.base.TestBase;

public class Webtable_Datadriven extends TestBase {
	
	@FindBy(id="addNewRecordButton")
	WebElement addData;
	
	@FindBy(id="firstName")
	WebElement Firstname;
	
	@FindBy(id="lastName")
	WebElement Lastname;
	
	@FindBy(id="userEmail")
	WebElement UserEmail;
	
	@FindBy(id="age")
	WebElement Age;
	
	@FindBy(id="salary")
	WebElement Salary;
	
	@FindBy(id="department")
	WebElement Department;
	
	@FindBy(id="submit")
	WebElement Submit;
	
	
	
	public Webtable_Datadriven(){
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickOnAddData(){
		addData.click();
	}
	
	public void EnterFirstname(){
		Firstname.sendKeys("test1");
	}
	
	public void EnterLastname(){
		Lastname.sendKeys("test1");
	}
	
	public void EnterUserEmail(){
		UserEmail.sendKeys("test1");
	}
	
	public void EnterAge(){
		Age.sendKeys("test1");
	}
	
	public void EnterSalary(){
		Salary.sendKeys("test1");
	}
	
	public void EnterDepartment(){
		Department.sendKeys("test1");
	}
	
	public void clickSubmit(){
		Submit.click();
	}
}
