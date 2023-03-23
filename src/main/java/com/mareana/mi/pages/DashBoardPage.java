package com.mareana.mi.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mareana.mi.base.TestBase;

public class DashBoardPage extends TestBase{

	@FindBy(xpath="//div[@class='header-logo']")
	WebElement Dashboardlogo;
	
	@FindBy(xpath="//li[@id='genealogy']")
	WebElement sidebar;
	
	@FindBy(xpath="//li[@id='genealogy']")
	WebElement Genelogy;
	
	
	
	public DashBoardPage(){
		PageFactory.initElements(driver, this);
	}
	
	public String validateDashboardPageTitle(){
		return driver.getTitle();
	}
	
	public void HoveronSidebar(){
		sidebar.click();
	    
	}
	
	public GenelogyPage clickonGeonology() {
		Genelogy.click();
		return new GenelogyPage();
	}
	
	
}
