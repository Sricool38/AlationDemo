package Alation.com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Alation.com.Pages.Factory.DriverFactory;

public class HomePage extends DriverFactory {
	public static String URL = "https://www.amazon.com";
	public static String home_page_main = "home_page_global_nav";
	public static String home_page_search_drop_down = "home_page_search_drop";
	public static String home_page_search_text = "home_page_search_text";
	public static String home_page_submit_button = "home_page_submit";

	public void Open() {
		driver.get(URL);
	}

	/* To verify whether browser launched the required url */
	public boolean isOpen() {
		String currentUrl = driver.getCurrentUrl();
		String siteUrl = URL;
		return currentUrl.equals(siteUrl);
	}

	/*
	 * Waiting for the site to load using particular variable and using Explicit
	 * wait to avoid unwanted wait
	 */
	public boolean waitUntilOpened() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement nav = wait.until(ExpectedConditions.presenceOfElementLocated(By.id(getLocator(home_page_main))));
		return nav.isDisplayed();
	}

	/* Can use this step for whatever category given in Feature */
	public void SelectCategory(String text) {
		Select dropdown = new Select(driver.findElement(By.id(getLocator(home_page_search_drop_down))));
		dropdown.selectByVisibleText(text);
	}

	/* Can use this step for whatever product given in Feature */
	public void SearchText(String text) {
		WebElement searchbox = driver.findElement(By.id(getLocator(home_page_search_text)));
		searchbox.sendKeys(text);
	}

	public void Submit() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement submit = driver.findElement(By.cssSelector(getLocator(home_page_submit_button)));
		wait.until(ExpectedConditions.elementToBeClickable(submit));
		submit.click();
	}
}
