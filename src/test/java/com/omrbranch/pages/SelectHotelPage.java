package com.omrbranch.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclasss.BaseClass;

public class SelectHotelPage extends BaseClass {

	public  SelectHotelPage() {

		PageFactory.initElements(driver, this);

	}
	public static String firsthotel;
	public static String firstprice;
	public static String lasthotel;
	public static String lastprice;
	
	@FindBy(xpath="(//div[@class='col-md-5 hotel-suites'])[1]//h5")
	private WebElement textgetFirsthotelName;
	
	@FindBy(xpath="(//div[@class=\"col-md-5 hotel-suites\"])[6]")
	private List<WebElement> textgetLasthotelName;
	
	@FindBy(xpath="(//div[@class='prize']/strong)[1]")
	private WebElement textgetFirstHotelPrice;
	
	@FindBy(xpath="(//strong[@class='total-prize'])[6]")
	public List<WebElement> textgetlastHotelPrice;
	
	@FindBy(xpath = "//h5[text()='Select Hotel']")
	private WebElement textselecthotel;

	public List<WebElement> getTextgetLasthotelName() {
		return textgetLasthotelName;
	}

	public WebElement getTextAllRoomType() {
		return textAllRoomType;
	}

	public List<WebElement> getBtnLastContinue() {
		return btnLastContinue;
	}
	@FindBy(xpath = "(//div[@class='col-md-5 hotel-suites'])[1]/h5")
	private WebElement textHotelName;

	@FindBy(xpath = "((//div[@class='prize'])/strong)[1]")
	private WebElement textPrize;

	@FindBy(xpath = "(//a[text()='Continue'])[1]")
	private WebElement btncontinue;
	
	@FindBy(xpath = "//a[@id='room_type']")
	private WebElement textAllRoomType;
	
	@FindBy(xpath = "//a[text()='Continue']")
	private List<WebElement> btnLastContinue;
	
	public static String getFirsthotel() {
		return firsthotel;
	}

	public static String getLasthotel() {
		return lasthotel;
	}

	public WebElement getTextgetFirsthotelName() {
		return textgetFirsthotelName;
	}

	public List<WebElement> getTextLasthotelName() {
		return textgetLasthotelName;
	}

	public WebElement getTextgetFirstHotelPrice() {
		return textgetFirstHotelPrice;
	}

	public List<WebElement> getTextgetlastHotelPrice() {
		return textgetlastHotelPrice;
	}

	public static String getFirstprice() {
		return firstprice;
	}

	public WebElement getTextgetfirsthotelName() {
		return textgetFirsthotelName;
	}

	public WebElement getTextgetFirstPrice() {
		return textgetFirstHotelPrice;
	}
	
	public List<WebElement> getTextLastHotelPrice() {
		return textgetlastHotelPrice;
	}
	
	@FindBy(xpath = "//label[@for='value_pltoh']")
	private WebElement LowToHigh;
	
	@FindBy(xpath = "//label[@for='value_phtol']")
	private WebElement HighToLow;
	
	@FindBy(xpath = "//label[@for='value_nasc']")
	private WebElement NameAscending;
	
	@FindBy(xpath = "//label[@for='value_ndesc']")
	private WebElement NameDescending;
	
	@FindBy(xpath = "//strong[@class='total-prize']")
	private List<WebElement> textAllHotelPrize;
	
	@FindBy(xpath = "(//div[@class='col-md-5 hotel-suites'])/h5")
	private List<WebElement> textAllHotelName;

	public static String getLasthotelName() {
		return lasthotel;
	}

	public static String getLastprice() {
		return lastprice;
	}
	
	public WebElement getLowToHigh() {
		return LowToHigh;
	}

	public WebElement getHighToLow() {
		return HighToLow;
	}

	public WebElement getNameAscending() {
		return NameAscending;
	}

	public WebElement getNameDescending() {
		return NameDescending;
	}

	public List<WebElement> getTextAllHotelPrize() {
		return textAllHotelPrize;
	}

	public List<WebElement> getTextAllHotelName() {
		return textAllHotelName;
	}

	public WebElement getTextselecthotel() {
		return textselecthotel;
	}

