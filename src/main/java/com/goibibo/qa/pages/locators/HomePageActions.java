package com.goibibo.qa.pages.locators;

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

import com.goibibo.qa.pages.actions.HomePageLocators;
import com.goibibo.qa.testdata.TestData;
import com.goibibo.qa.util.SeleniumDriver;
import com.goibibo.qa.util.TestUtil;


public class HomePageActions {
  

	TestUtil testUtil=new TestUtil();
	TestData testdata;
	HomePageLocators homePageLocators=null;
	//Initializing the Page Objects:
		public HomePageActions()  {
			homePageLocators=new HomePageLocators();
			PageFactory.initElements(SeleniumDriver.getDriver(), homePageLocators);
		}
		
		
	  //Actions:
		public String validateHomePageTitle(){
			return SeleniumDriver.getDriver().getTitle();
		}
		
		public boolean clickOnRoundTripOption() {
			   TestUtil.waitForpresenceOfElementLocated(SeleniumDriver.getDriver(), By.id("roundTrip"), 40);
			     homePageLocators.roundTripElement.click();
			     TestUtil.wait(SeleniumDriver.getDriver(),10);
			     return homePageLocators.roundTripElement.isDisplayed();
		}
		
		public String enterDepartureCityOnFromField(String depCityNm)
		{
			
			 
			 homePageLocators.departureElem.sendKeys(depCityNm);
			 
			 
			 TestUtil.waitForpresenceOfElementLocated(SeleniumDriver.getDriver(), By.cssSelector(HomePageLocators.cssSelctorForDepartureDistanceListFind), 20);
			 
			 List<WebElement> sourceAllEl=homePageLocators.elemForDepartureAndDestinationSearch;
		 for(WebElement sourDelhi:sourceAllEl)
			 {
				 if(sourDelhi.getText().contains("Delhi"))
				 {
					 
					 sourDelhi.click();
					 break;
				 }
			 }
		TestUtil.wait(SeleniumDriver.getDriver(),2);
		 
		 return  homePageLocators.departureElem.getAttribute("value");
			 
		}
		
		public String enterDestCityOnDestinationField(String destCityNm)
		{
			 homePageLocators.destinationElem.sendKeys(destCityNm);
			 
			 TestUtil.waitForpresenceOfElementLocated(SeleniumDriver.getDriver(), By.cssSelector(HomePageLocators.cssSelctorForDepartureDistanceListFind), 20);
			 
			 List<WebElement> destAllEl=homePageLocators.elemForDepartureAndDestinationSearch;
			 
			 for(WebElement sourDelhi:destAllEl)
			 {
				 if(sourDelhi.getText().contains("Mumbai"))
				 {
					 sourDelhi.click();
					 break;
				 }
			 }
			 
            return  homePageLocators.destinationElem.getAttribute("value");
			
		}

		public   void navigateToMonthForDepartureDt(String day,String month_year,String year) throws InterruptedException
		  {
			
			 
			homePageLocators.elemOfDepartureDate.click();
				
				 int yearDiff = Integer.parseInt(year)- Calendar.getInstance().get(Calendar.YEAR);
				 
				
				if( yearDiff==0)
				
				{
				   while( !homePageLocators.elemOfMonthDisplay.getText().contains(month_year) )
				   {  
					   //System.out.println(" in equal");
					   homePageLocators.elemOfNavigationButtonOnCalendor.click();
					   TestUtil.wait(SeleniumDriver.getDriver(),2);
				       
				   
				   }
				   
				}
				else if( yearDiff>0)
					
					{
					
					   while( !homePageLocators.elemOfMonthDisplay.getText().contains(year) )
					   {  
						   try {
						  // System.out.println(" in greater");
							   homePageLocators.elemOfNavigationButtonOnCalendor.click();
						   TestUtil.wait(SeleniumDriver.getDriver(),2);
					       
						   }
						   catch(StaleElementReferenceException e)
						   {
							   System.out.println(" Beyond of date");
							   System.exit(0);
						   }
					       
							 
					       
					   
					   }
					   while( !homePageLocators.elemOfMonthDisplay.getText().contains(month_year) )
					   {  
						   //System.out.println(" in greater");
						   homePageLocators.elemOfNavigationButtonOnCalendor.click();
					      TestUtil.wait(SeleniumDriver.getDriver(),2);
					       
							 
					       
					   
					   }
					   
					   
					} 
		  }
			
