package Alation.com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Alation.com.Pages.Factory.DriverFactory;

public class SearchResultPage extends DriverFactory {
	public static String search_result_page_main_display = "search_result_page_main";
	public static String search_result_page_prod_desc = "search_result_page_prod_desc";
	public static String search_result_page_prod_paper_price_whole = "search_result_page_prod_paper_price_whole";
	public static String search_result_page_prod_paper_price_currency = "search_result_page_prod_paper_price_currency";
	public static String search_result_page_prod_paper_price_fractional = "search_result_page_prod_paper_price_fractional";
	public static String search_result_page_prod_used_price = "search_result_page_prod_paper_price_more";

	/* Code will wait for the page to load and confirm the page open */
	public boolean isSearchPageOpen(String item) {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement searchResult = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.id(getLocator(search_result_page_main_display))));
		boolean result = searchResult.getText().equalsIgnoreCase(item);
		return result;
	}

	public String getProductDesc() {
		String productDesc = driver.findElement(By.cssSelector(getLocator(search_result_page_prod_desc))).getText();
		return productDesc;
	}

	/*
	 * For easy compare of price field to product details page need to frame the
	 * price field and getting the first product details using get(0) using
	 * findElements functions
	 */
	public String getProductPaperBackPrice() {
		String paperBackWholePrice = driver
				.findElements(By.cssSelector(getLocator(search_result_page_prod_paper_price_whole))).get(0).getText();
		String paperBackCurrency = driver
				.findElements(By.cssSelector(getLocator(search_result_page_prod_paper_price_currency))).get(0)
				.getText();
		String paperBackFracPrice = driver
				.findElements(By.cssSelector(getLocator(search_result_page_prod_paper_price_fractional))).get(0)
				.getText();
		String paperBackPrice = paperBackCurrency + paperBackWholePrice + "." + paperBackFracPrice;
		return paperBackPrice;
	}

	/*
	 * Can customize this block depends on the product we are going to select,it
	 * will work for the first product available
	 */
	public String getProductKindlePrice() {
		String kindleWholePrice = driver
				.findElements(By.cssSelector(getLocator(search_result_page_prod_paper_price_whole))).get(1).getText();
		String kindleCurrency = driver
				.findElements(By.cssSelector(getLocator(search_result_page_prod_paper_price_currency))).get(1)
				.getText();
		String kindleFracPrice = driver
				.findElements(By.cssSelector(getLocator(search_result_page_prod_paper_price_fractional))).get(1)
				.getText();
		String kindlePrice = kindleCurrency + kindleWholePrice + "." + kindleFracPrice;
		return kindlePrice;

	}

	public String getProductUsedPrice() {
		String usedPrice = driver.findElements(By.cssSelector(getLocator(search_result_page_prod_used_price))).get(0)
				.getText();
		return usedPrice;
	}

	public void clickProdDesc() {
		driver.findElement(By.cssSelector(getLocator(search_result_page_prod_desc))).click();
	}
}
