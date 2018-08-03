package Alation.com.Pages.Hooks;

import Alation.com.Pages.HomePage;
import Alation.com.Pages.Factory.DriverFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import junit.framework.Assert;

/*
 * This class will open and close the browser automatically,no need to mention in steps
 * */
public class Hooks extends DriverFactory {
	HomePage homePage = new HomePage();
	@SuppressWarnings("deprecation")
	/*
	 * This block will run once the execution started and before the first step in
	 * feature
	 */
	@Before
	public void openCustomerSite() throws Throwable {
		/*We can launch and quit the driver to extend this class to DriverFactory class*/
		 initializedriver();
		/* To check whether site is launched successfully used Assert */
		if (!homePage.isOpen()) {
			homePage.Open();
			/*
			 * Here this assert will check for boolean true, if the result is false this
			 * error message will display to the user
			 */
			Assert.assertTrue("The home page was not displayed.", homePage.waitUntilOpened());
		}
	}

	/*
	 * This block will run once the execution end and after the last step in feature
	 */
	@After
	public void closeDriver() throws Throwable {
		quit();
	}
}
