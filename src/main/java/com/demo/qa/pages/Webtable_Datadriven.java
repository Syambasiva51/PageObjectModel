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
	
	public void EnterFirstname(String firstname){
		Firstname.sendKeys(firstname);
	}
	
	public void EnterLastname(String lastname){
		Lastname.sendKeys(lastname);
	}
	
	public void EnterUserEmail(String Email){
		UserEmail.sendKeys(Email);
	}
	
	public void EnterAge(String age1){
		Age.sendKeys(age1);
	}
	
	public void EnterSalary(String Salary1){
		Salary.sendKeys(Salary1);
	}
	
	public void EnterDepartment(String department){
		Department.sendKeys(department);
	}
	
	public void clickSubmit(){
		Submit.click();
	}
}
