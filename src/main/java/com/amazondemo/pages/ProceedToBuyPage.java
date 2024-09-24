package com.amazondemo.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazondemo.base.AmazonBaseClass;

public class ProceedToBuyPage  extends AmazonBaseClass{
	
	public ProceedToBuyPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@name='proceedToRetailCheckout']")WebElement proceedToBuy;
	
	@FindBy(xpath="//input[@data-testid='Address_selectShipToThisAddress']")WebElement useThisAddressButton;
	
	//@FindBy(xpath = "//*[contains(@id, 'pp-') and contains(@type, 'radio')]")
   // WebElement cashOnDelivery;
       
   //  @FindBy(xpath = "//input[contains(@id, 'pp-') and @type='radio']")
   //    WebElement useThesePaymentMethod1;
     
     @FindBy(name="ppw-widgetEvent:SetPaymentPlanSelectContinueEvent")WebElement PaymentSelection;
	
	
	public void clickProceedToBuy() throws InterruptedException {
		proceedToBuy.click();
		Thread.sleep(3000);
		useThisAddressButton.click();
		Thread.sleep(2000);
		JavascriptExecutor js2=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		js2.executeScript("window.scrollBy(0,600)", "");
		Thread.sleep(2000);
		PaymentSelection.click();
		Thread.sleep(2000);
		
	     
	}
}
