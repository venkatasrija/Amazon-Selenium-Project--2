package com.amazondemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazondemo.base.AmazonBaseClass;

public class ChangeLanguageAgain extends AmazonBaseClass {

	public ChangeLanguageAgain()  {
		PageFactory.initElements(driver,this);
		}
		
		@FindBy(id="icp-nav-flyout")WebElement Dropdown1;
		
		@FindBy(xpath="//label[input[@name='lop' and @value='en_IN']]//span[@class='a-label a-radio-label']/span/span[normalize-space()='EN']")
		WebElement englishCode;
		
		@FindBy(css="input.a-button-input[aria-labelledby='icp-save-button-announce']")WebElement SaveChanges1;

		
	   public void EnglishLanguage()throws InterruptedException{
		   Thread.sleep(2000);
		   Dropdown1.click();
		   Thread.sleep(2000);
		   englishCode.click();
		   Thread.sleep(2000);
		   SaveChanges1.click();
		   
		   
	   }
		
	}


