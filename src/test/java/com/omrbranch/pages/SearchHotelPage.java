package com.omrbranch.pages;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclasss.BaseClass;

public class SearchHotelPage extends BaseClass {

	public SearchHotelPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='icoTwitter mr-2 dropdown-toggle']")
	private WebElement txtusername;

	@FindBy(xpath = "(//select[@class='form-control selectpicker'])[1]")
	private WebElement ddnstate;

	@FindBy(xpath = "//span[@class='select2-selection__placeholder']")
	private WebElement btnempty;

	@FindBy(id = "city")
	private WebElement btncity;

	@FindBy(id = "room_type")
	private WebElement roomtype1;

	@FindBy(xpath = "//input[@name='check_in']")
	private WebElement btncheckin;

	@FindBy(xpath = "//a[text()='27']")
	private WebElement btndate;

	@FindBy(xpath = "//input[@name='check_out']")
	private WebElement btncheckout;

	@FindBy(xpath = "//a[text()='29']")
	private WebElement btndate2;

	@FindBy(id = "no_rooms")
	private WebElement noroom;

	@FindBy(id = "no_adults")
	private WebElement noadults;

	@FindBy(id = "no_child")
	private WebElement nochild;

	@FindBy(xpath = "//iframe[@class='iframe']")
	private WebElement framechange;

	@FindBy(xpath = "//button[@class='btn filter_btn']")
	private WebElement btnsearch;

	@FindBy(id = "invalid-state")
	private WebElement textErrorState;

	@FindBy(id = "invalid-city")
	private WebElement textErrorCity;

	@FindBy(id = "invalid-check_in")
	private WebElement textErrorCheckIn;

	@FindBy(id = "invalid-check_out")
	private WebElement textErrorCheckOut;

	@FindBy(id = "invalid-no_rooms")
	private WebElement textErrorNoOfRooms;

	@FindBy(id = "invalid-no_adults")
	private WebElement textErrorNoOdAdults;

	public WebElement getTextErrorCity() {
		return textErrorCity;
	}

	public WebElement getTextErrorCheckIn() {
		return textErrorCheckIn;
	}

	public WebElement getTextErrorCheckOut() {
		return textErrorCheckOut;
	}

	public WebElement getTextErrorNoOfRooms() {
		return textErrorNoOfRooms;
	}

	public WebElement getTextErrorNoOdAdults() {
		return textErrorNoOdAdults;
	}

	public WebElement getTxtusername() {
		return txtusername;
	}

	public WebElement getDdnstate() {
		return ddnstate;
	}

	public WebElement getBtnempty() {
		return btnempty;
	}

	public WebElement getBtncity() {
		return btncity;
	}

	public WebElement getRoomtype1() {
		return roomtype1;
	}

	public WebElement getBtncheckin() {
		return btncheckin;
	}

	public WebElement getBtndate() {
		return btndate;
	}

	public WebElement getBtncheckout() {
		return btncheckout;
	}

	public WebElement getBtndate2() {
		return btndate2;
	}

	public WebElement getNoroom() {
		return noroom;
	}

	public WebElement getNoadults() {
		return noadults;
	}

	public WebElement getNochild() {
		return nochild;
	}

	public WebElement getFramechange() {
		return framechange;
	}

	public WebElement getBtnsearch() {
		return btnsearch;
	}

	public String welcomeMessage() {
		String getLoginSuccessMsgText = getText(txtusername);
		return getLoginSuccessMsgText;

	}

	public void searchHotelWithAllFields(String state, String city, String room, String checkin, String checkout,
			String NoOfRooms, String NoOfAdults, String NoOfChild) throws AWTException, InterruptedException {

		dropdownText(ddnstate, state);
		dropdownText(btncity, city);
		selectRoomtype(room);
		elementSendkeysJs(btncheckin, checkin);
		elementSendkeysJs(btncheckout, checkout);
		dropdownText(noroom, NoOfRooms);
		dropdownText(noadults, NoOfAdults);
		elementSendkeys(nochild, NoOfChild);
		frameSwitchByElement(framechange);
		clickBtn(btnsearch);
		Thread.sleep(6000);
	}

	public void searchHotelWithMandatoryFields(String state, String city, String checkin, String checkout,
			String NoOfRooms, String NoOfAdults) throws InterruptedException {

		dropdownText(ddnstate, state);
		dropdownText(btncity, city);
		elementSendkeysJs(btncheckin, checkin);
		elementSendkeysJs(btncheckout, checkout);
		dropdownText(noroom, NoOfRooms);
		dropdownText(noadults, NoOfAdults);
		frameSwitchByElement(framechange);
		clickBtn(btnsearch);
		Thread.sleep(3000);

	}

	public void clickSearchButton() throws InterruptedException {
		frameSwitchByElement(framechange);
		clickBtn(btnsearch);
		switchToParentFrame();
		Thread.sleep(3000);

	}

	public String stateError() {
		return getText(textErrorState);
	}

	public String cityError() {
		return getText(textErrorCity);
	}

	public String CheckInError() {
		return getText(textErrorCheckIn);
	}

	public String checkOutError() {
		return getText(textErrorCheckOut);
	}

	public String noOfRoomsError() {
		return getText(textErrorNoOfRooms);
	}

	public String noOfAdultsError() {
		return getText(textErrorNoOdAdults);
	}

	public void selectRoomtype(String roomType) {

		String[] split = roomType.split("/");

		for (String s : split) {
			dropdownText(roomtype1, s);

		}

	}

}
