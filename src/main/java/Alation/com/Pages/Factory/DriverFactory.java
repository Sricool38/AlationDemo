package Alation.com.Pages.Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory extends ObjectFactory{

	protected static WebDriver driver;
	
	public  void initializedriver() {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/bin/chromedriver1/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public  void quit() {
		driver.close();
	}
}
