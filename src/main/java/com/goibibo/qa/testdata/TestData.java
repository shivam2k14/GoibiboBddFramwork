package com.goibibo.qa.testdata;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Properties;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.goibibo.qa.util.TestUtil;



public class TestData {

	public static Properties prop;
	public static WebDriver driver;
	
	public static  String dayDepar;
	public static String month_yearDepar;
	public static String yearDepar;
	
	public static  String dayReturn;
	public static String month_yearReturn;
	public static String yearReturn;
	
	public static String SecureProtec=null;
	public static String title = null;
	
	public static String firstName; 
	public static String middleName; 
	public static String LastName; 
	
	public static String email;
	public static String phoneNum;
	
	public TestData()  {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("E:\\Shivam\\seleniumEclipse\\GoibiboBddFrameworkTest\\src\\main\\java\\com\\goibibo\\qa\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		splitDepartDateIntoDayMonthYrFormate();
		splitDesttDateIntoDayMonthYrFormate();
	}
	public static void splitDepartDateIntoDayMonthYrFormate()
	{
          String dateDepart = prop.getProperty("dateDepart");
		
		String splitter[] = dateDepart.split("-");
         dayDepar = splitter[0];	
		 month_yearDepar = splitter[1];
		 yearDepar=splitter[2];
	}
	
	public  void splitDesttDateIntoDayMonthYrFormate()
	{
          String dateDepart = prop.getProperty("dateReturn");
		
		String splitter[] = dateDepart.split("-");
		dayReturn = splitter[0];	
		month_yearReturn = splitter[1];
		yearReturn=splitter[2];
	}
			
	public static void TakeDataFromCommandLine() throws IOException
	{
		//String  str[]=new String[7];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		

		Scanner sc=new Scanner(System.in);
		 SecureProtec=null;
		 title = null;
		
        
        System.out.println("1. Yes, secure my trip");
        System.out.println("2. I am willing to risk my trip");
        
        int choiceForSecurity=0;
        
        while(choiceForSecurity==0)
        {
        	System.out.println("Enter Your Choice : ");
        	choiceForSecurity=sc.nextInt();
	    switch(choiceForSecurity)
	    {
	    
	 
	    
	    case 1:
	    	SecureProtec="Yes";
	        break;
	    case 2:
	    	SecureProtec="No";
	    	break;
	    default: System.out.println("Wrong Entry ! Please enter 1 or 2 choice");
	    	choiceForSecurity=0;
	    }
	    
	}
        
        //str[0]=SecureProtec;
        
	    System.out.println("1. Mr");
        System.out.println("2.  Mrs");
        System.out.println("3.  Ms");
        
	      int choiceForTitle=0;
	      while(choiceForTitle==0)  
	      {
	    	  System.out.println("Enter Your Choice : ");
	           choiceForTitle=sc.nextInt();
		    switch(choiceForTitle)
		    {
		    case 1:
		    	title="Mr";
		        break;
		    case 2:
		    	title="Mrs";
		    	break;
		    case 3:
		    	title="Ms";
		    	break;
		    
	        default: System.out.println("Wrong Entry ! Please enter 1, 2 or 3 choice");
	        choiceForTitle=0;
		    }
	      }
	      
	    // str[1]=title;
	     
	    System.out.println("Please Enter the user FirstName :: ");
	    firstName= br.readLine();
	    
	    while(!TestUtil.isValidName(firstName))
	    {

		    System.out.println("Please Enter the valid FirstName :: ");
		    firstName= br.readLine();
	    }
	    //str[2]=firstName;
	    

	    System.out.println("Please Enter the user MiddleName :: ");
	    middleName= br.readLine();
	    while(!TestUtil.isValidMiddleName(middleName))
	    {

		    System.out.println("Please Enter the valid MiddleName :: ");
		    middleName= br.readLine();
	    }
	    //str[3]=middleName;
	    

	    System.out.println("Please Enter the user LastName :: ");
	    LastName= br.readLine();
	    
	    while(!TestUtil.isValidName(LastName))
	    {

		    System.out.println("Please Enter the valid LastName :: ");
		    LastName= br.readLine();
	    }
	   // str[4]=LastName;
	    
	    System.out.println("Please Enter the user email :: ");
	    email= br.readLine();
	    
while(!TestUtil.isValidEmail(email)) {
	    System.out.println("Please Enter the correct format eof   email :: ");
	    email= br.readLine();
}
	   // str[5]=email;

	    System.out.println("Please Enter the user phoneNum :: ");
	    phoneNum= br.readLine();
	    while(!TestUtil.validatePhoneNumber(phoneNum))
	    {

		    System.out.println("Please Enter correct formate of  phoneNum :: ");
		    phoneNum= br.readLine();
	    }
	   // str[6]=phoneNum;
	    
		//return str; 
	}
	
}
