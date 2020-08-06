package com.goibibo.qa.pages.locators;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.goibibo.qa.pages.actions.BookFlightPageLocators;
import com.goibibo.qa.util.SeleniumDriver;
import com.goibibo.qa.util.TestUtil;

public class BookFlightPageActions {

	TestUtil testUtil=new TestUtil();
	BookFlightPageLocators bookFlightPageLocators;
	// Initializing the Page Objects:
	public BookFlightPageActions()  {
      bookFlightPageLocators=new BookFlightPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), bookFlightPageLocators);
	}
	
	//Actions:
	public  void setDEpartMaxPrice() throws InterruptedException 
	{
		
		TestUtil.waitForpresenceOfElementLocated(SeleniumDriver.getDriver(), By.xpath(BookFlightPageLocators.xpathOfSortPriceOnDecreasing), 50);
		TestUtil.waitForpresenceOfElementLocated(SeleniumDriver.getDriver(), By.cssSelector(BookFlightPageLocators.cssOfSectionView), 50);
		
		TestUtil.scrollIntoView(SeleniumDriver.getDriver(),bookFlightPageLocators.elemOfSectionView);
		
		bookFlightPageLocators.elemOfSortPriceOnDecreasing.click();
		TestUtil.waitForpresenceOfElementLocated(SeleniumDriver.getDriver(), By.xpath(BookFlightPageLocators.xpathSelectHighestPriceOfFlightOnDeparture), 40);
		
		bookFlightPageLocators.elemSelectHighestPriceOfFlightOnDeparture.click();
	
}
	public  void setReturnMaxPrice()
	{
		TestUtil.waitForpresenceOfElementLocated(SeleniumDriver.getDriver(), By.cssSelector(BookFlightPageLocators.cssOfSectionView), 50);
		TestUtil.waitForpresenceOfElementLocated(SeleniumDriver.getDriver(), By.xpath(BookFlightPageLocators.xpathOfSortPriceOnDecreasing), 50);
		bookFlightPageLocators.elemOfSortPriceOnDecreasing.click();
		
	
       TestUtil.waitForpresenceOfElementLocated(SeleniumDriver.getDriver(), By.xpath(BookFlightPageLocators.xpathSelectHighestPriceOfFlightOnReturn), 50);
		
        bookFlightPageLocators.elemSelectHighestPriceOfFlightOnReturn.click();
	
	}
	
	public  void clickOnBookButton() throws IOException
	{
		 TestUtil.waitForpresenceOfElementLocated(SeleniumDriver.getDriver(), By.xpath(BookFlightPageLocators.xpathOfBookFlightButton), 40);
			
		 bookFlightPageLocators.elemOfBookFlightButton.click();
		 
		
		
		
	}
			
}
