package com.omrbranch.pages;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclasss.BaseClass;

public class LoginPage extends BaseClass {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(id="email")
	private WebElement txtEmail; 
	
	@FindBy(id="pass")
	private WebElement txtPass; 
	
	@FindBy(xpath="//button[@value='login']")
	private WebElement btnLogin; 
	
	@FindBy(id="errorMessage")
	private WebElement txtErrorMsg; 

	public WebElement getTextErrorMsg() {
		return txtErrorMsg;

	}
	
	public WebElement getTextEmail() {
		return txtEmail;
	}
	
	public WebElement getTextPass() {
		return txtPass;
	}
	
	public WebElement getBtn() {
		return btnLogin;
	}
	
	public void login(String email, String password) throws InterruptedException {
		
		elementSendkeys(txtEmail, email);
		elementSendkeys(txtPass, password);
		clickBtn(btnLogin);
		Thread.sleep(5000);
	}
	public void loginEnter(String emailId, String password) throws AWTException {
		elementSendkeys(txtEmail, emailId);
		elementSendkeys(txtPass, password);
		pressEnter();	
	}
	public String getLoginErrorMsgText() {

		String getText = getText(txtErrorMsg);
		return getText;
		
	}

}
