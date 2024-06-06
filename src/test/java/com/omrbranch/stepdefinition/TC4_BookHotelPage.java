package com.omrbranch.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.omrbranch.baseclasss.BaseClass;
import com.pageobjectmanager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC4_BookHotelPage extends BaseClass {

	PageObjectManager pom= new PageObjectManager();


	@When("User add Guest Details {string},{string},{string},{string} and {string}")
	public void addGuestDetail(String salutation, String firstName, String lastName, String mobileNo,String emailAddress) {
	    
	pom.getBookHotelPage().addGuestDetails(salutation, firstName, lastName, mobileNo, emailAddress);
		
	}
	@When("User add GST Details {string},{string} and {string}")
	public void addGstDetails(String registrationNo, String companyName, String companyAddress) {
	    
		pom.getBookHotelPage().addGstDetails(registrationNo, companyName, companyAddress);
		
		
	}
	@Then("User add Special Request {string}")
	public void addSpecialRequest(String specialRequest) throws InterruptedException {
		
		pom.getBookHotelPage().addSpecialRequest(specialRequest);
		
	    
	}
	@When("User enter payment details, procced with Card Type {string}")
	public void enterPaymentDetails(String string, io.cucumber.datatable.DataTable dataTable) {
	    
		List<Map<String,String>> asMaps = dataTable.asMaps();
		Map<String, String> map = asMaps.get(0);
		String selectcard = map.get("Select Card");
		String cardno = map.get("Card No");
		String cardname = map.get("Card Name");
		String month= map.get("Month");
		String year = map.get("Year");
		String cvv = map.get("CVV");
		
		
		pom.getBookHotelPage().addPaymentDetails(string, selectcard, cardno, cardname, month, year, cvv);
		
		
		
	}
	@When("User should verify after hotel booking success message {string} and save the order ID")
	public void verifyHotelBookingandSaveOrder(String actualmessage) {

		Assert.assertEquals("Verify the booking success message",actualmessage , pom.getBookingConfirmationPage().expectedbookingmsg());
		pom.getBookingConfirmationPage().saveOrderId();

		
	}
	@Then("User should verify same selected Hotel is booked or not")
	public void verifySelectedHotelName() {
	   
		boolean contains = pom.getBookingConfirmationPage().hotelNameInBookingPage()
				.contains(pom.getBookingConfirmationPage().hotelNamewithoutHotelType());
		Assert.assertTrue("Verify that same selected hotel is booked", contains);
		
	}
	
	@Then("User click next without adding Special Request")
	public void userclicknextwithoutaddSR() {
	    
		pom.getBookHotelPage().clickNextInSpecialRequestPage();
		
	}
	
	@When("User click next without adding gst details")
	public void userclicknextwithoutaddgst() {
	   
		pom.getBookHotelPage().clickNextInGstDetailsPage();
		
	}

	@When("User click next without adding gst and special request details")
	public void userClickNextWithoutAddGstAndSR() {
	    
		pom.getBookHotelPage().clickNextTillPayment();
		
		
	}

	@Then("User click credit card")
	public void userClickCreditCard() {
	   
		pom.getBookHotelPage().clickCreditCard();
		
	}
	@Then("User click submit without entering payment details")
	public void userClickWithoutPaymentDetails() {
	    
		pom.getBookHotelPage().clickSubmitWithoutAnyDetails();
	}
	@Then("User should verify after payment details error message {string},{string},{string},{string},{string} and {string}")
	public void userVerifyallerrormsg(String cardTypeError, String cardError, String numberError, String cardnameError,
			String dateError, String cvvError) {
	    
	
		Assert.assertEquals("Verify the card Type error message", cardTypeError,pom.getBookHotelPage().getCardTypeError());
		Assert.assertEquals("Verify the card Error message", cardError,pom.getBookHotelPage().getCardError());
		Assert.assertEquals("Verify the card Number error message", numberError,pom.getBookHotelPage().getCardNumberError());
		Assert.assertEquals("Verify the card Name error message", cardnameError,pom.getBookHotelPage().getCardNameError());
		Assert.assertEquals("Verify the card Date error message", dateError,pom.getBookHotelPage().getDateError());
		Assert.assertEquals("Verify the card CVV error message", cvvError,pom.getBookHotelPage().getCvvError());

		
	}

	
	@Then("User enter upi details {string} and click submit")
	public void userEnterUpiDetailsandSubmit(String upi) {
	    
		pom.getBookHotelPage().userEnterUpi(upi);
		
	}

	@When("User click upi")
	public void user_click_upi() {
	    
		pom.getBookHotelPage().clickupi();
		
	}
	@Then("User should verify after payment details error message {string}")
	public void user_should_verify_after_payment_details_error_message(String actualerror) {
	    
		Assert.assertEquals("Verify the error message after click submit", actualerror,
				pom.getBookHotelPage().getUpierror());
			
	}
}
