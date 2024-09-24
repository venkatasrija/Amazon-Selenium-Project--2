package com.amazondemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.amazondemo.base.AmazonBaseClass;

public class ProductPage  extends AmazonBaseClass{
	
	public ProductPage() {
		PageFactory.initElements(driver,this);
	}
	
	
	 @FindBy(xpath = "//span[contains(text(),'boAt Airdopes 91 Truly Wireless in Ear Ear Buds w/ 45 hrs Playtime,')]")
	    WebElement earbudsClick;

	  
  public void addProduct() throws InterruptedException {
      earbudsClick.click();
      switchToNewTab();
  }
  }


