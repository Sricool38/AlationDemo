package Alation.com.Acceptancetest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
/*This is a Runner class for this framework and here we are mentioning the Features file
 * and StepDefination location and where to store the reports 
 * and run the particular scenarios using tags */

@RunWith(Cucumber.class)
@CucumberOptions(glue = { "Alation.com" }, features = "src/test/resources/features", format = { "pretty",
		"html:target/cucumber-reports", "json:target/cucumber-reports/cucumber.json" }, tags = { "@Test" })
public class AllTest {

}
