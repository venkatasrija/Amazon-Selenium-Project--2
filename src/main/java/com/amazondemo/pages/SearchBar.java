package com.amazondemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazondemo.base.AmazonBaseClass;

public class SearchBar  extends AmazonBaseClass {
	public SearchBar() {
		PageFactory.initElements(driver,this);
	}
   @FindBy(id="twotabsearchtextbox")WebElement searchboxitem;
   @FindBy(id="nav-search-submit-button")WebElement searchbutton;
   
   
   public void SearchElement(String item) throws InterruptedException {
	   searchboxitem.sendKeys(item);
	   Thread.sleep(1000);
	   searchbutton.click();
	   Thread.sleep(1000);
   }
}
