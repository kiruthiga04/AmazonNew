package com.omrbranch.reports;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {
	public static void generateJvmReport(String jsonFile)
	{
		File file = new File("C:\\Users\\My PC\\eclipse-workspace\\Kiruthiga\\Cucumber\\target");
		Configuration configuration = new Configuration(file,"Omrpage Automation");
		configuration.addClassifications("Browser", "Chrome");
		configuration.addClassifications("Browser version", "123");
		configuration.addClassifications("OS", "Windows 11");
		
		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(jsonFile);
		
		ReportBuilder builder = new ReportBuilder(jsonFiles,configuration);
		builder.generateReports();
	}

}
