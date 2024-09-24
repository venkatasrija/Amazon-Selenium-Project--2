package com.amazondemo.pages;

import java.io.File;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import com.amazondemo.base.AmazonBaseClass;
import com.google.common.io.Files;

public class AmazonSrceenShotsDemo extends AmazonBaseClass{
	
	public AmazonSrceenShotsDemo() {
		PageFactory.initElements(driver,this);
	}
	
	public void SignInPagetitleSS() throws InterruptedException {
        Thread.sleep(2000);
        
        File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File location=new File("C:\\Users\\User\\eclipse-workspace\\Ecap_Amazon_Selenium_project2\\AmazonScreenShotsDemo\\SignInPageSS.png");
        try {
        	Files.copy(screenshot, location);
        }catch(IOException e) {
        	e.printStackTrace();
        }
	}
	public void SignInPageSS() throws InterruptedException {
		Thread.sleep(2000);
		File screenshot1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File location1=new File("C:\\Users\\User\\eclipse-workspace\\Ecap_Amazon_Selenium_project2\\AmazonScreenShotsDemo\\SignInPagess.png");
		try {
			Files.copy(screenshot1, location1);
		}catch(IOException e) {
			e.printStackTrace();
		}
     }
	
	public void  SearchBarPageSS() throws InterruptedException {
		Thread.sleep(2000);
		File screenshot2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File location2=new File("C:\\Users\\User\\eclipse-workspace\\Ecap_Amazon_Selenium_project2\\AmazonScreenShotsDemo\\SearchBarPageSS.png");
		try {
			Files.copy(screenshot2, location2);
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public void ProductPageSS() throws InterruptedException {
		Thread.sleep(2000);
		File screenshot3=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File location3=new File("C:\\Users\\User\\eclipse-workspace\\Ecap_Amazon_Selenium_project2\\AmazonScreenShotsDemo\\ProductPageSS.png");
		try {
			Files.copy(screenshot3, location3);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public void AddToCartSS() throws InterruptedException {
		Thread.sleep(2000);
		File screenshot4=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File location4=new File("C:\\Users\\User\\eclipse-workspace\\Ecap_Amazon_Selenium_project2\\AmazonScreenShotsDemo\\AddToCartSS.png");
		try {
			Files.copy(screenshot4, location4);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void ProceedToBuySS() throws InterruptedException {
		Thread.sleep(2000);
		File screenshot5=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File location5=new File("C:\\Users\\User\\eclipse-workspace\\Ecap_Amazon_Selenium_project2\\AmazonScreenShotsDemo\\ProceedToBuySS.png");
		try {
			Files.copy(screenshot5, location5);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}	
	
	public void ChangeLanguageSS() throws InterruptedException {
		Thread.sleep(2000);
		File screenshot6=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File location6=new File("C:\\Users\\User\\eclipse-workspace\\Ecap_Amazon_Selenium_project2\\AmazonScreenShotsDemo\\ChangeLanguageSS.png");
		try {
			Files.copy(screenshot6, location6);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}	
}

	