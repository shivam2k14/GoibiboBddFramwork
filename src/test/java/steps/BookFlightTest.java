package steps;

import com.goibibo.qa.pages.actions.BookFlightPageActions;
import com.goibibo.qa.testdata.TestData;
import com.goibibo.qa.util.SeleniumDriver;
import com.goibibo.qa.util.TestUtil;

import cucumber.api.java.en.Then;

public class BookFlightTest {

	
	
	BookFlightPageActions bookflightaction= new BookFlightPageActions();
	
@Then("^I select the highest price of departure flight$")
public void i_select_the_highest_price_of_departure_flight() throws Throwable {
	bookflightaction.setDEpartMaxPrice();
}

@Then("^I select the highest price of destination flight$")
public void i_select_the_highest_price_of_destination_flight() throws Throwable {
	bookflightaction.setReturnMaxPrice();
}

@Then("^I wait for three sec_take_screnshotIst$")
public void i_wait_for_three_sec_take_screnshot1() throws Throwable {
	TestUtil.wait(SeleniumDriver.getDriver(), 3); 
    
}

@Then("^I capture screenshotIst$")
public void i_capture_screenshot1() throws Throwable {
	String screenShotName="FareSection";
    TestUtil.capture(SeleniumDriver.getDriver(), screenShotName);
    
}

@Then("^I click on Book Flights$")
public void i_click_on_Book_Flights() throws Throwable {
	bookflightaction.clickOnBookButton();
}
}
