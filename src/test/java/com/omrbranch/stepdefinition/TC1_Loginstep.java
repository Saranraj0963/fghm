package com.omrbranch.stepdefinition;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;

import com.omrbranch.baseclasss.BaseClass;
import com.pageobjectmanager.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC1_Loginstep extends BaseClass {

	PageObjectManager pom = new PageObjectManager();

	@Given("User is on the OMR branch hotel page")
	public void user_is_on_the_omr_branch_hotel_page() throws FileNotFoundException, IOException {
	}

	@When("User enter {string} and {string}")
	public void user_enter_and(String emailId, String password) throws InterruptedException {
		pom.getLoginPage().login(emailId, password);

	}

	@Then("User should verify success message after login {string}")
	public void user_should_verify_success_message_after_login(String actualLoginMsg) {

		String actLoginSuccessMsgText = pom.getSearchHotelPage().welcomeMessage();
		Assert.assertEquals("verify", actualLoginMsg, actLoginSuccessMsgText);
	}

	@When("User enter {string} and {string} with Enter key")
	public void user_enter_and_with_enter_key(String emailId, String password) throws AWTException {
		pom.getLoginPage().loginEnter(emailId, password);

	}

	@Then("User should verify error message after login {string}")
	public void user_should_verify_error_message_after_login(String string) {
		pom.getLoginPage().getLoginErrorMsgText();
	}

}
