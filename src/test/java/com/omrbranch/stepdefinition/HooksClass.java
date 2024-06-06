package com.omrbranch.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;


import com.omrbranch.baseclasss.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HooksClass extends BaseClass {
	
	
	@Before
	public void beforeScenario() throws FileNotFoundException, IOException {

		browserLaunch(getpropertyFilevalue("browser"));
		applnUrl(getpropertyFilevalue("url"));
		applnMaximize();
		implicitWait();
		
	}
	@After
	public void afterScenario(Scenario scenario) {

		scenario.attach(screenshot(),"images/png","Every Scenario");
		closeWindow();
		
	}

}
