package Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day1 {

	@BeforeMethod
	public void BefoMeth() {
		System.out.println("Before Every Method XYZ");
		//Selenium
	}
	
	@AfterTest
	public void postRequisite() {
		System.out.println("I will execute last this line of code");
	}

	@AfterSuite
	public void AfterSuite() {
		System.out.println("After Suite #2");
	}
	
	@Test(groups= {"Smoke"}) //Adding test annotation to run test. 
	public void WebLoginCRM() {
		System.out.println("Web Login Works");
		//Selenium
	}

	@Test //Second Test case
	public void MobileLoginCRM() {
		System.out.println("MobileLoginCRM Works");
		//Appium 
	}
	
	@Test(groups= {"Smoke"}) //Third Test case
	public void LoginAPICRM() {
		//Rest API Automation
	}
	
	@BeforeTest
	public void preRequisite() {
		System.out.println("I will execute first this line of code");
	}

}
