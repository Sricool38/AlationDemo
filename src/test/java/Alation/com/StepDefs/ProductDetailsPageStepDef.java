package Alation.com.StepDefs;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Assert;

import Alation.com.Pages.ProductDetailsPage;
import Alation.com.Pages.Context.ProductDetailsPageContext;
import Alation.com.Pages.Context.SearchPageContext;
import cucumber.api.java.en.And;

public class ProductDetailsPageStepDef {
	ProductDetailsPage pdp = new ProductDetailsPage();
	ProductDetailsPageContext pdpcontext = new ProductDetailsPageContext();
	SearchPageContext searchPageContext = new SearchPageContext();
	ArrayList<String> failureList = new ArrayList<String>();

	/**
	 * For validation purpose extracting product details page details and saving in
	 * context class which having getter setter for all the required fields
	 */
	@And("^verify the product details in product detail page$")
	public void verify_the_product_details_in_product_deatils_page() throws Throwable {
		pdp.isPDPOpen();
		pdpcontext.setProductDesc(pdp.getProductDesc());
		pdpcontext.setProductPaperPrice(pdp.getProductPaperBackPrice());
		pdpcontext.setProductKindlePrice(pdp.getProductKindlePrice());
		pdpcontext.setProductUsedPrice(pdp.getProductUsedPrice());
	}

	/**
	 * To Validate all the fields using verify functions, if any field failed it
	 * won't fail the remaining steps
	 */

	@And("^Validate the product details in PDP with SRP$")
	public void validate_the_product_details_in_pdp_with_srp() throws Throwable {
		verifyData("Comparing the Product Description in both the pages", searchPageContext.getProductDesc(),
				pdpcontext.getProductDesc(), failureList);
		verifyData("Comparing the Product Paperback Price in both the pages", searchPageContext.getProductPaperPrice(),
				pdpcontext.getProductPaperPrice(), failureList);
		verifyData("Comparing the Product Kindle Price in both the pages", searchPageContext.getProductKindlePrice(),
				pdpcontext.getProductKindlePrice(), failureList);
		verifyData("Comparing the Product Used Price in both the pages", searchPageContext.getProductUsedPrice(),
				pdpcontext.getProductUsedPrice(), failureList);

		/*
		 * This block will check the failure lists and display the success message if
		 * no failures
		 */
		Assert.assertTrue("Product Details: [" + Arrays.asList(failureList.toArray()) + "].", failureList.isEmpty());
		if (failureList.isEmpty()) {

			System.out.println("Product Details in both the pages are same :)");
		}

	}

	/*
	 * This is block will provide the customized result to understand which field
	 * failed and which is expected
	 * 
	 * Will get error message like if prod price failed Comparing the Product
	 * Paperback Price in both the pages is not expected, Expected value is XX but
	 * actual value is YY
	 */
	public static ArrayList<String> verifyData(String message, String expectedValue, String actualValue,
			ArrayList<String> failureList) {
		if (!expectedValue.equals(actualValue)) {
			failureList.add(
					message + " is not as expected. Expected [" + expectedValue + "] but was [" + actualValue + "]");
		}
		return failureList;
	}
}
