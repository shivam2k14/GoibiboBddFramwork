package steps;

import com.goibibo.qa.pages.locators.HomePageActions;
import com.goibibo.qa.testdata.TestData;
import com.goibibo.qa.util.SeleniumDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePageTest {

	HomePageActions homepageaction=new HomePageActions();
	TestData testdata=new TestData();
	
	@Given("^I am on the Home Page  of goibibo Website$")
	public void i_am_on_the_Home_Page_of_goibibo_Website() throws Throwable {
	    SeleniumDriver.openPage(TestData.prop.getProperty("url"));
	}

	@Then("^I check the title of the page$")
	public void i_check_the_title_of_the_page() throws Throwable {
		String title = homepageaction.validateHomePageTitle();
		System.out.println("Title is "+title);
	}

	@Then("^I select RoundTrip radioButton$")
	public void i_select_RoundTrip_radioButton() throws Throwable {
		boolean flag =homepageaction.clickOnRoundTripOption();
		System.out.println(" status "+flag);
	}

	@Then("^I enter  departure city  values$")
	public void i_enter_departure_city_values() throws Throwable {
		String depCity=homepageaction.enterDepartureCityOnFromField(TestData.prop.getProperty("fromCity"));
		System.out.println(" from city is "+depCity);
		System.out.println(" from city day  "+TestData.dayDepar);
		System.out.println(" from city month  is "+TestData.month_yearDepar);
		System.out.println(" from city year is "+TestData.yearDepar);
	}

	@Then("^I enter  destination city  values$")
	public void i_enter_destination_city_values() throws Throwable {
		String destCity=homepageaction.enterDestCityOnDestinationField(TestData.prop.getProperty("destinationCity"));
		System.out.println(" dest city is "+destCity);
		System.out.println(" dest city day  "+TestData.dayReturn);
		System.out.println(" dest city month  is "+TestData.month_yearReturn);
		System.out.println(" dest city year is "+TestData.yearReturn);
	}

@Then("^I naviagte to month of departure date$")
public void i_naviagte_to_month_of_departure_date() throws Throwable {
	String day=TestData.dayDepar;
	  String month_year=TestData.month_yearDepar;
	  String year=TestData.yearDepar;
	  homepageaction.navigateToMonthForDepartureDt(day, month_year, year);
}

@Then("^I click on day of departure date$")
public void i_click_on_day_of_departure_date() throws Throwable {
	String day=TestData.dayDepar;
	String depDate=homepageaction.clickOnDayOfDepartureDate(day);
	System.out.println(" date dep "+depDate);
}

@Then("^I naviagte to month of destination date$")
public void i_naviagte_to_month_of_destination_date() throws Throwable {
	String day=TestData.dayReturn;
	  String month_year=TestData.month_yearReturn;
	  String year=TestData.yearReturn;
	  homepageaction.navigateToMonthForDestinationDt(day, month_year, year);
}

@Then("^I click on day of destination date$")
public void i_click_on_day_of_destination_date() throws Throwable {
	String day=TestData.dayReturn;
	String destDate=homepageaction.clickOnDayOfDestinationDate(day);
	System.out.println(" date retu "+destDate);
}

@Then("^I click on Search Flights$")
public void i_click_on_Search_Flights() throws Throwable {
	homepageaction.clickOnSearchFlight();
}


	
}
