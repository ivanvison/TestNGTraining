package Test;

import org.testng.annotations.Test;

public class day1 {

	@Test //Adding test annotation to run test. 
	public void WebLoginCRM() {
		System.out.println("Web Login Works");
		//Selenium
	}

	@Test //Second Test case
	public void MobileLoginCRM() {
		System.out.println("MobileLoginCRM Works");
		//Appium 
	}
	
	@Test //Third Test case
	public void LoginAPICRM() {
		//Rest API Automation
	}

}
