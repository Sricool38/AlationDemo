package Alation.com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Alation.com.Pages.Factory.DriverFactory;

public class ProductDetailsPage extends DriverFactory {
	private static String product_details_page_land = "product_details_page_main";
	private static String product_details_page_desc = "product_details_page_desc";
	private static String product_details_page_paper_price = "product_details_page_paperback_price";
	private static String product_details_page_kindle_price = "product_details_page_kindle_price";
	private static String product_details_page_used_price = "product_details_page_used_price";

	public boolean isPDPOpen() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement pdpMain = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.id(getLocator(product_details_page_land))));
		return pdpMain.isDisplayed();
	}

	public String getProductDesc() {
		String productDesc = driver.findElement(By.id(getLocator(product_details_page_desc))).getText();
		return productDesc;
	}

	public String getProductPaperBackPrice() {
		String paperBackPrice = driver.findElement(By.cssSelector(getLocator(product_details_page_paper_price)))
				.getText();
		return paperBackPrice;
	}

	public String getProductKindlePrice() {
		String kindlePrice = driver.findElement(By.cssSelector(getLocator(product_details_page_kindle_price)))
				.getText();
		return kindlePrice;

	}

	public String getProductUsedPrice() {
		String usedPrice = driver.findElement(By.cssSelector(getLocator(product_details_page_used_price))).getText();
		return usedPrice;
	}
}
