package com.omrbranch.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclasss.BaseClass;

public class MyBookingPage extends BaseClass{
	
	public MyBookingPage() {

		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath="(//div[@class='col-md-5'])[1]")
	private WebElement prntbooking;
	
	@FindBy(xpath = "(//div[@class='room-code']//span)[1]")
	private WebElement textBookingId;
	
	@FindBy(xpath = "(//div[@class='col-md-7 mobile-space-none']//h5)[1]")
	private WebElement textHotelName;
	
	@FindBy(xpath = "(//strong[@class='total-prize'])[1]")
	private WebElement textPrize;
	
	@FindBy(xpath = "(//button[@type='submit'])[1]")
	private WebElement btnEdit;
	
	@FindBy(xpath = "//input[@name='check_in']")
	private WebElement txtCheckInDate;
	
	@FindBy(xpath = "//li[@class='alertMsg']")
	private WebElement textUpdateMessage;
	
	public WebElement getPrntbooking() {
		return prntbooking;
	}

	public WebElement getTextBookingId() {
		return textBookingId;
	}

	public WebElement getTextHotelName() {
		return textHotelName;
	}

	public WebElement getTextPrize() {
		return textPrize;
	}

	public WebElement getBtnEdit() {
		return btnEdit;
	}

	public WebElement getTxtCheckInDate() {
		return txtCheckInDate;
	}

	public WebElement getTextUpdateMessage() {
		return textUpdateMessage;
	}

	public WebElement getTextCancelMessage() {
		return textCancelMessage;
	}

	public WebElement getTxtSearch() {
		return txtSearch;
	}

	public List<WebElement> getTextAllIds() {
		return textAllIds;
	}

	public WebElement getBtnConfirm() {
		return btnConfirm;
	}

	public List<WebElement> getBtnCancel() {
		return btnCancel;
	}

	@FindBy(xpath = "//li[@class='alertMsg']")
	private WebElement textCancelMessage;
	
	@FindBy(xpath = "//input[@name='search']")
	private WebElement txtSearch;
	
	@FindBy(xpath = "(//div[@class='room-code']//span)")
	private List<WebElement> textAllIds;
	
	@FindBy(xpath = "//button[text()='Confirm']")
	private WebElement btnConfirm;
	
	@FindBy(xpath = "//a[text()='Cancel']")
	private List<WebElement> btnCancel;
	
	
	public String expectedBookingmsg() {
		return getText(prntbooking);

	}

	public void searchorderid() {

		String text = getText(textBookingId);
		elementSendKeysandEnter(txtSearch, text);
		String orderID = BookingConfirmationPage.orderID;
		//elementSendKeysandEnter(txtSearch, orderID);
	}
	
	public void searchorderbyIn(String string) {

		elementSendKeysandEnter(txtSearch, string);
	}
	
	public String searchOrder() {
		String text = getText(textBookingId);
		return text;

	}

	public boolean getFirstOrderId() {

		WebElement webElement = textAllIds.get(0);
		String text = webElement.getText();
		boolean equals = text.equals(searchOrder());
		return equals;
		
	}
	
	public boolean verifyTheSameBookedHotelNameIsPresent() {
		String hotelNameInMyBookingPage = getText(textHotelName);
		String hotelNameInSelecHotelPage = SelectHotelPage.firsthotel;
		return hotelNameInMyBookingPage.contains(hotelNameInSelecHotelPage);
	}

	public String hotelPriceInSelectPage() {
		String price = SelectHotelPage.firstprice;
	
				String substring = price.substring(2);
				System.out.println(substring);
				return substring;
	}

	public String hotelPriceInMyBookingPage() {
		  String text = getText(textPrize);
		  String substring = text.substring(3);
		  System.out.println(substring);
		  
		  return substring;
	}

	public boolean verifySameBookedHotelPriceIsPresent() {
		return hotelPriceInMyBookingPage().contains(hotelPriceInSelectPage());
	}

	public void modifyChechInDate(String modifyDate) {
		clickBtn(btnEdit);
		elementSendkeysJs(txtCheckInDate, modifyDate);
		clickBtn(btnConfirm);
	}

	public String expectedBookingSuccessMessage() {
		return getText(textUpdateMessage);
	}

	public void cancelBooking() {
		WebElement webElement = btnCancel.get(0);
		clickBtn(webElement);
		alertAccept();
	}

	public String expectedCancelSuccessMessage() {
		return getText(textCancelMessage);
	}

	
}
