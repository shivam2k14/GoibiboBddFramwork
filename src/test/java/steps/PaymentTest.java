package steps;

import com.goibibo.qa.pages.locators.PaymentPageActions;
import com.goibibo.qa.testdata.TestData;

import cucumber.api.java.en.Then;

public class PaymentTest {
     
	PaymentPageActions paymentPageActions=new PaymentPageActions();
	TestData testdata=new TestData();
	
	
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

	@Then("^I click on Pay Button$")
	public void i_click_on_Pay_Button() throws Throwable {
	    paymentPageActions.clickOnPayButton();
	}

}
