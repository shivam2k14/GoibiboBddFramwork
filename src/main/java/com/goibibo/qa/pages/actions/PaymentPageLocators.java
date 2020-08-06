package com.goibibo.qa.pages.actions;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class PaymentPageLocators {

	
	public static final String cssSelectorOkButtonForSafetyCovid19="button.button.blue.large.fb.padLR30";
	@FindBy(css=cssSelectorOkButtonForSafetyCovid19)
	public WebElement elemOkButtonForSafetyCovid19;
	
	public static final String xpathOnPaymentSectionButton="//div[@class=\"flightDetails fl\"]/div[5]/div/button";
	@FindBy(xpath=xpathOnPaymentSectionButton)
	public WebElement elemOnPaymentSectionButton;
	
	public static final String xpathOfWalletSection="//div[@class=\"flightDetails fl\"]/div[6]//div[@class=\"paymentBlk padLR15\"][6]/div[1]/div[2]//span/i";
	@FindBy(xpath=xpathOfWalletSection)
	public WebElement elemOfWalletSection;
	
	public static final String payButtonXpath="//div[@class=\"flightDetails fl\"]/div[6]//div[@class=\"paymentBlk padLR15\"][6]/div[2]/div/div[4]//button[@class=\"button green large citipatBtn btn payNowBtn\"]";
	@FindBy(xpath=payButtonXpath)
	public WebElement payButtonElem;
	
}
