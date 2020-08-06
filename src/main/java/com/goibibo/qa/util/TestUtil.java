package com.goibibo.qa.util;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class TestUtil {

	

	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 20;
	
	public static void wait(WebDriver driver,  int time)
	{
		WebDriverWait wait=new WebDriverWait(driver, time);
	}
	
	public static boolean isAlertPresent(WebDriver driver) 
	{ 
	    try 
	    { 
	        driver.switchTo().alert(); 
	        return true; 
	    }   // try 
	    catch (NoAlertPresentException Ex) 
	    { 
	        return false; 
	    }   // catch 
	} 

	public static void waitForpresenceOfElementLocated(WebDriver driver,By locator,int timeOutInSeconds)
	{
		try {
		WebDriverWait wait=new WebDriverWait(driver, timeOutInSeconds);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		}
		catch(TimeoutException e)
		{
			System.out.println(e);
		}
	}

	
	public static void scrollIntoView(WebDriver driver, WebElement element) throws InterruptedException
    {
    	JavascriptExecutor js=((JavascriptExecutor)driver);
    	 
    	js.executeScript("arguments[0].scrollIntoView(true);",element);
    
    }

	public static boolean isValidName(String str) 
    { 
        return ((str != null) 
                && (!str.equals("")) 
                && (str.matches("^[a-zA-Z]*$"))); 
    }
	
	public static boolean isValidMiddleName(String str) 
    { 
        return ((str != null) 
                && (str.matches("^[a-zA-Z]*$"))); 
    }
	public static boolean isValidEmail(String email) {
	      String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
	      return email.matches(regex);
	   }
	
	public static boolean validatePhoneNumber(String phoneNo) {
		//validate phone numbers of format "1234567890"
		return (phoneNo.matches("\\d{10}")) ;
			
	}

}
