package com.omrbranch.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.omrbranch.reports.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin={"pretty","json:target//output.json"},glue="com.omrbranch.stepdefinition",features="src\\test\\resources")
public class TestRunnerClass {
	@AfterClass
	public static void afterClass()
	{
		Reporting.generateJvmReport("C:\\\\Users\\\\My PC\\\\eclipse-workspace\\\\Kiruthiga\\\\Cucumber\\\\target\\\\output.json");
	}
	
	
	
	

}
