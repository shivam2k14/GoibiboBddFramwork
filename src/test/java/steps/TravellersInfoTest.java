package steps;

import com.goibibo.qa.pages.actions.TravellerDetailsInfoPageActions;
import com.goibibo.qa.testdata.TestData;
import com.goibibo.qa.util.SeleniumDriver;
import com.goibibo.qa.util.TestUtil;

import cucumber.api.java.en.Then;
import junit.framework.Test;

public class TravellersInfoTest {
	
	TravellerDetailsInfoPageActions travellerDetailsInfoPageActions=new TravellerDetailsInfoPageActions();
	
	
	@Then("^I scroll upto Traveller Protection Form$")
	public void i_scroll_upto_Traveller_Protection_Form() throws Throwable {
		travellerDetailsInfoPageActions.ScrollUpToTravellerProtectionForm();
	}

	@Then("^I select Secure Option on Travller Protetion radioButton$")
	public void i_select_Secure_Option_on_Travller_Protetion_radioButton() throws Throwable {
		 String SecureProtec=TestData.SecureProtec;
		
	    travellerDetailsInfoPageActions.selectSecureOptionTravllerProtetion(SecureProtec);
	}

	@Then("^I scroll UptO Traveller Details Form$")
	public void i_scroll_UptO_Traveller_Details_Form() throws Throwable {
	    travellerDetailsInfoPageActions.scrollUpTOTravellerDetailsForm();
	}

	@Then("^I enter the Full name$")
	public void i_enter_the_Full_name() throws Throwable {
		
		 String title =TestData.title;
		
		 String firstName= TestData.firstName; 
		 String middleName=TestData.middleName; 
		 String LastName=TestData.LastName; 
		
	 travellerDetailsInfoPageActions.fillFullNameOfTraveller(title, firstName, middleName, LastName);
	}

	@Then("^I enter the Email id$")
	public void i_enter_the_Email_id() throws Throwable {

		 String email=TestData.email;
		 
	    travellerDetailsInfoPageActions.fillEmailOfTraveller(email);
	}

	@Then("^I enter the phone number$")
	public void i_enter_the_phone_number() throws Throwable {
		String phoneNum=TestData.phoneNum;
	    travellerDetailsInfoPageActions.fillPhoneOfTraveller(phoneNum);
	}
	
	@Then("^I wait for three sec_take_screnshotSecond$")
	public void i_wait_for_three_sec_take_screnshot2() throws Throwable {
	    
		TestUtil.wait(SeleniumDriver.getDriver(), 3); 
	}

	@Then("^I capture screenshotSecond$")
	public void i_capture_screenshot2() throws Throwable {
		String screenShotName="TravellersInfoForm";
			    TestUtil.capture(SeleniumDriver.getDriver(), screenShotName);
	}

	@Then("^I click on proceed button$")
	public void i_click_on_proceed_button() throws Throwable {
	    travellerDetailsInfoPageActions.clickOnPorceeedButton();
	}

}
