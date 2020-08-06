package com.goibibo.qa.pages.actions;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class TravellerDetailsInfoPageLocators  {

	
	 public static final String xpathOfTravellerProtectionForm="//div[@class=\"flightDetails fl\"]/div[3]/div/div[2]/div";
    @FindBy(xpath=xpathOfTravellerProtectionForm)
	public WebElement elemOfTravellerProtectionForm;
    
     public static final String constXpathForSecureProtection="//div[@class=\"flightDetails fl\"]/div[3]/div/div[2]/div/div[3]";
	
     public static final String secureProtectionXpath=constXpathForSecureProtection+"/div[1]/input";
	@FindBy(xpath=secureProtectionXpath)
	public WebElement secureProtectionElem;
	
	 public static final	String notSecureProtectionXpath=constXpathForSecureProtection+"/div[2]/input";
   @FindBy(xpath=notSecureProtectionXpath)
   public WebElement notSecureProtectionElem;
  
    public static final String xpathOfTravellersDetailsForm="//div[@class=\"flightDetails fl\"]/div[4]/div/div/div/span[contains(text(),\"Traveller\")]";
   @FindBy(xpath=xpathOfTravellersDetailsForm)
   public WebElement elemOfTravellersDetailsForm;
	
   public static final String XpathOnFullNameSection="//div[@class=\"flightDetails fl\"]/div[4]//form[@id=\"travellerForm\"]/div[1]/div[4]/div[1]";
   public static final String constXpathOnFullNameSection=XpathOnFullNameSection+"/div[2]/div[1]/div[2]";
	
	public static final String titleXpathOnFullNameSection=    constXpathOnFullNameSection+"/div[1]/select";
	@FindBy(xpath=titleXpathOnFullNameSection)
	public WebElement titleElemOnFullNameSection;
	
	public static final String firstNameXpathOnFullNameSection=    constXpathOnFullNameSection+"/div[2]/input";
	@FindBy(xpath=firstNameXpathOnFullNameSection)
	public WebElement firstNameElemOnFullNameSection;
	
	public static final	String middleNameXpathOnFullNameSection=   constXpathOnFullNameSection+"/div[3]/input";
	@FindBy(xpath=middleNameXpathOnFullNameSection)
	public WebElement middleNameElemOnFullNameSection;
	
	public static final String lastNameXpathOnFullNameSection=         constXpathOnFullNameSection+"/div[4]/input";
	@FindBy(xpath=lastNameXpathOnFullNameSection)
	public WebElement lastNameElemOnFullNameSection;
	

	public static final String XpathOnEmailSection="//div[@class=\"flightDetails fl\"]/div[4]//form[@id=\"travellerForm\"]/div[1]/div[4]/div[2]";
	public static final String constXpathOnEmailSection=XpathOnEmailSection+"/div[2]/div[1]";
	
	public static final String emailXpathOnEmailSection=constXpathOnEmailSection+"/input";
	@FindBy(xpath=emailXpathOnEmailSection)
	public WebElement emailElemOnEmailSection;
	
	public static final String XpathOnPhoneSection="//div[@class=\"flightDetails fl\"]/div[4]//form[@id=\"travellerForm\"]/div[1]/div[4]/div[3]";
	public static final String constXpathOnPhoneSection=XpathOnPhoneSection+"/div[2]/div";
	
	public static final String mobileCodeXpathOnPhoneSection=constXpathOnPhoneSection+"/div[1]/select";
	@FindBy(xpath=mobileCodeXpathOnPhoneSection)
	public WebElement mobileCodeElemOnPhoneSection;
	
	public static final String mobileNumberXpathOnPhoneSection=constXpathOnPhoneSection+"/div[2]/input";
	@FindBy(xpath=mobileNumberXpathOnPhoneSection)
	public WebElement mobileNumberElemOnPhoneSection;
	

	public static final String constxpathOnProceedSections="//div[@class=\"flightDetails fl\"]/div[4]//form[@id=\"travellerForm\"]/div[2]";
	
	public static final String proccedButtonXpath=constxpathOnProceedSections+"/button";
	@FindBy(xpath=proccedButtonXpath)
	public WebElement proccedButtonElem;
	
}
