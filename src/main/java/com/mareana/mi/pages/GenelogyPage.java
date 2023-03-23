package com.mareana.mi.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mareana.mi.base.TestBase;

public class GenelogyPage extends TestBase {
	

			
	@FindBy(xpath="(//a[text()='Genealogy'])[2]")
	WebElement Genologypageverification;
	
	@FindBy(xpath="	//button[@id='clear-search']")
	WebElement clear;
	
	@FindBy(xpath="//span[@class='ant-select-selection-search']/input[@id='rc_select_0']")
	WebElement Plant;
	
	@FindBy(xpath="(//div[@class='ant-select-item-option-content'])[1]")
	WebElement Plant_click;
	
	
	@FindBy(xpath="//span[@class='ant-select-selection-search']/input[@id='rc_select_1']")
	WebElement Product;
	
	@FindBy(xpath="(//div[@class='ant-select-item-option-content'])[3]")
	WebElement Product_click;
	
	@FindBy(xpath="//span[@class='ant-select-selection-search']/input[@id='rc_select_2']")
	WebElement Batch;
	
	@FindBy(xpath="(//div[@class='ant-select-item-option-content'])[2]")
	WebElement Batch_click;
	
	@FindBy(xpath="//div[@class='ant-select-selection-search']/input[@id='rc_select_3']")
	WebElement ProductType;
	
	@FindBy(xpath="//button[@id='genealogy-search']")
	WebElement Search;
	
	@FindBy(xpath="//span[text()='Backward']")
	WebElement Backward;
	
	@FindBy(xpath="//span[text()='Forward']")
	WebElement Forward;
	
	@FindBy(xpath="//span[text()='Quick Search']")
	WebElement Search_data;
	
	@FindBy(xpath="(//*[local-name()='svg' and @id='treeviewidbackward']/*/*/*)[1]")
	WebElement node;
	
	@FindBy(xpath="//span[text()='Backward Genealogy']")
	WebElement BackwordGenelogy;
	
	@FindBy(xpath="//span[text()='Forward Genealogy']")
	WebElement ForwardGenealogy;
	
	@FindBy(xpath="//span[text()='Mark as golden batch  ']")
	WebElement GoldenBatch;
	
	@FindBy(xpath="//span[text()='View Details']")
	WebElement ViewDetails;
	
	
	
	
	
	
	

	public GenelogyPage(){
		PageFactory.initElements(driver, this);
	}
	
	public void SelectParameters(String plant_val, String Product_val,String Batch_val) throws InterruptedException {
	
	  System.out.println(plant_val);
	  System.out.println(Product_val);
	  System.out.println(Batch_val);
	  
	  Plant.sendKeys(plant_val);
	  Plant_click.click();
	  
	  Batch.sendKeys(Batch_val);
	  Thread.sleep(2000);
	  Batch_click.click();
	  
	  Product.sendKeys(Product_val);
	  Product_click.click();
	  
	  Search.click();
	  Thread.sleep(3000);
	  
	  node.click();
	  Thread.sleep(3000);
	  
	  ViewDetails.click();
	  
	  Thread.sleep(3000);
	  
	  
		
	}
}
