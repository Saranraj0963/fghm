package com.omrbranch.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import omr.branch.report.Reporting;

@RunWith(Cucumber.class)
@CucumberOptions( plugin = { "pretty",
		"json:target/omrhotelbooking.json" }, dryRun = false, glue = "com.omrbranch.stepdefinition", features = "src//test//resources//Features")
public class TestRunnerClass {

	@AfterClass
	public static void reportGenerate() {

		Reporting.generateJvmReport(
				"C:\\Users\\Admin\\eclipse-workspace\\OmrBranchHotelBookingAutomation\\target\\omrhotelbooking.json");
	}

}