		public  String clickOnDayOfDepartureDate(  String day) throws InterruptedException
		{
			
		  
			
			
		     final int totalweekdays=7;
		     
		       boolean flag=false;
		       String dayVal=null;
		       
		  
		       for(int rownum=1;rownum<=6;rownum++)
		       {
		    	   for(int colNum=1;colNum<=totalweekdays;colNum++)
		          {
		    		   
		    		   
		    			   
		    		   try {
			    	    	 
		  	    	     dayVal=SeleniumDriver.getDriver().findElement(By.xpath(HomePageLocators.before_XPATH_ForDaySelect+rownum+HomePageLocators.after_XPATH_ForDaySelect+colNum+"]")).getText();
		  	    	   
		    		   }catch(NoSuchElementException e)
		  	    	     {
		  	    	    	 
		  	    	    	flag=false;
		  	    	    	 System.out.println("Please enter correct date value: ");
		  	    	    	 break; 
		  	    	     }
		    	     
		    	    // System.out.println("DAY VAL "+dayVal);
		    	  
		    	      if(dayVal!=null && dayVal.contains(day))
		    	     {
		    	    	  SeleniumDriver.getDriver().findElement(By.xpath(HomePageLocators.before_XPATH_ForDaySelect+rownum+HomePageLocators.after_XPATH_ForDaySelect+colNum+"]")).click();
		    		     flag=true;
		    		     break;
		    		 
		    	     }
		    	      
		           }
		    	
		         if(flag)
		        {
	              break;
		        }
		    
		   }
		       
		       return homePageLocators.elemOfDepartureDate.getAttribute("value");
		}
		
		public   void navigateToMonthForDestinationDt(String day,String month_year,String year) throws InterruptedException
		  {
			
			 
			homePageLocators.elemOfDestinationDate.click();
				
				 int yearDiff = Integer.parseInt(year)- Calendar.getInstance().get(Calendar.YEAR);
				 
				
				if( yearDiff==0)
				
				{
				   while( !homePageLocators.elemOfMonthDisplay.getText().contains(month_year) )
				   {  
					   //System.out.println(" in equal");
					   homePageLocators.elemOfNavigationButtonOnCalendor.click();
					   TestUtil.wait(SeleniumDriver.getDriver(),2);
				       
				   
				   }
				   
				}
				else if( yearDiff>0)
					
					{
					
					   while( !homePageLocators.elemOfMonthDisplay.getText().contains(year) )
					   {  
						   try {
						  // System.out.println(" in greater");
							   homePageLocators.elemOfNavigationButtonOnCalendor.click();
						   TestUtil.wait(SeleniumDriver.getDriver(),2);
					       
						   }
						   catch(StaleElementReferenceException e)
						   {
							   System.out.println(" Beyond of date");
							   System.exit(0);
						   }
					       
							 
					       
					   
					   }
					   while( !homePageLocators.elemOfMonthDisplay.getText().contains(month_year) )
					   {  
						   //System.out.println(" in greater");
						   homePageLocators.elemOfNavigationButtonOnCalendor.click();
					      TestUtil.wait(SeleniumDriver.getDriver(),2);
					       
							 
					       
					   
					   }
					   
					   
					} 
		  }
			
		public  String clickOnDayOfDestinationDate(  String day) throws InterruptedException
		{
			
		  
			
			
		     final int totalweekdays=7;
		     
		       boolean flag=false;
		       String dayVal=null;
		       
		  
		       for(int rownum=1;rownum<=6;rownum++)
		       {
		    	   for(int colNum=1;colNum<=totalweekdays;colNum++)
		          {
		    		   
		    		   
		    			   
		    		   try {
			    	    	 
		  	    	     dayVal=SeleniumDriver.getDriver().findElement(By.xpath(HomePageLocators.before_XPATH_ForDaySelect+rownum+HomePageLocators.after_XPATH_ForDaySelect+colNum+"]")).getText();
		  	    	   
		    		   }catch(NoSuchElementException e)
		  	    	     {
		  	    	    	 
		  	    	    	flag=false;
		  	    	    	 System.out.println("Please enter correct date value: ");
		  	    	    	 break; 
		  	    	     }
		    	     
		    	    // System.out.println("DAY VAL "+dayVal);
		    	  
		    	      if(dayVal!=null && dayVal.contains(day))
		    	     {
		    	    	  SeleniumDriver.getDriver().findElement(By.xpath(HomePageLocators.before_XPATH_ForDaySelect+rownum+HomePageLocators.after_XPATH_ForDaySelect+colNum+"]")).click();
		    		     flag=true;
		    		     break;
		    		 
		    	     }
		    	      
		           }
		    	
		         if(flag)
		        {
	              break;
		        }
		    
		   }
		       
		       return homePageLocators.elemOfDestinationDate.getAttribute("value");
		}
		
		 public  void clickOnSearchFlight() throws IOException
		  {
			  homePageLocators.elemOfSearchFlightButton.click();
			  
		  }
	
}
