package steps;

import com.goibibo.qa.pages.locators.TravellerDetailsInfoPageActions;
import com.goibibo.qa.testdata.TestData;

import cucumber.api.java.en.Then;

public class TravellersInfoTest {
	
	TravellerDetailsInfoPageActions travellerDetailsInfoPageActions=new TravellerDetailsInfoPageActions();
	TestData testdata=new TestData();
	
	@Then("^I scroll upto Traveller Protection Form$")
	public void i_scroll_upto_Traveller_Protection_Form() throws Throwable {
		travellerDetailsInfoPageActions.ScrollUpToTravellerProtectionForm();
	}

	@Then("^I select Secure Option on Travller Protetion radioButton$")
	public void i_select_Secure_Option_on_Travller_Protetion_radioButton() throws Throwable {
	    travellerDetailsInfoPageActions.selectSecureOptionTravllerProtetion("Yes");
	}

	@Then("^I scroll UptO Traveller Details Form$")
	public void i_scroll_UptO_Traveller_Details_Form() throws Throwable {
	    travellerDetailsInfoPageActions.scrollUpTOTravellerDetailsForm();
	}

	@Then("^I enter the Full name$")
	public void i_enter_the_Full_name() throws Throwable {
	 travellerDetailsInfoPageActions.fillFullNameOfTraveller("Mr", "as", "", "da");
	}

	@Then("^I enter the Email id$")
	public void i_enter_the_Email_id() throws Throwable {
	    travellerDetailsInfoPageActions.fillEmailOfTraveller("as@df.cfs");
	}

	@Then("^I enter the phone number$")
	public void i_enter_the_phone_number() throws Throwable {
	    travellerDetailsInfoPageActions.fillPhoneOfTraveller("1234567890");
	}

	@Then("^I click on proceed button$")
	public void i_click_on_proceed_button() throws Throwable {
	    travellerDetailsInfoPageActions.clickOnPorceeedButton();
	}

}
