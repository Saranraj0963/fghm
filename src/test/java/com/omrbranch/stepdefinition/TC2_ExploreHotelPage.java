package com.omrbranch.stepdefinition;

import java.awt.AWTException;
import org.junit.Assert;

import com.omrbranch.baseclasss.BaseClass;
import com.pageobjectmanager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC2_ExploreHotelPage extends BaseClass {

	PageObjectManager pom= new PageObjectManager();

	@When("User search hotel {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void user_search_hotel_and(String state, String city, String room, String checkin, String checkout, String NoOfRooms, String NoOfAdults, String NoOfChild) throws AWTException, InterruptedException {
		pom.getSearchHotelPage().searchHotelWithAllFields(state, city, room, checkin, checkout, NoOfRooms, NoOfAdults,
				NoOfChild);
	}
	@Then("User should verify after search hotel success message {string}")
	public void user_should_verify_after_search_hotel_success_message(String actualLoginMsg) {
		
		Assert.assertEquals("Verify the success message after search hotel", actualLoginMsg,
				pom.getSelectHotelPage().expectedSelecHotelMessage());
	}
	
	@When("User search hotel {string},{string},{string},{string},{string} and {string}")
	public void searchHotelOnlyWithMandatoryFields(String state, String city, String checkIn, String checkOut, String NoOfRooms, String NoOfAdults) throws InterruptedException {
	   
		pom.getSearchHotelPage().searchHotelWithMandatoryFields(state, city, checkIn, checkOut, NoOfRooms, NoOfAdults);
	}

	@Then("User click Search button")
	public void clickSearchButton() throws InterruptedException {
	 pom.getSearchHotelPage().clickSearchButton();   
		
	}
	@Then("User should verify after search hotel error message {string},{string},{string},{string},{string} and {string}")
	public void errorMsgVerify(String stateError, String cityError, String checkinError, String checkoutError, String NoOfroomError, String NoOfAdultsError) {
	    
		Assert.assertEquals("Verify the State Error Message", stateError, pom.getSearchHotelPage().stateError());
		Assert.assertEquals("Verify the City Error Message", cityError, pom.getSearchHotelPage().cityError());
		Assert.assertEquals("Verify the Checkin Error Message", checkinError, pom.getSearchHotelPage().CheckInError());
		Assert.assertEquals("Verify the Checkout Error Message", checkoutError, pom.getSearchHotelPage().checkOutError());
		Assert.assertEquals("Verify the No of rooms Error Message", NoOfroomError, pom.getSearchHotelPage().noOfRoomsError());
		Assert.assertEquals("Verify the No of Adults Error Message", NoOfAdultsError, pom.getSearchHotelPage().noOfAdultsError());

	}

	@When("User click sort from low to high")
	public void user_click_sort_from_low_to_high() throws InterruptedException {
		pom.getSelectHotelPage().clickLowToHigh();
		
		
	}
	@Then("User should verify after sorting that price are listed from low to high")
	public void user_should_verify_after_sorting_that_price_are_listed_from_low_to_high() {
	    
		boolean verifyLowPriceToHigh = pom.getSelectHotelPage().verifyLowPriceToHigh();
		Assert.assertTrue("Verify after sorting Low to High", verifyLowPriceToHigh);
	}

	@When("User click sort from high to low")
	public void user_click_sort_from_high_to_low() throws InterruptedException {
	    pom.getSelectHotelPage().clickHighToLow();
	    
	}
	@Then("User should verify after sorting that price are listed from high to low")
	public void user_should_verify_after_sorting_that_price_are_listed_from_high_to_low() {
		
	    boolean verifyHighPriceToLow = pom.getSelectHotelPage().verifyHighPriceToLow();
	    Assert.assertTrue("Verify after sorting price High to low", verifyHighPriceToLow);
		
		
	}

	@When("User click sort from Descending order")
	public void user_click_sort_from_descending_order() throws InterruptedException {
	   
		pom.getSelectHotelPage().clickNameDescending();
	}
	@Then("User should verify after sorting that name in Descending order")
	public void user_should_verify_after_sorting_that_name_in_descending_order() {
		
	    boolean verifyDescendingOrder = pom.getSelectHotelPage().verifyDescendingOrder();
	    Assert.assertTrue("Verify after sorted name Descending order", verifyDescendingOrder);
	    
	}

	@When("User click sort from Ascending order")
	public void user_click_sort_from_ascending_order() throws InterruptedException {
	    pom.getSelectHotelPage().clickNameAscending();
	    
	}
	@Then("User should verify after sorting that name in Ascending order")
	public void user_should_verify_after_sorting_that_name_in_ascending_order() {
	    
		boolean verifyAscendingOrder = pom.getSelectHotelPage().verifyAscendingOrder();
		Assert.assertTrue("Verify after sorted name Ascending order", verifyAscendingOrder);
		
	}

	@Then("User should verify all hotel listed in the selected room type {string}")
	public void user_should_verify_all_hotel_listed_in_the_selected_room_type(String roomType) {
	    
		boolean verifyThatAllListedHotelIsInSameRoomType = pom.getSelectHotelPage().verifyThatAllListedHotelInSameRoomType(roomType);
		
		if (verifyThatAllListedHotelIsInSameRoomType == true) {
			
			System.out.println("All selected room is not in the same room type");
		
		} else {
		
			System.out.println("All selected room is  in the same room type");
		}
	}

}
