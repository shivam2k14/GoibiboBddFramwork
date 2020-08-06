package com.goibibo.qa.pages.locators;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.goibibo.qa.pages.actions.PaymentPageLocators;
import com.goibibo.qa.pages.actions.TravellerDetailsInfoPageLocators;
import com.goibibo.qa.util.SeleniumDriver;
import com.goibibo.qa.util.TestUtil;




public class PaymentPageActions  {

	PaymentPageLocators paymentPageLocators=null;
	TestUtil testUtil=new TestUtil();
	public  PaymentPageActions()  {
		paymentPageLocators=new PaymentPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), paymentPageLocators);
		
	}
	
	public  void clickOnSafetyCovidMsz()
	{
		TestUtil.waitForpresenceOfElementLocated(SeleniumDriver.getDriver(), By.cssSelector(paymentPageLocators.cssSelectorOkButtonForSafetyCovid19), 20);
	    
		paymentPageLocators.elemOkButtonForSafetyCovid19.click();
	}
	
	public  void scrollToPaymentOption() throws InterruptedException
	{
		TestUtil.waitForpresenceOfElementLocated(SeleniumDriver.getDriver(), By.xpath(paymentPageLocators.xpathOnPaymentSectionButton), 30);
	    
		TestUtil.scrollIntoView(SeleniumDriver.getDriver(),paymentPageLocators.elemOnPaymentSectionButton);
	}
	
	public  void clickOnPaymentButton()
	{

		TestUtil.waitForpresenceOfElementLocated(SeleniumDriver.getDriver(), By.xpath(paymentPageLocators.xpathOnPaymentSectionButton), 20);
	    
		paymentPageLocators.elemOnPaymentSectionButton.click();
	}

	public  void slelctAmazonPayPaymentOption()
	{
		if(TestUtil.isAlertPresent(SeleniumDriver.getDriver()))
		{

			Alert alert=SeleniumDriver.getDriver().switchTo().alert();
			System.out.println("Alert msz "+alert.getText());
			alert.accept();
			System.exit(0);
			
		}
		else {
			TestUtil.waitForpresenceOfElementLocated(SeleniumDriver.getDriver(), By.xpath(paymentPageLocators.xpathOfWalletSection), 20);
		    
			paymentPageLocators.elemOfWalletSection.click();
		}
	}

 public  void clickOnPayButton()
 {
	 TestUtil.waitForpresenceOfElementLocated(SeleniumDriver.getDriver(), By.xpath(paymentPageLocators.payButtonXpath), 20);
	 paymentPageLocators.payButtonElem.click();
 }
	
	
}
