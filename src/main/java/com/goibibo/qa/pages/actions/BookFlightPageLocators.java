package com.goibibo.qa.pages.actions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.goibibo.qa.util.TestUtil;

public class BookFlightPageLocators {

	public static final String xpathOfSortPriceOnDecreasing="//*[@class=\"fltHpyOnwrdWrp\"]//span[@class=\"fb ico11  hpyBlueLt \"]";
	@FindBy(xpath=xpathOfSortPriceOnDecreasing)
	public WebElement elemOfSortPriceOnDecreasing;
	
	public static final String cssOfSectionView="div.ico14.fb.padT10.quicks";
	@FindBy(css=cssOfSectionView)
	public WebElement elemOfSectionView;
	

	public static final String xpathSelectHighestPriceOfFlightOnDeparture="//div[@class=\"fltHpyRWrap dF justifyBetween\"]/div[1]/div[1]/div[1]//div[@class=\"dF alignItemsEnd\"]/span[2]/label";
	@FindBy(xpath=xpathSelectHighestPriceOfFlightOnDeparture)
	public WebElement elemSelectHighestPriceOfFlightOnDeparture;
	

	public static final String xpathSelectHighestPriceOfFlightOnReturn="//div[@class=\"fltHpyRWrap dF justifyBetween\"]/div[2]/div[1]/div[1]//div[@class=\"dF alignItemsEnd\"]/span[2]/label";
	@FindBy(xpath=xpathSelectHighestPriceOfFlightOnReturn)
	public WebElement elemSelectHighestPriceOfFlightOnReturn;
	
	public static final String xpathOfBookFlightButton="//div[@class=\"dF justifyBetween\"]/div[2]/span[2]/span/input";
	@FindBy(xpath=xpathOfBookFlightButton)
	public WebElement elemOfBookFlightButton;
	
	
	
			
}
