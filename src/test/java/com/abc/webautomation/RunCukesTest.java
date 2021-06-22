package com.abc.webautomation;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//features = "src/test/resources/features",
		features = "src/test/resources/features",
		glue = {"com.abc.webautomation"},
		dryRun = false,
		plugin = {
						"html:target/cucumber-html-report"
		                
		        }
		)
public class RunCukesTest {

}
