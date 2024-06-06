package com.omrbranch.stepdefinition;

import org.junit.Assert;

import com.omrbranch.baseclasss.BaseClass;
import com.pageobjectmanager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC5_ChangeBookingPage extends BaseClass{

	PageObjectManager pom= new PageObjectManager();

	@When("User navigate to my Booking page")
	public void user_navigate_to_my_booking_page() {
		
		pom.getBookingConfirmationPage().toMyAccountPage();
	}
	
	@Then("User should verify after navigate to my booking page success message as {string}")
	public void user_should_verify_after_navigate_to_my_booking_page_success_message_as(String string) {
		
		boolean contains = pom.getMyBookingPage().expectedBookingmsg().contains(string);
		Assert.assertTrue("Verify the booking page success message ", contains);
		
	}
	
	@When("User search the order ID")
	public void user_search_the_order_id() {   
		pom.getMyBookingPage().searchorderid();
	}
	
	
	@When("User search the {string}")
	public void user_search_the(String string) {
	    
		pom.getMyBookingPage().searchorderbyIn(string);
	}
	
	
	@Then("User should verify same booked order ID is present or not")
	public void user_should_verify_same_booked_order_id_is_present_or_not() {   
		
		Assert.assertTrue("Verify the same order is present", pom.getMyBookingPage().getFirstOrderId());
		
	}
	
	@Then("User should verify same booked hotel name is present  or not")
	public void user_should_verify_same_booked_hotel_name_is_present_or_not() {
	    
		pom.getMyBookingPage().verifyTheSameBookedHotelNameIsPresent();
	}
	
	
	@Then("User should verify same booked hotel price is present or not")
	public void user_should_verify_same_booked_hotel_price_is_present_or_not() {
	    
		Assert.assertTrue("Verify the same booked hotel price is present", pom.getMyBookingPage().verifySameBookedHotelPriceIsPresent());
		
	}
	
	
	@When("User edit the check-in Date {string}")
	public void user_edit_the_check_in_date(String string) {

		pom.getMyBookingPage().modifyChechInDate(string);
		
	}
	
	
	@Then("User should verify after modify check-in date success message {string}")
	public void user_should_verify_after_modify_check_in_date_success_message(String actualmsg) {   
	
		Assert.assertEquals("Verify the update successful message is present",actualmsg , pom.getMyBookingPage().expectedBookingSuccessMessage());
	
	}
	
	@When("User edit the check-in Date for the first displayed order {string}")
	public void user_edit_the_check_in_date_for_the_first_displayed_order(String string) {
	    
		pom.getMyBookingPage().modifyChechInDate(string);
		
	}
	
	
}
