package Alation.com.StepDefs;

import Alation.com.Pages.SearchResultPage;
import Alation.com.Pages.Context.SearchPageContext;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class SearchResultPageStepDef {
	SearchResultPage searchResultPage = new SearchResultPage();
	SearchPageContext searchPageContext = new SearchPageContext();

	/**
	 * This blocks will define the steps behavior and can reuse this steps for any
	 * values which is passing from feature
	 */
	@Then("^I should be directed to the search results of (.*)$")
	public void i_should_be_directed_to_the_search_results(String item) throws Throwable {
		/**
		 * Assert here to conform the page navigation to required page otherwise will
		 * throw the customized error message
		 */
		Assert.assertTrue("The Search Result page not opened for the item.", searchResultPage.isSearchPageOpen(item));
	}

	/**
	 * For validation purpose extracting search result page details and saving in
	 * context class which having getter setter for all the required fields
	 */
	@And("^verify the product details in search result page$")
	public void verify_the_product_details_in_search_result_page() throws Throwable {
		String ProductDesc = searchResultPage.getProductDesc();
		searchPageContext.setProductDesc(ProductDesc);
		searchPageContext.setProductPaperPrice(searchResultPage.getProductPaperBackPrice());
		searchPageContext.setProductKindlePrice(searchResultPage.getProductKindlePrice());
		searchPageContext.setProductUsedPrice(searchResultPage.getProductUsedPrice());
	}

	@Then("^select the first available product in the page$")
	public void select_the_first_available_product_in_the_page() throws Throwable {
		searchResultPage.clickProdDesc();
	}

}
