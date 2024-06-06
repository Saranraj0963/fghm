package com.omrbranch.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclasss.BaseClass;

public class BookingConfirmationPage extends BaseClass{
	
	public BookingConfirmationPage() {

		PageFactory.initElements(driver, this);
	
	}
	public static String orderID;
	@FindBy(xpath = "//h2[@name='booking-code']//strong")
	private WebElement orderId;
	
	@FindBy(xpath = "//h2[@name='booking-code']")
	private WebElement textBookingId;
	
	@FindBy(xpath = "//div[@class='seccess-box text-center']/p")
	private WebElement textSuccesMessage;
	
	@FindBy(xpath = "//a[@data-testid='username']")
	private WebElement btnWelcome;
	
	@FindBy(xpath = "//a[text()='My Account']")
	private WebElement btnMyAccount;
	
	@FindBy(xpath = "//div[@class='seccess-box text-center']/p")
	private WebElement textHotelName;
	
	@FindBy(xpath = "//h2[@name='booking-code']")
	private WebElement textBookingIsConfirmed;

	public WebElement getOrderId() {
		return orderId;
	}

	public WebElement getTextBookingId() {
		return textBookingId;
	}

	public WebElement getTextSuccesMessage() {
		return textSuccesMessage;
	}

	public WebElement getBtnWelcome() {
		return btnWelcome;
	}

	public WebElement getBtnMyAccount() {
		return btnMyAccount;
	}

	public WebElement getTextHotelName() {
		return textHotelName;
	}

	public WebElement getTextBookingIsConfirmed() {
		return textBookingIsConfirmed;
	}
	
	public String saveOrderId() {
		return orderID =getText(orderId);
	}

	public String hotelNameInBookingPage() {
		return getText(textHotelName);
	}

	public String hotelNameInSelectPage() {
		return SelectHotelPage.firsthotel;
	}
	
	public String expectedbookingmsg() {

		String string = getText(textBookingIsConfirmed);
		String[] split = string.split(" ");
		String res= "";
		for (int i = 1; i < split.length; i++) {
			
			res= res+ split[i]+ " ";
		}
		
		String trim = res.trim();
		return trim;
		
	}
	
	public String hotelNamewithoutHotelType() {

		String firsthotel = SelectHotelPage.firsthotel;
		String[] split = firsthotel.split(" ");
		String onlyHotelname= "";
		return onlyHotelname+ split[0];
		
	}
	
	public boolean veriyTheSameHotelNameIsBooked() {
		return hotelNameInBookingPage().contains(hotelNameInSelectPage());
	}
	

	public void toMyAccountPage() {
	
		clickBtn(btnWelcome);
		clickBtn(btnMyAccount);

	}
	
	
}
