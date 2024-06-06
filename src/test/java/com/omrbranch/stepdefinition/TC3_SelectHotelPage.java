package com.omrbranch.stepdefinition;

import org.junit.Assert;

import com.omrbranch.baseclasss.BaseClass;
import com.pageobjectmanager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC3_SelectHotelPage extends BaseClass{

	PageObjectManager pom= new PageObjectManager();

	@When("User save the first hotel name and price")
	public void saveFirstHotelandPrice() {
	    
		String textFirstHotelName = pom.getSelectHotelPage().textFirstHotelName();
		String textFirstHotelPrice = pom.getSelectHotelPage().textFirstHotelPrice();
		System.out.println(textFirstHotelName);
		System.out.println(textFirstHotelPrice);
		
	}
	@When("User select the first hotel name and accept alert")
	public void selectFirstHotelNameandAccept() {
	   
		pom.getSelectHotelPage().clickFirstHotelContinue();

	}
	@Then("User should verify after select message {string}")
	public void verifySuccessMsg(String bookhotel) {
	    
		boolean contains = pom.getBookHotelPage().expectedBookHotel().contains(bookhotel);
		Assert.assertTrue("Verify the Succes message after select hotel", contains);
		
	}


	@When("User save the last hotel name and price")
	public void savelasthotelnameandprice() {
	   
		String textLastHotelName = pom.getSelectHotelPage().textLastHotelName();
		String textLastHotelPrice = pom.getSelectHotelPage().textLastHotelPrice();
		System.out.println(textLastHotelName);
		System.out.println(textLastHotelPrice);
		
	}
	@When("User select the last hotel name and accept alert")
	public void selectlasthotelandaccept() {
	    
		
		pom.getSelectHotelPage().clickLastHotelContinue();
		
	}
}