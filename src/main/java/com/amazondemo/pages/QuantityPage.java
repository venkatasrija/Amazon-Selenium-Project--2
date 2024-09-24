package com.amazondemo.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.Select;


import com.amazondemo.base.AmazonBaseClass;

public class QuantityPage  extends AmazonBaseClass{
	
	public QuantityPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id='quantity']")
    public WebElement quantityDropdown;
	
	public void selectQuantity(String quantityValue) {    
		 Select quantitySelect = new Select(quantityDropdown);
	        quantitySelect.selectByVisibleText(quantityValue);  	
	}
	
	}
