@Book_Tikect
Feature: Acceptance testing.
  In order to book the tickets verify that goibibo page is loading and able to book the tickets
  

  @GoibiboFlighBooking
  Scenario: Validate ticketBooking
    Given I am on the Home Page  of goibibo Website
    Then I check the title of the page
    Then I select RoundTrip radioButton
    Then I enter  departure city  values 
    Then I enter  destination city  values 
    Then I naviagte to month of departure date
    Then I click on day of departure date
    Then I naviagte to month of destination date
    Then I click on day of destination date
    Then I click on Search Flights
    Then I select the highest price of departure flight
    Then I select the highest price of destination flight
    Then I click on Book Flights
    Then I scroll upto Traveller Protection Form
    Then I select Secure Option on Travller Protetion radioButton
    Then I scroll UptO Traveller Details Form
    Then I enter the Full name 
    Then I enter the Email id 
    Then I enter the phone number
    Then I click on proceed button
    Then I click on SafetyCovidMsz 
    Then I scroll upto Payment Options
    Then I click On wallet section of Payment 
    Then I click on AmazonPay Payment Option
    Then I click on Pay Button
    
 
