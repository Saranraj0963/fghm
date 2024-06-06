package omr.branch.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {

	public static void generateJvmReport(String jsonFile) {

		File file= new File("C:\\Users\\Admin\\eclipse-workspace\\OmrBranchHotelBookingAutomation\\target");
		
		Configuration config= new Configuration(file, "OMR Branch Automation");
		config.addClassifications("Browser", "Chrome");
		config.addClassifications("Version", "123");
		config.addClassifications("OS", "Win11");
		config.addClassifications("Sprint", "Saran");
		
		List<String> jsonFiles= new ArrayList<String>();
		jsonFiles.add(jsonFile);
		ReportBuilder builder= new ReportBuilder(jsonFiles, config);
		
		builder.generateReports();
	}
}
