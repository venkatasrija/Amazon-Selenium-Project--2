package com.amazondemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazondemo.base.AmazonBaseClass;

public class ChangeLanguage extends AmazonBaseClass {
	
	public ChangeLanguage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="icp-nav-flyout")WebElement Dropdown;
	
	@FindBy(xpath="//span[contains(text(), 'అనువాదం')]")
	WebElement teluguTranslationHint;
	
	@FindBy(id="icp-language-translation-hint")WebElement Lang;
	@FindBy(css="input.a-button-input[aria-labelledby='icp-save-button-announce']")WebElement SaveChanges;
	
	
	@FindBy(xpath="//label[input[@name='lop' and @value='en_IN']]//span[@class='a-label a-radio-label']/span/span[normalize-space()='EN']")
	WebElement englishCode;

	
	



   public void Language()throws InterruptedException{
	   Thread.sleep(2000);
	   Dropdown.click();
	   Thread.sleep(2000);
	   Lang.click();
	   teluguTranslationHint.click();
	   Thread.sleep(2000);
	   SaveChanges.click();
	   
	   
   }
}