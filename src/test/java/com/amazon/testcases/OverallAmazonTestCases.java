package com.amazon.testcases;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.amazondemo.base.AmazonBaseClass;
import com.amazondemo.pages.AmazonAddToCartPage;
import com.amazondemo.pages.AmazonSrceenShotsDemo;
import com.amazondemo.pages.ChangeLanguage;
import com.amazondemo.pages.ChangeLanguageAgain;
import com.amazondemo.pages.ProceedToBuyPage;
import com.amazondemo.pages.ProductPage;
import com.amazondemo.pages.SearchBar;
import com.amazondemo.pages.SignInPage;

public class OverallAmazonTestCases extends AmazonBaseClass{
	
	WebDriver driver;
	SignInPage sp;
	AmazonSrceenShotsDemo sc= new AmazonSrceenShotsDemo();
	
	public OverallAmazonTestCases() throws IOException {
		super();
	}
	@BeforeSuite
	public void setup() throws IOException{
		initialization();
		sp=new SignInPage();
	}	
	
	@Test(priority=1)
	public void SignInPageTitle() throws InterruptedException {
		String title=sp.validateSignInPageTitle();
   //Assert.assertEquals(title,"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		Assert.assertTrue(title.contains("Amazon.in"));
		Thread.sleep(1000);
		sc.SignInPagetitleSS();
		
}
	@Test(priority=2)
	public void changeLanguageTest() throws InterruptedException {
		ChangeLanguage cl=new ChangeLanguage();
		cl.Language();
		sc.ChangeLanguageSS();
		
	}
	
	
	@Test(priority=3)
	public void SignInTest() throws InterruptedException {
		sp.signin(props.getProperty("email"),props.getProperty("password"));
		Thread.sleep(2000);
		sc.SignInPageSS();
		
	}
	
	@Test(priority=4)
	public void changeLanguageEnglishTest() throws InterruptedException {
		ChangeLanguageAgain cle=new ChangeLanguageAgain();
		cle.EnglishLanguage();
		sc.ChangeLanguageSS();
		
	}
	
	@Test(priority=5)
	public void SearchBarTest() throws InterruptedException {
		 String item = "earbuds";
		SearchBar sb=new SearchBar();
		sb.SearchElement(item);
		Thread.sleep(2000);
		sc.SearchBarPageSS();
		
	}
	
	@Test(priority=6)
	public void SelectProductTest() throws InterruptedException {
		 ProductPage  pp = new ProductPage();
		  pp.addProduct(); 
		  Thread.sleep(2000);
		  sc.ProductPageSS();
	 }
	
	@Test(priority =7)
	public void AddToCartTest() throws InterruptedException {
	    AmazonAddToCartPage cp = new AmazonAddToCartPage();
	    cp.clickAddToCart();
	   // cp.clickSkipButton1();
	  //  cp.ClickGoToCart();
	    sc.AddToCartSS();
	}
	
	@Test(priority=8)
	public void ProceedToBuyTest() throws InterruptedException {
		ProceedToBuyPage pb=new ProceedToBuyPage();
		pb.clickProceedToBuy();
		sc.ProceedToBuySS();
	}
	
}


