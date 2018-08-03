package Alation.com.StepDefs;

import Alation.com.Pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class HomePageStepDef {
	HomePage homePage = new HomePage();

	/*
	 * This blocks will define the steps behavior and can reuse this steps for any
	 * values which is passing from feature
	 */
	@When("^change the search category to '(.*)'$")
	public void change_the_search_category(String item) throws Throwable {
		homePage.SelectCategory(item);
	}

	@And("^I search item (.*)$")
	public void i_search_item(String text) throws Throwable {
		homePage.SearchText(text);
		homePage.Submit();
	}

}
