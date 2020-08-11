package steps;

import com.goibibo.qa.pages.actions.PaymentPageActions;
import com.goibibo.qa.testdata.TestData;
import com.goibibo.qa.util.SeleniumDriver;
import com.goibibo.qa.util.TestUtil;

import cucumber.api.java.en.Then;

public class PaymentTest {
     
	PaymentPageActions paymentPageActions=new PaymentPageActions();

	
	
	@Then("^I click on SafetyCovidMsz$")
	public void i_click_on_SafetyCovidMsz() throws Throwable {
	    paymentPageActions.clickOnSafetyCovidMsz();
	}

	@Then("^I scroll upto Payment Options$")
	public void i_scroll_upto_Payment_Options() throws Throwable {
	    paymentPageActions.scrollToPaymentOption();
	}

	@Then("^I click On wallet section of Payment$")
	public void i_click_On_wallet_section_of_Payment() throws Throwable {
	    paymentPageActions.clickOnPaymentButton();
	}

	@Then("^I click on AmazonPay Payment Option$")
	public void i_click_on_AmazonPay_Payment_Option() throws Throwable {
	   paymentPageActions.slelctAmazonPayPaymentOption();
	}
	
	@Then("^I wait for three sec_take_screnshotThird$")
	public void i_wait_for_three_sec_take_screnshot3() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   TestUtil.wait(SeleniumDriver.getDriver(), 5); 
	}

	@Then("^I capture screenshotThird$")
	public void i_capture_screenshot3() throws Throwable {
		String screenShotName="PaymentMethod";
			    TestUtil.capture(SeleniumDriver.getDriver(), screenShotName);
	}

	@Then("^I click on Pay Button$")
	public void i_click_on_Pay_Button() throws Throwable {
	    paymentPageActions.clickOnPayButton();
	}

}