	public WebElement getTextHotelName() {
		return textHotelName;
	}

	public WebElement getTextPrize() {
		return textPrize;
	}

	public WebElement getBtncontinue() {
		return btncontinue;
	}

	public String expectedSelecHotelMessage() {
		return getText(textselecthotel);
	
	}
	
	public void clickLowToHigh() throws InterruptedException {

		clickBtn(LowToHigh);
		Thread();
	}

	public void clickHighToLow() throws InterruptedException {

		clickBtn(HighToLow);
		Thread();

	}
	
	public void clickNameAscending() throws InterruptedException {

		clickBtn(NameAscending);
		Thread();

	}
	
	public void clickNameDescending() throws InterruptedException {
		clickBtn(NameDescending);
		Thread();
	}
	
	public boolean verifyLowPriceToHigh() {
		List<Integer> dev= new ArrayList<Integer>();
		for (int i = 0; i < textAllHotelPrize.size(); i++) {
			WebElement webElement = textAllHotelPrize.get(i);
			String text = webElement.getText();
			String substring = text.substring(2);
			String replace = substring.replace(",","");
			int int1 = Integer.parseInt(replace);
			dev.add(int1);
		}
		System.out.println(dev);
		List<Integer> qa= new ArrayList<>();
		qa.addAll(dev);
		Collections.sort(qa);
		System.out.println(qa);
		return qa.equals(dev);
	}
	
	public boolean verifyHighPriceToLow() {
		List<Integer> dev= new ArrayList<Integer>();
		for (int i = 0; i < textAllHotelPrize.size(); i++) {
			WebElement webElement = textAllHotelPrize.get(i);
			String text = webElement.getText();
			String substring = text.substring(2);
			String replace = substring.replace(",","");
			int int1 = Integer.parseInt(replace);
			dev.add(int1);
		}
		
		List<Integer> qa= new ArrayList<>();
		qa.addAll(dev);
		Collections.sort(qa);
		Collections.reverse(qa);
		
		return qa.equals(dev);
	}
	
	public boolean verifyAscendingOrder() {

		List<String> dev= new ArrayList<>();
		for (WebElement name : textAllHotelName) {
			
			String text = name.getText();
			dev.add(text);
		}
		List<String> qa= new ArrayList<>();
		qa.addAll(dev);
		Collections.sort(qa);
		return qa.equals(dev);
		
	}
	
	public boolean verifyDescendingOrder() {

		List<String> dev= new ArrayList<>();
		for (WebElement name : textAllHotelName) {
			
			String text = name.getText();
			dev.add(text);
		}
		List<String> qa= new ArrayList<>();
		qa.addAll(dev);
		Collections.sort(qa);
		Collections.reverse(qa);
		return qa.equals(dev);

	}
	
	public boolean verifyThatAllListedHotelInSameRoomType(String roomType) {
		List<Boolean> b = new ArrayList<>();
		for (int i = 0; i < textAllHotelName.size(); i++) {
			WebElement webElement = textAllHotelName.get(i);
			String text = webElement.getText();
			boolean contains = text.contains(roomType);
			b.add(contains);
		}
		return b.contains(false);

	}
	
	public String verifyThatHeaderContainsroomType() {
		return getText(textAllRoomType);
		
	}

	public String textFirstHotelName() {
		return firsthotel = getText(textgetFirsthotelName);
	}

	public String textFirstHotelPrice() {
		return firstprice = getText(textgetFirstHotelPrice);
	}

	public void clickFirstHotelContinue() {
		clickBtn(btncontinue);
		alertAccept();
	}

	public String textLastHotelName() {
		WebElement webElement = textAllHotelName.get(textAllHotelName.size() - 1);
		return lasthotel = getText(webElement);
	}

	public String textLastHotelPrice() {
		WebElement webElement = textAllHotelPrize.get(textAllHotelPrize.size() - 1);
		return lastprice = getText(webElement);
	}

	public void clickLastHotelContinue() {
		WebElement webElement = btnLastContinue.get(btnLastContinue.size() - 1);
		clickBtn(webElement);
		alertAccept();
	}

	
}
