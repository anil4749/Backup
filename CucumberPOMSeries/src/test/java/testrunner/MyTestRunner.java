package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = {"src/test/resources/AppFeatures"},
	glue = {"stepdefination","AppHooks"},
	plugin = {"pretty",
			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
			
			},
	
	monochrome = true
//	plugin = {"pretty",
//			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
//			"timeline:test-output-thread/"
//
//			
//	}
	//dryRun = true
	
)

public class MyTestRunner {




}
