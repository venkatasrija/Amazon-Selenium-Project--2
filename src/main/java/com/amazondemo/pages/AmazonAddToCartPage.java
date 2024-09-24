package com.amazondemo.pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.amazondemo.base.AmazonBaseClass;
import org.openqa.selenium.WebElement;


public class AmazonAddToCartPage extends AmazonBaseClass {
		
		public AmazonAddToCartPage() {
	        PageFactory.initElements(driver, this);
	    }
		  
	    @FindBy(xpath = "//input[@id='add-to-cart-button']")
	    public WebElement addToCartButton;
	    
	 //   @FindBy(xpath = "//input[@aria-labelledby='attachSiNoCoverage-announce']")
	//    WebElement skipButton;
	    
	 //   @FindBy(xpath="//a[contains(text(),'Go to Cart')]")
	 //   WebElement  goToCartButton;

	    @FindBy(xpath="//input[@aria-labelledby='attach-sidesheet-view-cart-button-announce']")WebElement addToCartButton1;


	    public void clickAddToCart() {
	        addToCartButton.click();
	        addToCartButton1.click();
	    }
	   
      //  public void clickSkipButton() {
     //   	skipButton.click();
      //  }        
//        public void ClickGoToCart() {
//        	goToCartButton.click();
//        }
}
