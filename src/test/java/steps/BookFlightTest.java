package steps;

import com.goibibo.qa.pages.locators.BookFlightPageActions;
import com.goibibo.qa.testdata.TestData;

import cucumber.api.java.en.Then;

public class BookFlightTest {

	
	TestData testdata=new TestData();
	BookFlightPageActions bookflightaction= new BookFlightPageActions();
	
@Then("^I select the highest price of departure flight$")
public void i_select_the_highest_price_of_departure_flight() throws Throwable {
	bookflightaction.setDEpartMaxPrice();
}

@Then("^I select the highest price of destination flight$")
public void i_select_the_highest_price_of_destination_flight() throws Throwable {
	bookflightaction.setReturnMaxPrice();
}

@Then("^I click on Book Flights$")
public void i_click_on_Book_Flights() throws Throwable {
	bookflightaction.clickOnBookButton();
}
}
