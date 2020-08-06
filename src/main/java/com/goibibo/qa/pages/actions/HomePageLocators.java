package com.goibibo.qa.pages.actions;

import java.io.IOException;
import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.goibibo.qa.testdata.TestData;
import com.goibibo.qa.util.SeleniumDriver;
import com.goibibo.qa.util.TestUtil;


public class HomePageLocators{
  
	//Page Factory 
	
	@FindBy(id="roundTrip")
	public WebElement roundTripElement;
	
	public static final String cssSelctorForDepartureDistanceListFind="ul[id='react-autosuggest-1']>li";
	@FindBy(css=cssSelctorForDepartureDistanceListFind)
	public List<WebElement> elemForDepartureAndDestinationSearch;
	
	@FindBy(id="gosuggest_inputSrc")
	public WebElement departureElem;
	
	@FindBy(id="gosuggest_inputDest")
	public WebElement destinationElem;
	
	public static final String  cssSelctorOfMonthDisplay="div[class=\"fareCalFlt \"]>div>div:nth-of-type(2)>div.DayPicker-Caption";
	@FindBy(css=cssSelctorOfMonthDisplay)
	public WebElement elemOfMonthDisplay;
	
	public static final String cssSelectorOfMonthNavigationButton="div[class=\"fareCalFlt \"]>div>div:nth-of-type(1)>span";
	@FindBy(css=cssSelectorOfMonthNavigationButton)
	public WebElement elemOfNavigationButtonOnCalendor;
	
	@FindBy(id="departureCalendar")
	public WebElement elemOfDepartureDate;
	
	@FindBy(id="returnCalendar")
	public WebElement elemOfDestinationDate;
	
	public static final String before_XPATH_ForDaySelect="//div[@class=\"DayPicker-Month\"]/div[@class=\"DayPicker-Body\"]/div[";
	public static final String after_XPATH_ForDaySelect="]/div[";
	
	@FindBy(id="gi_search_btn")
	public WebElement elemOfSearchFlightButton;
   
	TestUtil testUtil;
	TestData testdata;
	
	
	  
	
}
