package com.goibibo.qa.pages.locators;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class PaymentPageLocators {

	
	public static final String cssSelectorOkButtonForSafetyCovid19="button.button.blue.large.fb.padLR30";
	@FindBy(css=cssSelectorOkButtonForSafetyCovid19)
	public WebElement elemOkButtonForSafetyCovid19;
	
	public static final String xpathOnPaymentSectionButton="//div[@class=\"flightDetails fl\"]//button//span[contains(text(),\"Payment\")]";
	@FindBy(xpath=xpathOnPaymentSectionButton)
	public WebElement elemOnPaymentSectionButton;
	
	public static final String xpathOfWalletSection="//div[@class=\"flightDetails fl\"]//div[@class=\"paymentBlk padLR15\"][6]/div[1]/div[2]//span/i";
	@FindBy(xpath=xpathOfWalletSection)
	public WebElement elemOfWalletSection;
	
	public static final String payButtonXpath="//div[@class=\"flightDetails fl\"]//div[@class=\"paymentBlk padLR15\"][6]/div[2]//button[contains(text(),\"Pay\")]";
	@FindBy(xpath=payButtonXpath)
	public WebElement payButtonElem;
	
}
