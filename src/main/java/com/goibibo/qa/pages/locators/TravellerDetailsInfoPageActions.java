package com.goibibo.qa.pages.locators;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.goibibo.qa.pages.actions.TravellerDetailsInfoPageLocators;
import com.goibibo.qa.testdata.TestData;
import com.goibibo.qa.util.SeleniumDriver;
import com.goibibo.qa.util.TestUtil;




public class TravellerDetailsInfoPageActions {
	TravellerDetailsInfoPageLocators travellerDetailsInfoPageLocators=null;

	 TestUtil testUtil=new TestUtil();
	TestData testdata;
	public TravellerDetailsInfoPageActions()  {
		
		travellerDetailsInfoPageLocators=new TravellerDetailsInfoPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), travellerDetailsInfoPageLocators);
		
	}
	
	
	
	public  void ScrollUpToTravellerProtectionForm() throws InterruptedException
	{
		

		TestUtil.waitForpresenceOfElementLocated(SeleniumDriver.getDriver(), By.xpath(TravellerDetailsInfoPageLocators.xpathOfTravellerProtectionForm), 20);
		 
		
		TestUtil.scrollIntoView(SeleniumDriver.getDriver(),travellerDetailsInfoPageLocators.elemOfTravellerProtectionForm);
	}
	public  void selectSecureOptionTravllerProtetion(String secureMsz)
	{
		String constXpath="//div[@class=\"flightDetails fl\"]/div[3]/div/div[2]/div/div[3]";
		String secureProtXpath=constXpath+"/div[1]/input";
		String notSecureProtXpath=constXpath+"/div[2]/input";
		
		if(secureMsz.equals("Yes"))
		{

			TestUtil.waitForpresenceOfElementLocated(SeleniumDriver.getDriver(), By.xpath(TravellerDetailsInfoPageLocators.secureProtectionXpath), 20);
			 
			
			
			travellerDetailsInfoPageLocators.secureProtectionElem.click();
		}
		else if(secureMsz.equals("No"))
		{

            TestUtil.waitForpresenceOfElementLocated(SeleniumDriver.getDriver(), By.xpath(TravellerDetailsInfoPageLocators.notSecureProtectionXpath), 20);
		  
			travellerDetailsInfoPageLocators.secureProtectionElem.click();
		}
		
	}

public  void scrollUpTOTravellerDetailsForm() throws InterruptedException
{
	
	
	TestUtil.waitForpresenceOfElementLocated(SeleniumDriver.getDriver(), By.xpath(TravellerDetailsInfoPageLocators.xpathOfTravellersDetailsForm), 20);
	 

	TestUtil.scrollIntoView(SeleniumDriver.getDriver(),travellerDetailsInfoPageLocators.elemOfTravellersDetailsForm);
}

//div[@class="flightDetails fl"]/div[4]//form[@id="travellerForm"]/div[1]/div[4]/div[1]

public  void fillFullNameOfTraveller( String title, String firstName, String middleName, String lastName) throws IOException
{

	
	


	TestUtil.waitForpresenceOfElementLocated(SeleniumDriver.getDriver(), By.xpath(TravellerDetailsInfoPageLocators.titleXpathOnFullNameSection), 20);
	 
	
	Select selectTitle=new Select(travellerDetailsInfoPageLocators.titleElemOnFullNameSection);
	selectTitle.selectByVisibleText(title);
	
	TestUtil.waitForpresenceOfElementLocated(SeleniumDriver.getDriver(), By.xpath(TravellerDetailsInfoPageLocators.firstNameXpathOnFullNameSection), 20);
	travellerDetailsInfoPageLocators.firstNameElemOnFullNameSection.sendKeys(firstName);
	
	
	TestUtil.waitForpresenceOfElementLocated(SeleniumDriver.getDriver(), By.xpath(TravellerDetailsInfoPageLocators.middleNameXpathOnFullNameSection), 20);
	travellerDetailsInfoPageLocators.middleNameElemOnFullNameSection.sendKeys(middleName);
	
	TestUtil.waitForpresenceOfElementLocated(SeleniumDriver.getDriver(), By.xpath(TravellerDetailsInfoPageLocators.lastNameXpathOnFullNameSection), 20);
	travellerDetailsInfoPageLocators.lastNameElemOnFullNameSection.sendKeys(lastName);
	
	
}

public  void fillEmailOfTraveller( String email)
{
	TestUtil.waitForpresenceOfElementLocated(SeleniumDriver.getDriver(), By.xpath(TravellerDetailsInfoPageLocators.emailXpathOnEmailSection), 20);
    travellerDetailsInfoPageLocators.emailElemOnEmailSection.sendKeys(email);
	
}
public  void fillPhoneOfTraveller( String phone) throws IOException
{
	
	
	TestUtil.waitForpresenceOfElementLocated(SeleniumDriver.getDriver(), By.xpath(TravellerDetailsInfoPageLocators.mobileCodeXpathOnPhoneSection), 20);
    
	Select selectMobileCode=new Select(travellerDetailsInfoPageLocators.mobileCodeElemOnPhoneSection);
	selectMobileCode.selectByVisibleText("+91");
	
	TestUtil.waitForpresenceOfElementLocated(SeleniumDriver.getDriver(), By.xpath(TravellerDetailsInfoPageLocators.mobileNumberXpathOnPhoneSection), 20);
    
	travellerDetailsInfoPageLocators.mobileNumberElemOnPhoneSection.sendKeys(phone);
	
}

public  void clickOnPorceeedButton()
{
	TestUtil.waitForpresenceOfElementLocated(SeleniumDriver.getDriver(), By.xpath(TravellerDetailsInfoPageLocators.proccedButtonXpath), 20);
    
	travellerDetailsInfoPageLocators.proccedButtonElem.click();
	
	

	
}
	
}
