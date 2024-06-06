package com.omrbranch.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclasss.BaseClass;

public class BookHotelPage extends BaseClass {

	public BookHotelPage() {
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//a[@id='step1']")
	private WebElement scrollDown;
	
	@FindBy(xpath = "//input[@id='own']")
	private WebElement btnown;
	
	@FindBy(xpath = "//select[@id='user_title']")
	private WebElement ddnSaluation;
	
	@FindBy(xpath="(//input[@name='first_name'])[1]")
	private WebElement firstname;

	@FindBy(xpath="(//input[@name='last_name'])[1]")
	private WebElement lastname;
	
	@FindBy(xpath="//input[@id='user_phone']")
	private WebElement phno;
	
	@FindBy(xpath="//input[@id='user_email']")
	private WebElement email;
	
	@FindBy(id="gst")
	private WebElement entergst;
	
	@FindBy(id="gst_registration")
	private WebElement regno;
	
	@FindBy(id="company_name")
	private WebElement name;
	
	@FindBy(id="company_address")
	private WebElement address;
	
	@FindBy(xpath="//BUTTON[@ID='step1next']")
	private WebElement btnnxt;
	
	@FindBy(id="early")
	private WebElement request;
	
	@FindBy(xpath = "//textarea[@id='other_request']")
	private WebElement specialrequest;
	
	@FindBy(xpath = "//button[@id='step1next']")
	private WebElement btnNextInGstDetailsPage;
	
	@FindBy(xpath = "//button[@id='step2next']")
	private WebElement btnNextInspecialRequestPage;
	
	@FindBy(xpath = "//div[@class='credit-card pm']")
	private WebElement btnCreditCard;
	
	@FindBy(xpath = "//select[@id='payment_type']")
	private WebElement ddnCard;
	
	@FindBy(xpath = "//select[@id='card_type']")
	private WebElement ddnCardType;
	
	@FindBy(xpath = "//input[@id='card_no']")
	private WebElement txtCardNo;
	
	@FindBy(xpath = "//input[@id='card_name']")
	private WebElement txtCardName;
	
	@FindBy(xpath = "//select[@id='card_month']")
	private WebElement ddnCardMonth;
	
	@FindBy(id = "card_year")
	private WebElement ddnCardYear;
	
	@FindBy(xpath = "//input[@id='cvv']")
	private WebElement txtCvv;
	
	@FindBy(xpath = "//button[@id='submitBtn']")
	private WebElement btnSubmit;
	
	@FindBy(id = "invalid-payment_type")
	private WebElement textCardTypeError;
	
	@FindBy(id = "invalid-card_type")
	private WebElement textCardError;
	
	@FindBy(id = "invalid-card_no")
	private WebElement textNumberError;
	
	@FindBy(id = "invalid-card_name")
	private WebElement textNameError;
	
	@FindBy(xpath = "//div[@class='upi pm']")
	private WebElement btnUpi;
	
	@FindBy(id = "upi_id")
	private WebElement txtupi;
	
	public WebElement getBtnCreditCard() {
		return btnCreditCard;
	}

	public void getBtnUpi() {
		clickBtn(btnUpi);
	}


	public WebElement getTxtupi() {
		return txtupi;
	}


	public WebElement getTextErrorUpi() {
		return textErrorUpi;
	}

	@FindBy(id = "invalid-upi")
	private WebElement textErrorUpi;
	
	public WebElement getBtnown() {
		return btnown;
	}


	public WebElement getTxtCardName() {
		return txtCardName;
	}


	public WebElement getTextCardTypeError() {
		return textCardTypeError;
	}


	public WebElement getTextCardError() {
		return textCardError;
	}


	public WebElement getTextNumberError() {
		return textNumberError;
	}


	public WebElement getTextNameError() {
		return textNameError;
	}


	public WebElement getTextDateError() {
		return textDateError;
	}


	public WebElement getTextCvvError() {
		return textCvvError;
	}

	@FindBy(id = "invalid-card_month")
	private WebElement textDateError;
	
	@FindBy(id = "invalid-cvv")
	private WebElement textCvvError;

	
	public WebElement getAlertok() {
		return btnown;
	}


	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getPhno() {
		return phno;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getEntergst() {
		return entergst;
	}

	public WebElement getRegno() {
		return regno;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getScrollDown() {
		return scrollDown;
	}


	public WebElement getDdnSaluation() {
		return ddnSaluation;
	}


	public WebElement getSpecialrequest() {
		return specialrequest;
	}


	public void getBtnNextInGstDetailsPage() {
		clickBtn(btnNextInGstDetailsPage);
	}


	public void getBtnNextInspecialRequestPage() {
		clickBtn(btnNextInspecialRequestPage);
	}


	public WebElement getBtnCrediCard() {
		return btnCreditCard;
	}


	public WebElement getDdnCard() {
		return ddnCard;
	}


	public WebElement getDdnCardType() {
		return ddnCardType;
	}


	public WebElement getTxtCardNo() {
		return txtCardNo;
	}


	public WebElement getTxtCaedName() {
		return txtCardName;
	}


	public WebElement getDdnCardMonth() {
		return ddnCardMonth;
	}


	public WebElement getDdnCardYear() {
		return ddnCardYear;
	}


	public WebElement getTxtCvv() {
		return txtCvv;
	}


	public WebElement getBtnSubmit() {
		return btnSubmit;
	}


	public WebElement getAddress() {
		return address;
	}

	public WebElement getBtnnxt() {
		return btnnxt;
	}

	public WebElement getRequest() {
		return request;
	}


	public WebElement getTextBookHotel() {
		return textBookHotel;
	}

	@FindBy(xpath = "//h2[contains(text(),'Book Hotel')]")
	private WebElement textBookHotel;

	public String expectedBookHotel() {
		return getText(textBookHotel);
	}
	
	public void addGuestDetails(String salutation, String firstName, String lastName, String mobileNo, String Email) {
		scrolldown(scrollDown);
		clickBtn(btnown);
		dropdownText(ddnSaluation, salutation);
		elementSendkeys(firstname, firstName);
		elementSendkeys(lastname, lastName);
		elementSendkeys(phno, mobileNo);
		elementSendkeys(email, Email);

	}

	public void addGstDetails(String registrationNo, String companyName, String companyAddress) {
		clickBtn(entergst);
		elementSendkeys(regno, registrationNo);
		elementSendkeys(name, companyName);
		elementSendkeys(address, companyAddress);
		clickBtn(btnNextInGstDetailsPage);

	}

	public void addSpecialRequest(String specialRequest) throws InterruptedException {
		clickBtn(request);
		elementSendkeys(specialrequest, specialRequest);
		clickBtn(btnNextInspecialRequestPage);

	}

	public void addPaymentDetails(String card, String cardType, String cardNumber, String cardName, String month,
			String year, String cvv) {
		clickBtn(btnCreditCard);
		dropdownText(ddnCard, card);
		dropdownText(ddnCardType, cardType);
		elementSendkeys(txtCardNo, cardNumber);
		elementSendkeys(txtCardName, cardName);
		dropdownText(ddnCardMonth, month);
		dropdownText(ddnCardYear, year);
		elementSendkeys(txtCvv, cvv);
		clickBtn(btnSubmit);
		
	}

	public void clickNextTillPayment() {
		
		if(btnNextInGstDetailsPage.isDisplayed()) {
			clickBtn(btnNextInGstDetailsPage);
			
		}
			if(btnNextInspecialRequestPage.isDisplayed()){
				clickBtn(btnNextInspecialRequestPage);
		
			}				
		//clickBtn(btnNextInGstDetailsPage);
		//clickBtn(btnNextInspecialRequestPage);
	}

	public void clickNextInGstDetailsPage() {
		
		clickBtn(btnNextInGstDetailsPage);
		
		//if(btnNextInGstDetailsPage.isDisplayed()) {
		//clickBtn(btnNextInGstDetailsPage);
		
		}
		//if(btnNextInspecialRequestPage.isDisplayed()){
			//clickBtn(btnNextInspecialRequestPage);

	public void clickNextInSpecialRequestPage() {
		
		if(btnNextInspecialRequestPage.isDisplayed()){
			clickBtn(btnNextInspecialRequestPage);
	}
	}
	public void clickCreditCard() {
		clickBtn(btnCreditCard);

	}
	public void clickSubmitWithoutAnyDetails() {
		
		clickBtn(btnSubmit);
	}
	public String getCardTypeError() {
		return getText(textCardTypeError);
	}

	public String getCardError() {
		return getText(textCardError);
	}

	public String getCardNumberError() {
		return getText(textNumberError);
	}

	public String getCardNameError() {
		return getText(textNameError);
	}

	public String getDateError() {
		return getText(textDateError);
	}

	public String getCvvError() {
		return getText(textCvvError);
	}


	public void userEnterUpi(String upi) {

		clickBtn(btnUpi);
		elementSendkeys(txtupi, upi);
		clickBtn(btnSubmit);
	}
	
	public void clickupi() {

		clickBtn(btnUpi);
	}
	
	public String getUpierror() {
		return getText(textErrorUpi);
	
	}
	
	
}
