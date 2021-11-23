package com.TestRunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.Adactin.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\test\\java\\adactinfeature\\adactin.feature",
		glue="com.StepDef",
		monochrome=true,
		dryRun=false,
		strict=true,
//		tags={"@smokeTest,@sanityTest"}
		plugin= {
				"html:report/html report",
				"pretty",
				"json:Json Report/file.json",
				"com.cucumber.listener.ExtendCumcumberFormatter:cumcumber report/report.html"
		
		}
		)

public class Testrun {
	public static WebDriver P;
	@BeforeClass
	public static void setup() {
    P=BaseClass.browser("chrome");
    
	}
	
	@AfterClass
	public static void teardown() {
    P.quit();
	}

}
