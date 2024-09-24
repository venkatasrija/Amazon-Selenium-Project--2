package com.amazondemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazondemo.base.AmazonBaseClass;

public class SignInPage  extends AmazonBaseClass{
	public SignInPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="nav-link-accountList")WebElement signInButton;
	@FindBy(id="ap_email")WebElement emailField;
	@FindBy(id="continue")WebElement continueBtn;
	@FindBy(id="ap_password")WebElement passwordField;
	@FindBy(id="signInSubmit")WebElement submit;
	
	public String validateSignInPageTitle() {
		return driver.getTitle();
	}
	
	public void signin(String email,String password) throws InterruptedException {
		signInButton.click();
		
		emailField.sendKeys(email);
		
		Thread.sleep(2000);
		
		continueBtn.click();
		
		passwordField.sendKeys(password);
		
		submit.click();
		
		Thread.sleep(2000);
		
	}

}
